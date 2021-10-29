package com.accenture;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import com.accenture.entity.Transaction;
import com.accenture.validation.TransactionCodeValidator;

@SpringBootApplication
public class TransactionValidatorApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(TransactionValidatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TransactionValidatorApplication.class, args);
	}
	
	@Bean
	public Function<Message<Transaction>,Message<Transaction>> validate() {
			
		return message -> {
			
			Transaction transaction = message.getPayload();
			
			logger.info("Línea recibida: " + transaction.toString());
			
			addValidators(transaction);
			
			boolean ok = transaction.validate();	
			/*
			if (!ok) {
				throw new ValidationException();
			}
			*/
			return message;
		};
			
	}

	private void addValidators(Transaction t) {
		t.addValidator(new TransactionCodeValidator());
	}

}
