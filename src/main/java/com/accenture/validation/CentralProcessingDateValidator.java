package com.accenture.validation;

import com.accenture.entity.Transaction;


public class CentralProcessingDateValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        return true;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getCentralProcessingDate();
    }
}