package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TransactionComponentSequenceNumberValidator implements IValidation {

    @Override
    public boolean validate(Object value) {

        Integer transactionComponentSequenceNumber = (Integer) value;

        return transactionComponentSequenceNumber == 0;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getTransactionComponentSequenceNumber();
    }
}
