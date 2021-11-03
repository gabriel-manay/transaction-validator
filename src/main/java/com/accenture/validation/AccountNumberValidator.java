package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.repository.maestroRepository;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountNumberValidator implements IValidation {

    maestroRepository repository;

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
}
