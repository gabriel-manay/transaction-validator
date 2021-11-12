package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

public class MerchantCategoryCodeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        return true;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getMerchantCategoryCode();
    }
}
