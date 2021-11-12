package com.accenture.validation;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidAccountNumber;
import com.accenture.errorHandling.InvalidField;
import com.accenture.service.ICardService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountNumberValidator implements IValidation {

	@Autowired
	ICardService cardService;
	
    @Override
    public boolean validate(Object value) {

        String accountNumber = (String) value;
        accountNumber.substring(0, 5);
        return true;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAccountNumber();
    }

    @Override
    public InvalidField getInvalidField() {
        return new InvalidAccountNumber();
    }
}
