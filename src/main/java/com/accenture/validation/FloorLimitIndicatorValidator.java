package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

import java.util.Objects;

public class FloorLimitIndicatorValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getFloorLimitIndicator(), " ") ||
                Objects.equals(transaction.getFloorLimitIndicator(), "I") ||
                Objects.equals(transaction.getFloorLimitIndicator(), "Z") ||
                Objects.equals(transaction.getFloorLimitIndicator(), "A") ||
                Objects.equals(transaction.getFloorLimitIndicator(), "B") ||
                Objects.equals(transaction.getFloorLimitIndicator(), "C") ||
                Objects.equals(transaction.getFloorLimitIndicator(), "D")
        ){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Floor Limit Indicator");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getFloorLimitIndicator();
    }
}
