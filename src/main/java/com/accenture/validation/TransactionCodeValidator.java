package com.accenture.validation;

import com.accenture.entity.Transaction;

public class TransactionCodeValidator implements IValidation {

	@Override
	public boolean validate(Object value) {
		// TODO Auto-generated method stub
		Integer transactionCode = (Integer) value;
		return false;
	}

	@Override
	public Object getAttribute(Transaction transaction) {
		return transaction.getTransactionCode();
	}

}
