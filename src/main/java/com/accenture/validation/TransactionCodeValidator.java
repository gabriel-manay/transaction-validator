package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;
import com.accenture.errorHandling.InvalidTransactionCode;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TransactionCodeValidator implements IValidation {

	@Override
	public boolean validate(Object value) {
		Integer transactionCode= (Integer) value;
		return transactionCode == 5 | transactionCode == 6 | transactionCode == 8;
	}

	@Override
	public Object getAttribute(Transaction transaction) {
		return transaction.getTransactionCode();
	}

	@Override
	public InvalidField getInvalidField() {
		return new InvalidTransactionCode();
	}

}
