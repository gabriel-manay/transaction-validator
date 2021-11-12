package com.accenture.validation;

import com.accenture.entity.Transaction;


public class AuthorizationCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        //TO DO
        return true;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAuthorizationCode();
    }
}
