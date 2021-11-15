package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class SettlementFlagValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getSettlementFlag(), "0") || Objects.equals(transaction.getSettlementFlag(), "3") || Objects.equals(transaction.getSettlementFlag(), "8") || Objects.equals(transaction.getSettlementFlag(), "9")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Settlement Flag");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getSettlementFlag();
    }
}
