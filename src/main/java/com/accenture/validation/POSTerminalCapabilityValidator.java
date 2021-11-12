package com.accenture.validation;

import com.accenture.entity.Transaction;


import java.util.Objects;

public class POSTerminalCapabilityValidator implements IValidation{
    @Override
    public boolean validate(Transaction transaction, Object object) {
        if(Objects.equals(transaction.getPOSTerminalCapability(), " ") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "0") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "1") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "2") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "3") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "4") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "5") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "8") ||
                Objects.equals(transaction.getPOSTerminalCapability(), "9")
        ){
            return true;
        }
        transaction.addInvalidFieldError("Invalid POS Terminal Capability");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getPOSTerminalCapability();
    }
}
