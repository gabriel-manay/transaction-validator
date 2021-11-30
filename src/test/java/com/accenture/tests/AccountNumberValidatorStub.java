package com.accenture.tests;

import com.accenture.entity.Transaction;
import com.accenture.validation.IValidation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccountNumberValidatorStub implements IValidation {

    CardServiceStub cardServiceStub = new CardServiceStub();

    private Logger logger = LoggerFactory.getLogger(AccountNumberValidatorStub.class);
	
    @Override
    public boolean validate(Transaction transaction, Object value) {

        String accountNumber = transaction.getAccountNumber();
        String bin = accountNumber.substring(0, 6);
        
        logger.info(">>>>>>>>>>> Se realiza validacion de BIN: {}",bin);

        //	TODO añadir manejo de error
        if (cardServiceStub.getCardByBIN(bin) != null) {
            return true;
        }
        //	TODO cargar error de tabla maestra de errores
        transaction.addInvalidFieldError("Invalid Account Number");
        return false;
    }

    public boolean validate2(Transaction transaction, Object value) {

        String accountNumber = transaction.getAccountNumber();
        String bin = accountNumber.substring(0, 6);

        logger.info(">>>>>>>>>>> Se realiza validacion de BIN: {}",bin);

        //	TODO añadir manejo de error
        if (cardServiceStub.getCardByBIN2(bin) != null) {
            return true;
        }
        //	TODO cargar error de tabla maestra de errores
        transaction.addInvalidFieldError("Invalid Account Number");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAccountNumber();
    }
}
