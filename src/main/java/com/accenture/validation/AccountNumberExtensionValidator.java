package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountNumberExtensionValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
       if(Objects.equals(transaction.getAccountNumberExtension(), "000")){
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
