package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TransactionComponentSequenceNumberValidator implements IValidation {

    @Override
    public boolean validate(Transaction transaction, Object value) {

        Integer transactionComponentSequenceNumber = (Integer) value;

        //Por ahora sólo se trabaja la línea TCR 00 de cada transacción (Existe 00 - 07)
        if(transactionComponentSequenceNumber == 0){
            return true;
        }

        transaction.addInvalidFieldError("Invalid Transaction Component Sequence Number");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getTransactionComponentSequenceNumber();
    }

}
