package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

public interface IValidation {

	public boolean validate(Object value);

	public Object getAttribute(Transaction transaction);

	public InvalidField getInvalidField();
}
