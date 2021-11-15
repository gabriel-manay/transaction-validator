package com.accenture.validation;

import com.accenture.entity.Transaction;


public class ReasonCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
      /*  if(transaction.getReasonCode() == 0){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Reason Code");
        */return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getReasonCode();
    }
}
