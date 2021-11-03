package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TransactionCodeQualifierValidator implements IValidation {

    @Override
    public boolean validate(Object value) {

        Integer transactionCodeQualifier = (Integer) value;

        return transactionCodeQualifier == 0;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getTransactionCodeQualifier();
    }
}
