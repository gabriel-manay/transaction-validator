package com.accenture;

import java.util.function.Function;

import com.accenture.validation.*;
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

			if(transaction.getTransactionCode() != null){
				logger.info("Transaccion recibida: " + transaction.toString());
				transaction.addValidator(new AccountNumberExtensionValidator());
				transaction.addValidator(new AccountNumberValidator());
				transaction.addValidator(new AcquirerBusinessIdValidator());
				transaction.addValidator(new AcquirerReferenceNumberIndicatorValidator());
				transaction.addValidator(new AuthorizationCharacteristicsIndicatorValidator());
				transaction.addValidator(new AuthorizationCodeValidator());
				transaction.addValidator(new CardholderIdMethodValidator());
				transaction.addValidator(new CBRExceptionFileIndicator());
				transaction.addValidator(new CentralProcessingDateValidator());
				transaction.addValidator(new CollectionOnlyFlagValidator());
				transaction.addValidator(new DestinationAmountValidator());
				transaction.addValidator(new DestinationCurrencyCodeValidator());
				transaction.addValidator(new FloorLimitIndicatorValidator());
				transaction.addValidator(new MerchantCategoryCodeValidator());
				transaction.addValidator(new MerchantCityValidator());
				transaction.addValidator(new MerchantCountryCodeValidator());
				transaction.addValidator(new MerchantNameValidator());
				transaction.addValidator(new MerchantStateProvinceCode());
				transaction.addValidator(new MerchantZIPCodeValidator());
				transaction.addValidator(new NumberOfPaymentFormsValidator());
				transaction.addValidator(new PCASIndicatorValidator());
				transaction.addValidator(new POSEntryModeValidator());
				transaction.addValidator(new POSTerminalCapabilityValidator());
				transaction.addValidator(new PurchaseDateValidator());
				transaction.addValidator(new ReasonCodeValidator());
				transaction.addValidator(new ReimbursementAttributeValidator());
				transaction.addValidator(new RequestedPaymentServiceValidator());
				transaction.addValidator(new SettlementFlagValidator());
				transaction.addValidator(new SourceAmountValidator());
				transaction.addValidator(new SourceCurrencyCodeValidator());
				transaction.addValidator(new TransactionCodeQualifierValidator());
				transaction.addValidator(new TransactionCodeValidator());
				transaction.addValidator(new TransactionComponentSequenceNumberValidator());
				transaction.addValidator(new UsageCodeValidator());

				if (!transaction.isValid()) {
					logger.info("Account Number " + transaction.getAccountNumber());
					logger.info("########################## Transaccion erronea: " + transaction);
				}
			}
			return MessageBuilder.withPayload(transaction).build();
		};

	}

}
