package com.accenture.validation;

import com.accenture.entity.Transaction;


import java.util.Objects;

public class AuthorizationCharacteristicsIndicatorValidator implements IValidation {
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getAuthorizationCharacteristicsIndicator(), "N") ||
                Objects.equals(transaction.getAuthorizationCharacteristicsIndicator(), " ") ||
                Objects.equals(transaction.getAuthorizationCharacteristicsIndicator(), "T") ||
                Objects.equals(transaction.getAuthorizationCharacteristicsIndicator(), "E") ||
                Objects.equals(transaction.getAuthorizationCharacteristicsIndicator(), "X")
        ){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Authorization Characteristics Indicator");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAuthorizationCharacteristicsIndicator();
    }
}
