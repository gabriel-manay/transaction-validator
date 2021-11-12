package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;
import com.accenture.errorHandling.InvalidTransactionCodeQualifier;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TransactionCodeQualifierValidator implements IValidation {

    @Override
    public boolean validate(Transaction transaction, Object value) {

        Integer transactionCodeQualifier = (Integer) value;

        if(transactionCodeQualifier == 0){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Transaction Code Qualifier");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getTransactionCodeQualifier();
    }

    @Override
    public InvalidField getInvalidField() {
        return new InvalidTransactionCodeQualifier();
    }
}
