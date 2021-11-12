package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

public class PurchaseDateValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(transaction.getPurchaseDate() >= 1300){
            transaction.addInvalidFieldError("Invalid Purchase Date");
            return false;
        }
        return true;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getPurchaseDate();
    }
}
