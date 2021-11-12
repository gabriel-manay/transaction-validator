package com.accenture.validation;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidField;

import java.util.Objects;

public class POSEntryModeValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getPOSEntryMode(), "  ") ||
                Objects.equals(transaction.getPOSEntryMode(), "00") ||
                Objects.equals(transaction.getPOSEntryMode(), "01") ||
                Objects.equals(transaction.getPOSEntryMode(), "02") ||
                Objects.equals(transaction.getPOSEntryMode(), "03") ||
                Objects.equals(transaction.getPOSEntryMode(), "04") ||
                Objects.equals(transaction.getPOSEntryMode(), "05") ||
                Objects.equals(transaction.getPOSEntryMode(), "06") ||
                Objects.equals(transaction.getPOSEntryMode(), "07") ||
                Objects.equals(transaction.getPOSEntryMode(), "10") ||
                Objects.equals(transaction.getPOSEntryMode(), "90") ||
                Objects.equals(transaction.getPOSEntryMode(), "91") ||
                Objects.equals(transaction.getPOSEntryMode(), "95")
        ){
            return true;
        }
        transaction.addInvalidFieldError("Invalid POS Entry Mode");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getPOSEntryMode();
    }
}
