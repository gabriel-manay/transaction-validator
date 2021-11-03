package com.accenture.validation;

import com.accenture.entity.Transaction;

public interface IValidation {

	public boolean validate(Object value);

	public Object getAttribute(Transaction transaction);

}
