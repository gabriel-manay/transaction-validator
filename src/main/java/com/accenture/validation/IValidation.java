package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

public interface IValidation {

	public boolean validate(Transaction transaction, Object object);

	public Object getAttribute(Transaction transaction);

	public InvalidField getInvalidField();
}
