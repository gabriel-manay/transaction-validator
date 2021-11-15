package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ReasonCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getReasonCode(), "00")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Reason Code");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getReasonCode();
    }
}
