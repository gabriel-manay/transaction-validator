package com.accenture.validation;

import com.accenture.entity.Transaction;


public interface IValidation {

	public boolean validate(Transaction transaction, Object object);

	public Object getAttribute(Transaction transaction);
}
