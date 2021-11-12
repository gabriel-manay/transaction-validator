package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

import java.util.Objects;

public class CardholderIdMethodValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getCardholderIDMethod(), " ") ||
                Objects.equals(transaction.getCardholderIDMethod(), "1") ||
                Objects.equals(transaction.getCardholderIDMethod(), "2") ||
                Objects.equals(transaction.getCardholderIDMethod(), "3") ||
                Objects.equals(transaction.getCardholderIDMethod(), "4")
        ){
            return true;
        }
        transaction.addInvalidFieldError("Invalid CardholderID Method");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getCardholderIDMethod();
    }
}
