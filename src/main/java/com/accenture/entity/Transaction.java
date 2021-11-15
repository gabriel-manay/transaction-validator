package com.accenture.entity;

import java.util.ArrayList;
import java.util.List;

import com.accenture.validation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Transaction {

	private List<IValidation> validations;
	private List<String> invalidFields;

	private String transactionCode; // 1-2
	private String transactionCodeQualifier; // 3
	private String transactionComponentSequenceNumber; // 4
	private String accountNumber; // 5-20
	private String accountNumberExtension; // 21-23
	private String floorLimitIndicator; // 24
	private String crbExceptionFileIndicator; // 25
	private String PCASIndicator; // 26
	private String acquirerReferenceNumber; // 27-49
	private String acquirersBusinessID; // 50-57
	private String purchaseDate; // 58-61
	private String destinationAmount; // 62-73
	private String destinationCurrencyCode; // 74-76
	private String sourceAmount; // 77-88
	private String sourceCurrencyCode; // 89-91
	private String merchantName; // 92-116
	private String merchantCity; // 117-129
	private String merchantCountryCode; // 130-132
	private String merchantCategoryCode; // 133-136
	private String merchantZIPCode; // 137-141
	private String merchantStateProvinceCode; // 142-144
	private String requestedPaymentService; // 145
	private String numberOfPaymentForms; // 146
	private String usageCode; // 147
	private String reasonCode; // 148-149
	private String settlementFlag; // 150
	private String authorizationCharacteristicsIndicator; // 151
	private String authorizationCode; // 125-157
	private String POSTerminalCapability; // 158
	private String reserved; // 159
	private String cardholderIDMethod; // 160
	private String collectionOnlyFlag; // 161
	private String POSEntryMode; // 162-163
	private String centralProcessingDate; // 164-167
	private String reimbursementAttribute; // 168
	
	public Transaction() {
		this.validations = new ArrayList<IValidation>();
		this.invalidFields = new ArrayList<String>();

		/*validations.add(new AccountNumberExtensionValidator());
		validations.add(new AccountNumberValidator());
		validations.add(new AcquirerBusinessIdValidator());
		validations.add(new AcquirerReferenceNumberIndicatorValidator());
		validations.add(new AuthorizationCharacteristicsIndicatorValidator());
		validations.add(new AuthorizationCodeValidator());
		validations.add(new CardholderIdMethodValidator());
		validations.add(new CBRExceptionFileIndicator());
		validations.add(new CentralProcessingDateValidator());
		validations.add(new CollectionOnlyFlagValidator());
		validations.add(new DestinationAmountValidator());
		validations.add(new DestinationCurrencyCodeValidator());
		validations.add(new FloorLimitIndicatorValidator());
		validations.add(new MerchantCategoryCodeValidator());
		validations.add(new MerchantCityValidator());
		validations.add(new MerchantCountryCodeValidator());
		validations.add(new MerchantNameValidator());
		validations.add(new MerchantStateProvinceCode());
		validations.add(new MerchantZIPCodeValidator());
		validations.add(new NumberOfPaymentFormsValidator());
		validations.add(new PCASIndicatorValidator());
		validations.add(new POSEntryModeValidator());
		validations.add(new POSTerminalCapabilityValidator());
		validations.add(new PurchaseDateValidator());
		validations.add(new ReasonCodeValidator());
		validations.add(new ReimbursementAttributeValidator());
		validations.add(new RequestedPaymentServiceValidator());
		validations.add(new SettlementFlagValidator());
		validations.add(new SourceAmountValidator());
		validations.add(new SourceCurrencyCodeValidator());
		validations.add(new TransactionCodeQualifierValidator());
		validations.add(new TransactionCodeValidator());
		validations.add(new TransactionComponentSequenceNumberValidator());
		validations.add(new UsageCodeValidator());*/
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public List<IValidation> getValidations() {
		return validations;
	}

	public void setValidations(List<IValidation> validations) {
		this.validations = validations;
	}

	public List<String> getInvalidFields() {
		return invalidFields;
	}

	public void setInvalidFields(List<String> invalidFields) {
		this.invalidFields = invalidFields;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransactionCodeQualifier() {
		return transactionCodeQualifier;
	}

	public void setTransactionCodeQualifier(String transactionCodeQualifier) {
		this.transactionCodeQualifier = transactionCodeQualifier;
	}

	public String getTransactionComponentSequenceNumber() {
		return transactionComponentSequenceNumber;
	}

	public void setTransactionComponentSequenceNumber(String transactionComponentSequenceNumber) {
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumberExtension() {
		return accountNumberExtension;
	}

	public void setAccountNumberExtension(String accountNumberExtension) {
		this.accountNumberExtension = accountNumberExtension;
	}

	public String getFloorLimitIndicator() {
		return floorLimitIndicator;
	}

	public void setFloorLimitIndicator(String floorLimitIndicator) {
		this.floorLimitIndicator = floorLimitIndicator;
	}

	public String getCrbExceptionFileIndicator() {
		return crbExceptionFileIndicator;
	}

	public void setCrbExceptionFileIndicator(String crbExceptionFileIndicator) {
		this.crbExceptionFileIndicator = crbExceptionFileIndicator;
	}

	public String getPCASIndicator() {
		return PCASIndicator;
	}

	public void setPCASIndicator(String pCASIndicator) {
		PCASIndicator = pCASIndicator;
	}

	public String getAcquirerReferenceNumber() {
		return acquirerReferenceNumber;
	}

	public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
		this.acquirerReferenceNumber = acquirerReferenceNumber;
	}

	public String getAcquirersBusinessID() {
		return acquirersBusinessID;
	}

	public void setAcquirersBusinessID(String acquirersBusinessID) {
		this.acquirersBusinessID = acquirersBusinessID;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getDestinationAmount() {
		return destinationAmount;
	}

	public void setDestinationAmount(String destinationAmount) {
		this.destinationAmount = destinationAmount;
	}

	public String getDestinationCurrencyCode() {
		return destinationCurrencyCode;
	}

	public void setDestinationCurrencyCode(String destinationCurrencyCode) {
		this.destinationCurrencyCode = destinationCurrencyCode;
	}

	public String getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(String sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}

	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}

	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getMerchantZIPCode() {
		return merchantZIPCode;
	}

	public void setMerchantZIPCode(String merchantZIPCode) {
		this.merchantZIPCode = merchantZIPCode;
	}

	public String getMerchantStateProvinceCode() {
		return merchantStateProvinceCode;
	}

	public void setMerchantStateProvinceCode(String merchantStateProvinceCode) {
		this.merchantStateProvinceCode = merchantStateProvinceCode;
	}

	public String getRequestedPaymentService() {
		return requestedPaymentService;
	}

	public void setRequestedPaymentService(String requestedPaymentService) {
		this.requestedPaymentService = requestedPaymentService;
	}

	public String getNumberOfPaymentForms() {
		return numberOfPaymentForms;
	}

	public void setNumberOfPaymentForms(String numberOfPaymentForms) {
		this.numberOfPaymentForms = numberOfPaymentForms;
	}

	public String getUsageCode() {
		return usageCode;
	}

	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getSettlementFlag() {
		return settlementFlag;
	}

	public void setSettlementFlag(String settlementFlag) {
		this.settlementFlag = settlementFlag;
	}

	public String getAuthorizationCharacteristicsIndicator() {
		return authorizationCharacteristicsIndicator;
	}

	public void setAuthorizationCharacteristicsIndicator(String authorizationCharacteristicsIndicator) {
		this.authorizationCharacteristicsIndicator = authorizationCharacteristicsIndicator;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getPOSTerminalCapability() {
		return POSTerminalCapability;
	}

	public void setPOSTerminalCapability(String pOSTerminalCapability) {
		POSTerminalCapability = pOSTerminalCapability;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getCardholderIDMethod() {
		return cardholderIDMethod;
	}

	public void setCardholderIDMethod(String cardholderIDMethod) {
		this.cardholderIDMethod = cardholderIDMethod;
	}

	public String getCollectionOnlyFlag() {
		return collectionOnlyFlag;
	}

	public void setCollectionOnlyFlag(String collectionOnlyFlag) {
		this.collectionOnlyFlag = collectionOnlyFlag;
	}

	public String getPOSEntryMode() {
		return POSEntryMode;
	}

	public void setPOSEntryMode(String pOSEntryMode) {
		POSEntryMode = pOSEntryMode;
	}

	public String getCentralProcessingDate() {
		return centralProcessingDate;
	}

	public void setCentralProcessingDate(String centralProcessingDate) {
		this.centralProcessingDate = centralProcessingDate;
	}

	public String getReimbursementAttribute() {
		return reimbursementAttribute;
	}

	public void setReimbursementAttribute(String reimbursementAttribute) {
		this.reimbursementAttribute = reimbursementAttribute;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public String toString() {
		return "Transaction [transactionCode=" + transactionCode + ", transactionCodeQualifier="
				+ transactionCodeQualifier + ", transactionComponentSequenceNumber="
				+ transactionComponentSequenceNumber + ", accountNumber=" + accountNumber + ", accountNumberExtension="
				+ accountNumberExtension + ", floorLimitIndicator=" + floorLimitIndicator
				+ ", crbExceptionFileIndicator=" + crbExceptionFileIndicator + ", PCASIndicator=" + PCASIndicator
				+ ", acquirerReferenceNumber=" + acquirerReferenceNumber + ", acquirersBusinessID="
				+ acquirersBusinessID + ", purchaseDate=" + purchaseDate + ", destinationAmount=" + destinationAmount
				+ ", destinationCurrencyCode=" + destinationCurrencyCode + ", sourceAmount=" + sourceAmount
				+ ", sourceCurrencyCode=" + sourceCurrencyCode + ", merchantName=" + merchantName + ", merchantCity="
				+ merchantCity + ", merchantCountryCode=" + merchantCountryCode + ", merchantCategoryCode="
				+ merchantCategoryCode + ", merchantZIPCode=" + merchantZIPCode + ", merchantStateProvinceCode="
				+ merchantStateProvinceCode + ", requestedPaymentService=" + requestedPaymentService
				+ ", numberOfPaymentForms=" + numberOfPaymentForms + ", usageCode=" + usageCode + ", reasonCode="
				+ reasonCode + ", settlementFlag=" + settlementFlag + ", authorizationCharacteristicsIndicator="
				+ authorizationCharacteristicsIndicator + ", authorizationCode=" + authorizationCode
				+ ", POSTerminalCapability=" + POSTerminalCapability + ", reserved=" + reserved
				+ ", cardholderIDMethod=" + cardholderIDMethod + ", collectionOnlyFlag=" + collectionOnlyFlag
				+ ", POSEntryMode=" + POSEntryMode + ", centralProcessingDate=" + centralProcessingDate
				+ ", reimbursementAttribute=" + reimbursementAttribute + "]";
	}

	public void addValidator(IValidation validator) {
		this.getValidations().add(validator);
	}

	public void addInvalidFieldError(String error) {
		this.getInvalidFields().add(error);
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
