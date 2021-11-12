package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

public class SourceAmountValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(transaction.getSourceAmount() <= 10000000 || transaction.getSourceAmount() > 0){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Source Amount");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getSourceAmount();
    }
}
