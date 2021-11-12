package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

public class AccountNumberExtensionValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(transaction.getAccountNumberExtension() == 0){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Account Number Extension");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAccountNumberExtension();
    }

}
