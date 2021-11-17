package com.accenture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import com.accenture.entity.Transaction;
import com.accenture.validation.AccountNumberValidator;
import com.accenture.validation.IValidation;

@SpringBootApplication
@ComponentScan(basePackages = "com.accenture.validation")
public class TransactionValidatorApplication {

	private static final Logger logger = LoggerFactory.getLogger(TransactionValidatorApplication.class);
	
	@Autowired
	private AccountNumberValidator accountNumberValidator;
	
	private List<IValidation> validations;
	
	public static void main(String[] args) {
		SpringApplication.run(TransactionValidatorApplication.class, args);
	}

	@Bean
	public Function<Message<Transaction>, Message<Transaction>> validate() {

		validations = new ArrayList<IValidation>();
		validations.add(accountNumberValidator);
		
		logger.info("############################# VALIDACIONES: {}",validations.toString());
		
		return message -> {
			Transaction transaction = (Transaction) message.getPayload();

			if(!Objects.equals(transaction.getTransactionCode(), "AA")){
				if (isValidTransaction(transaction)) {

					logger.info("Transaccion recibida: " + transaction.toString());

					//transaction.setValid("Valid");

					if (!transaction.isValid(validations)) {
						transaction.setValid("Invalid");
						logger.info("Account Number " + transaction.getAccountNumber());
						logger.info("########################## Transaccion erronea: " + transaction);
					}else{
						transaction.setValid("Valid");
					}
				}
			};
			return MessageBuilder.withPayload(transaction).build();
		};
	}

	private boolean isValidTransaction(Transaction transaction) {
		return transaction.getTransactionCode() != null;
	}

}
