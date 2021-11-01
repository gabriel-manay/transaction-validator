package com.accenture.validation;

import com.accenture.entity.Transaction;

public class AccountNumberValidator implements IValidation {

	@Override
	public boolean validate(Object value) {
		String accountNumber = (String) value;
		return false;
	}

	@Override
	public Object getAttribute(Transaction transaction) {
		return transaction.getAccountNumber();
	}

}
