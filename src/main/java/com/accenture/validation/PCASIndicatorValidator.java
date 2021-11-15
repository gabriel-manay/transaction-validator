package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;


import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PCASIndicatorValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getPCASIndicator(), " ") || Objects.equals(transaction.getPCASIndicator(), "N")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid PCAS Indicator");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getPCASIndicator();
    }
}
