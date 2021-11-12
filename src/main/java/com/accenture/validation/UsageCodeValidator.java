package com.accenture.validation;

import com.accenture.entity.Transaction;

public class UsageCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(transaction.getUsageCode() == 1 || transaction.getUsageCode() == 9){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Usage Code");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getUsageCode();
    }
}
