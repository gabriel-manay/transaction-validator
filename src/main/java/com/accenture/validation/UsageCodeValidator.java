package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class UsageCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getUsageCode(), "1") || Objects.equals(transaction.getUsageCode(), "9")){
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
