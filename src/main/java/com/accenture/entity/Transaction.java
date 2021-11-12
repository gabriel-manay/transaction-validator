package com.accenture.entity;

import java.util.ArrayList;
import java.util.List;

import com.accenture.validation.AccountNumberValidator;
import com.accenture.validation.IValidation;
import com.accenture.validation.TransactionCodeQualifierValidator;
import com.accenture.validation.TransactionCodeValidator;
import com.accenture.validation.TransactionComponentSequenceNumberValidator;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Transaction {

	private Integer transactionCode = 99; // 1-2
	private Integer transactionCodeQualifier = 9; // 3
	private Integer transactionComponentSequenceNumber = 9; // 4
	private String accountNumber = "0000000000000000"; // 5-20

	private List<IValidation> validations;
	private List<String> invalidFields;

	public Transaction() {
		validations.add(new TransactionCodeValidator());
		validations.add(new TransactionCodeQualifierValidator());
		validations.add(new TransactionComponentSequenceNumberValidator());
		validations.add(new AccountNumberValidator());
	}

	public Transaction(Integer transactionCode, Integer transactionCodeQualifier,
			Integer transactionComponentSequenceNumber, String accountNumber) {
		this.transactionCode = transactionCode;
		this.transactionCodeQualifier = transactionCodeQualifier;
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
		this.accountNumber = accountNumber;
		validations.add(new TransactionCodeValidator());
		validations.add(new TransactionCodeQualifierValidator());
		validations.add(new TransactionComponentSequenceNumberValidator());
		validations.add(new AccountNumberValidator());

		this.validations = new ArrayList<IValidation>();
		this.invalidFields = new ArrayList<String>();
	}

	public List<String> getInvalidFields() {
		return invalidFields;
	}

	public void setInvalidFields(List<String> invalidFields) {
		this.invalidFields = invalidFields;
	}

	public List<IValidation> getValidations() {
		return validations;
	}

	public void setValidations(List<IValidation> validations) {
		this.validations = validations;
	}

	public Integer getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}

	public Integer getTransactionCodeQualifier() {
		return transactionCodeQualifier;
	}

	public void setTransactionCodeQualifier(Integer transactionCodeQualifier) {
		this.transactionCodeQualifier = transactionCodeQualifier;
	}

	public Integer getTransactionComponentSequenceNumber() {
		return transactionComponentSequenceNumber;
	}

	public void setTransactionComponentSequenceNumber(Integer transactionComponentSequenceNumber) {
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void addValidator(IValidation validator) {
		this.getValidations().add(validator);
	}

	public void addInvalidFieldError(String error) {
		this.getInvalidFields().add(error);
	}

	@Override
	public String toString() {
		return transactionCode + "," + transactionCodeQualifier + "," + transactionComponentSequenceNumber + ","
				+ accountNumber;
	}

	private void validate() {
		for (IValidation iValidation : validations) {
			iValidation.validate(this, iValidation.getAttribute(this));
		}
	}

	public boolean isValid() {
		
		this.validate();
		
		return this.invalidFields.size() == 0;
	}

}
