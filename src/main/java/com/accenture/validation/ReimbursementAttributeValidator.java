package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ReimbursementAttributeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(transaction.getReimbursementAttribute().matches("[A-Z0-9]")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Reimbursement Attribute");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getReimbursementAttribute();
    }
}
