package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class SourceAmountValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
       if(Integer.parseInt(transaction.getSourceAmount()) <= 10000000 && Integer.parseInt(transaction.getSourceAmount()) > 0){
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
