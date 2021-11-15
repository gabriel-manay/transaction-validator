package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DestinationCurrencyCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getSourceCurrencyCode(), "032") || Objects.equals(transaction.getSourceCurrencyCode(), "840")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Destination Currency Code");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getDestinationCurrencyCode();
    }

}
