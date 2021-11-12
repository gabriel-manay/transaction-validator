package com.accenture.validation;

import com.accenture.entity.Transaction;


import java.util.Objects;

public class SourceCurrencyCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getSourceCurrencyCode(), "032") || Objects.equals(transaction.getSourceCurrencyCode(), "840")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Source Currency Code");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getSourceCurrencyCode();
    }
}
