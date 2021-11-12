package com.accenture.validation;

import org.springframework.beans.factory.annotation.Autowired;

import com.accenture.entity.Transaction;
import com.accenture.errorHandling.InvalidAccountNumber;
import com.accenture.errorHandling.InvalidField;
import com.accenture.service.ICardService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountNumberValidator implements IValidation {

	@Autowired
	ICardService cardService;
	
    @Override
    public boolean validate(Transaction transaction, Object value) {

        String accountNumber = (String) value;
        Integer bin = Integer.parseInt(accountNumber.substring(0, 5));
        
        //	TODO añadir manejo de error
        if (cardService.getCardByBIN(bin) == null) {
        	//	TODO cargar error de tabla maestra de errores
        	transaction.addInvalidFieldError("Invalid Account Number");
            return false;
        }
        return true;
    }

    @Override
    public Object getAttribute(Transaction transaction) {
        return transaction.getAccountNumber();
    }
}
