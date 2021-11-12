package com.accenture.validation;

import com.accenture.entity.Transaction;


import java.util.Objects;

public class NumberOfPaymentFormsValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getNumberOfPaymentForms(), " ") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "1") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "2") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "3") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "4") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "5") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "6") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "7") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "8") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "9") ||
                Objects.equals(transaction.getNumberOfPaymentForms(), "+")
        ){
            return true;
        }
        transaction.addInvalidFieldError("Invalid Number of Payment Forms");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getNumberOfPaymentForms();
    }
}
