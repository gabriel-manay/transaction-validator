package com.accenture;

import com.accenture.entity.Transaction;
import com.accenture.validation.*;
import com.accenture.tests.AccountNumberValidatorStub;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TransactionsValidatorsTest {

    Transaction transaction = new Transaction("3242", "NNNNNN", "03324",
            "00000000000", "111", "sdfsf", "3242",
            "fddffs", "werw", "sdfsfsd", "12321",
            "werwer", "324", "0", "!",
            "09878", "21412", "21421", "w3422",
            "ar", "3242", "we23", "3243",
            "234243", "#$32", "324", "", "2342",
            "werw", "94849", "werw", "2342", "3242",
            "3532", "342");

    Transaction t = new Transaction("06", "0", "00",
            "111111111", "000", "A", "3242",
            "N", "werw", "sdfsfsd", "082021",
            "werwer", "032", "32420", "032",
            "HILTON", "ORLANDO", "US", "3422",
            "ar", "3242", "9", "3",
            "1", "00", "3", "X", "23",
            "5", "", "2", "C", "90",
            "1121", "A");

    @Test
    public void AccountNumberExtensionValidatorTest_False() {

        AccountNumberExtensionValidator validator = new AccountNumberExtensionValidator();
        Boolean result = validator.validate(transaction, transaction.getAccountNumberExtension());
        assertThat(result, is(false));
    }

    @Test
    public void AccountNumberExtensionValidatorTest_True() {

        AccountNumberExtensionValidator validator = new AccountNumberExtensionValidator();
        Boolean result = validator.validate(t, t.getAccountNumberExtension());
        assertThat(result, is(true));
    }

    @Test
    public void AccountNumberValidatorTest_True() {

            AccountNumberValidatorStub v = new AccountNumberValidatorStub();
            boolean result = v.validate(t, t.getAccountNumber());
            assertEquals(true, result);
    }

    @Test
    public void AccountNumberValidatorTest_False() {

        AccountNumberValidatorStub v = new AccountNumberValidatorStub();
        boolean result = v.validate2(transaction, transaction.getAccountNumber());
        assertEquals(false, result);
    }

    @Test
    public void AuthorizationCharacteristicsIndicatorValidatorTest_True() {

        AuthorizationCharacteristicsIndicatorValidator a =
                new AuthorizationCharacteristicsIndicatorValidator();
        boolean result = a.validate(t, t.getAuthorizationCharacteristicsIndicator());
        assertEquals(true, result);
    }

    @Test
    public void AuthorizationCharacteristicsIndicatorValidatorTest_False() {

        AuthorizationCharacteristicsIndicatorValidator a =
                new AuthorizationCharacteristicsIndicatorValidator();
        boolean result = a.validate(transaction, transaction.getAuthorizationCharacteristicsIndicator());
        assertEquals(false, result);
    }

    @Test
    public void CardholderIdMethodValidatorTest_True(){
        CardholderIdMethodValidator c = new CardholderIdMethodValidator();
        boolean result = c.validate(t, t.getCardholderIDMethod());
        assertThat(result, is(true));
    }

    @Test
    public void CardholderIdMethodValidatorTest_False(){
        CardholderIdMethodValidator c = new CardholderIdMethodValidator();
        boolean result = c.validate(transaction, transaction.getCardholderIDMethod());
        assertThat(result, is(false));
    }

    @Test
    public void CollectionOnlyFlagValidatorTest_True(){
        CollectionOnlyFlagValidator c = new CollectionOnlyFlagValidator();
        boolean result = c.validate(t, t.getCollectionOnlyFlag());
        assertThat(result, is(true));
    }

    @Test
    public void CollectionOnlyFlagValidatorTest_False(){
        CollectionOnlyFlagValidator c = new CollectionOnlyFlagValidator();
        boolean result = c.validate(transaction, transaction.getCollectionOnlyFlag());
        assertThat(result, is(false));
    }

    @Test
    public void DestinationCurrencyCodeValidatorTest_True(){
        DestinationCurrencyCodeValidator d = new DestinationCurrencyCodeValidator();
        boolean result = d.validate(t, t.getDestinationCurrencyCode());
        assertEquals(true, result);
    }

    @Test
    public void DestinationCurrencyCodeValidatorTest_False(){
        DestinationCurrencyCodeValidator d = new DestinationCurrencyCodeValidator();
        boolean result = d.validate(transaction, transaction.getDestinationCurrencyCode());
        assertEquals(false, result);
    }

    @Test
    public void FloorLimitIndicatorValidatorTest_True(){
        FloorLimitIndicatorValidator d = new FloorLimitIndicatorValidator();
        boolean result = d.validate(t, t.getFloorLimitIndicator());
        assertEquals(true, result);
    }

    @Test
    public void FloorLimitIndicatorValidatorTest_False(){
        FloorLimitIndicatorValidator d = new FloorLimitIndicatorValidator();
        boolean result = d.validate(transaction, transaction.getFloorLimitIndicator());
        assertThat(result, is( false));
    }

    @Test
    public void NumberOfPaymentFormsValidatorTest_True(){
        NumberOfPaymentFormsValidator n = new NumberOfPaymentFormsValidator();
        boolean result = n.validate(t, t.getNumberOfPaymentForms());
        assertEquals(true, result);
    }

    @Test
    public void NumberOfPaymentFormsValidatorTest_False(){
        NumberOfPaymentFormsValidator n = new NumberOfPaymentFormsValidator();
        boolean result = n.validate(transaction, transaction.getNumberOfPaymentForms());
        assertEquals(false, result);
    }

    @Test
    public void PCASIndicatorValidatorTest_True(){
        PCASIndicatorValidator p = new PCASIndicatorValidator();
        boolean result = p.validate(t, t.getPCASIndicator());
        assertThat(result, is (true));
    }

    @Test
    public void PCASIndicatorValidatorTest_False(){
        PCASIndicatorValidator p = new PCASIndicatorValidator();
        boolean result = p.validate(transaction, transaction.getPCASIndicator());
        assertThat(result, is (false));
    }

    @Test
    public void POSEntryModeValidatorTest_True(){
        POSEntryModeValidator p = new POSEntryModeValidator();
        boolean result = p.validate(t, t.getPOSEntryMode());
        assertEquals(true,result);
    }

    @Test
    public void POSEntryModeValidatorTest_False(){
        POSEntryModeValidator p = new POSEntryModeValidator();
        boolean result = p.validate(transaction, transaction.getPOSEntryMode());
        assertEquals(false,result);
    }

    @Test
    public void POSTerminalCapabilityValidatorTest_True(){
        POSTerminalCapabilityValidator p = new POSTerminalCapabilityValidator();
        boolean result = p.validate(t, t.getPOSTerminalCapability());
        assertEquals(true,result);
    }
    @Test
    public void POSTerminalCapabilityValidatorTest_False(){
        POSTerminalCapabilityValidator p = new POSTerminalCapabilityValidator();
        boolean result = p.validate(transaction, transaction.getPOSTerminalCapability());
        assertEquals(false,result);
    }

    @Test
    public void ReasonCodeValidatorTest_True(){
        ReasonCodeValidator r = new ReasonCodeValidator();
        boolean result = r.validate(t, t.getReasonCode());
        assertThat(result, is (true));
    }

    @Test
    public void ReasonCodeValidatorTest_False(){
        ReasonCodeValidator r = new ReasonCodeValidator();
        boolean result = r.validate(transaction, transaction.getReasonCode());
        assertThat(result, is (false));
    }

    @Test
    public void ReimbursementAttributeValidatorTest_True(){
        ReimbursementAttributeValidator r = new ReimbursementAttributeValidator();
        boolean result = r.validate(t, t.getReimbursementAttribute());
        assertEquals(true,result);
    }

    @Test
    public void ReimbursementAttributeValidatorTest_False(){
        ReimbursementAttributeValidator r = new ReimbursementAttributeValidator();
        boolean result = r.validate(transaction, transaction.getReimbursementAttribute());
        assertEquals(false,result);
    }

    @Test
    public void RequestedPaymentServiceValidatorTest_True(){
        RequestedPaymentServiceValidator r = new RequestedPaymentServiceValidator();
        boolean result = r.validate(t, t.getRequestedPaymentService());
        assertThat(result, is (true));
   }

    @Test
    public void RequestedPaymentServiceValidatorTest_False(){
        RequestedPaymentServiceValidator r = new RequestedPaymentServiceValidator();
        boolean result = r.validate(transaction, transaction.getRequestedPaymentService());
        assertThat(result, is (false));
    }

    @Test
    public void SettlementFlagValidatorTest_True(){
        SettlementFlagValidator s = new SettlementFlagValidator();
        boolean result = s.validate(t, t.getSettlementFlag());
        assertEquals(true,result);
    }

    @Test
    public void SettlementFlagValidatorTest_False(){
        SettlementFlagValidator s = new SettlementFlagValidator();
        boolean result = s.validate(transaction, transaction.getSettlementFlag());
        assertEquals(false,result);
    }

    @Test
    public void SourceAmountValidatorTest_True(){
        SourceAmountValidator s = new SourceAmountValidator();
        boolean result = s.validate(t, t.getSourceAmount());
        assertThat(result, is(true));
    }

    @Test
    public void SourceAmountValidatorTest_False(){
        SourceAmountValidator s = new SourceAmountValidator();
        boolean result = s.validate(transaction, transaction.getSourceAmount());
        assertThat(result, is(false));
    }

    @Test
    public void SourceCurrencyCodeValidatorTest_True(){
        SourceCurrencyCodeValidator s = new SourceCurrencyCodeValidator();
        boolean result = s.validate(t, t.getSourceCurrencyCode());
        assertEquals(true, result);
    }

    @Test
    public void SourceCurrencyCodeValidatorTest_False(){
        SourceCurrencyCodeValidator s = new SourceCurrencyCodeValidator();
        boolean result = s.validate(transaction, transaction.getSourceCurrencyCode());
        assertEquals(false, result);
    }

    @Test
    public void TransactionCodeQualifierValidatorTest_True(){
        TransactionCodeQualifierValidator tr = new TransactionCodeQualifierValidator();
        boolean result = tr.validate(t, t.getTransactionCodeQualifier());
        assertThat(result, is(true));
    }

    @Test
    public void TransactionComponentSequenceNumberValidatorTest_True(){
        TransactionComponentSequenceNumberValidator tr = new TransactionComponentSequenceNumberValidator();
        boolean result = tr.validate(t, t.getTransactionComponentSequenceNumber());
        assertEquals(true, result);
    }
}
