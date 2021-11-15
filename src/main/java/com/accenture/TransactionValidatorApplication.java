package com.accenture;

import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import com.accenture.entity.Transaction;

@SpringBootApplication
public class TransactionValidatorApplication {

	private static final Logger logger = LoggerFactory.getLogger(TransactionValidatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TransactionValidatorApplication.class, args);
	}

	@Bean
	public Function<Message<Transaction>, Message<Transaction>> validate() {

		return message -> {

			Transaction transaction = (Transaction) message.getPayload();

			logger.info("Transaccion recibida: " + transaction.toString());

			if (!transaction.isValid()) {
				logger.info("########################## Transaccion erronea: " + transaction);
			}
			return MessageBuilder.withPayload(transaction).build();
		};

	}

}
