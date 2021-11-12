package com.accenture.validation;

import com.accenture.entity.Transaction;


public class DestinationCurrencyCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return null;
    }

}
