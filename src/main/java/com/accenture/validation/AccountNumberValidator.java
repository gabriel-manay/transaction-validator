package com.accenture.validation;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.accenture.entity.Transaction;
import com.accenture.service.ICardService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Component
@ComponentScan(basePackages = "com.accenture.service")
public class AccountNumberValidator implements IValidation {

	@Autowired
	ICardService cardService;

    private Logger logger = LoggerFactory.getLogger(AccountNumberValidator.class);
	
    @Override
    public boolean validate(Transaction transaction, Object value) {

        String accountNumber = transaction.getAccountNumber();
        String bin = accountNumber.substring(0, 6);
        
        logger.info(">>>>>>>>>>> Se realiza validacion de BIN: {}",bin);
        
        //	TODO añadir manejo de error
        if (cardService.getCardByBIN(bin) != null) {
        	//	TODO cargar error de tabla maestra de errores
        	return true;
        }
        transaction.addInvalidFieldError("Invalid Account Number");
        return false;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAccountNumber();
    }
}
