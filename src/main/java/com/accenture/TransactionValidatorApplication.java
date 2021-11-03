package com.accenture;

import java.util.Map;
import java.util.function.Function;

import com.accenture.validation.AccountNumberValidator;
import com.accenture.validation.TransactionCodeQualifierValidator;
import com.accenture.validation.TransactionComponentSequenceNumberValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import com.accenture.entity.Transaction;
import com.accenture.validation.TransactionCodeValidator;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class TransactionValidatorApplication {

	private static final Logger logger = LoggerFactory.getLogger(TransactionValidatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TransactionValidatorApplication.class, args);
	}

	@Bean
	public Function<Message<Map<String,String>>,Message<Transaction>> validate() {

		return message -> {

			//Transaction transaction = message.getPayload();
			/*String content = message.getPayload();
			String[] data = content.split(",");
			logger.info(content);
			Transaction transaction = new Transaction(
					Integer.parseInt(data[0]),
					Integer.parseInt(data[1]),
					Integer.parseInt(data[2]),
					data[3]
			);*/

			Map<String,String> content = message.getPayload();
			Transaction transaction = new Transaction(
					Integer.parseInt(content.get("transactionCode")),
					Integer.parseInt(content.get("transactionCodeQualifier")),
					Integer.parseInt(content.get("transactionComponentSequenceNumber")),
					content.get("accountNumber")
			);

			logger.info("Línea recibida: " + transaction);

			//addValidators(transaction);

			boolean ok = transaction.validate();

			if (!ok) {
				logger.info("Transacción errónea: " + transaction);
			}
			return MessageBuilder.withPayload(transaction).build();
		};

	}

	/*private void addValidators(Transaction t) {
		t.addValidator(new TransactionCodeValidator());
		t.addValidator(new TransactionCodeQualifierValidator());
		t.addValidator(new TransactionComponentSequenceNumberValidator());
		t.addValidator(new AccountNumberValidator());
	}*/

}
