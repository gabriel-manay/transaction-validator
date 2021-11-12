package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

import java.util.Objects;

public class CollectionOnlyFlagValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getCollectionOnlyFlag(), " ") || Objects.equals(transaction.getCollectionOnlyFlag(), "C")){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Collection Only Flag");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getCollectionOnlyFlag();
    }
}
