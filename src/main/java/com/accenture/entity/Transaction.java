package com.accenture.entity;

import java.util.ArrayList;
import java.util.List;

import com.accenture.validation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Transaction {

	private Integer transactionCode=99;	//1-2
	private Integer transactionCodeQualifier=9;	// 3
	private Integer transactionComponentSequenceNumber=9;	// 4
	private String accountNumber="0000000000000000";	// 5-20

	private List<IValidation> validations = new ArrayList<IValidation>();
	private List<String> invalidFields = new ArrayList<>();

	public Transaction() {
		validations.add(new TransactionCodeValidator());
		validations.add(new TransactionCodeQualifierValidator());
		validations.add(new TransactionComponentSequenceNumberValidator());
		validations.add(new AccountNumberValidator());
	}

	public Transaction(
			Integer transactionCode,
			Integer transactionCodeQualifier,
			Integer transactionComponentSequenceNumber,
			String accountNumber){
		this.transactionCode = transactionCode;
		this.transactionCodeQualifier = transactionCodeQualifier;
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
		this.accountNumber = accountNumber;
		validations.add(new TransactionCodeValidator());
		validations.add(new TransactionCodeQualifierValidator());
		validations.add(new TransactionComponentSequenceNumberValidator());
		validations.add(new AccountNumberValidator());
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

	/*@Override
	public String toString() {
		return "Transaction [transactionCode=" + transactionCode + ", transactionCodeQualifier="
				+ transactionCodeQualifier + ", transactionComponentSequenceNumber="
				+ transactionComponentSequenceNumber + ", accountNumber=" + accountNumber + "]";
	}*/

	@Override
	public String toString(){
		return transactionCode + ","
				+ transactionCodeQualifier+ ","
				+ transactionComponentSequenceNumber + ","
				+ accountNumber;
	}

	public boolean validate() {
		for (IValidation iValidation : validations) {
			if(!iValidation.validate(iValidation.getAttribute(this))){
				this.invalidFields.add(iValidation.getInvalidField().message());
			};
		}
		return this.invalidFields.size() == 0;
	}


}
