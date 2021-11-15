package com.accenture.validation;

import com.accenture.entity.Transaction;


public class SettlementFlagValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        /*if(transaction.getSettlementFlag() == 0 || transaction.getSettlementFlag() == 3 || transaction.getSettlementFlag() == 8 || transaction.getSettlementFlag() == 9){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Settlement Flag");
        */return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getSettlementFlag();
    }
}
