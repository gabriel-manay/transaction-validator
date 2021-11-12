package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

import java.util.Objects;

public class RequestedPaymentServiceValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getRequestedPaymentService(), " ") || Objects.equals(transaction.getRequestedPaymentService(), "9")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Requested Payment Service");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getRequestedPaymentService();
    }
}
