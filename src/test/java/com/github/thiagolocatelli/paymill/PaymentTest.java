package com.github.thiagolocatelli.paymill;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

import com.github.thiagolocatelli.paymill.exception.PaymillException;
import com.github.thiagolocatelli.paymill.model.Bridge;
import com.github.thiagolocatelli.paymill.model.Payment;

public class PaymentTest {
	
	private static String PublishableKey = "01417159439a5f194a1b0a1fe04a1849";
	private static HashMap<String, Object> cardParams;
	private static HashMap<String, Object> bankParams;
	private static HashMap<String, Object> ibanParams;

	@BeforeClass
	public static void beforeClass() {	
		Paymill.apiKey = "500260567449523bea3ab30829b7f392";
		
		cardParams = new HashMap<String, Object>();
		cardParams.put("account.number", "4111111111111111");
		cardParams.put("account.expiry.month", "12");
		cardParams.put("account.expiry.year", "2015");
		cardParams.put("account.verification", "111");
		cardParams.put("account.holder", "John Doe");
		
		bankParams = new HashMap<String, Object>();
		bankParams.put("account.number", "2015");
		bankParams.put("account.bank", "111");
		bankParams.put("account.holder", "John Doe");
		
		ibanParams = new HashMap<String, Object>();
		ibanParams.put("account.iban", "2015");
		ibanParams.put("account.bic", "111");
		ibanParams.put("account.holder", "John Doe");
		
	}	
	
	@Test
	public void testCreateCreditCardPayment() throws PaymillException {
		String token = Bridge.create(PublishableKey, cardParams);
		Payment payment = Payment.createWithToken(token);
		assertThat(payment.getId(), notNullValue());
	}
	
	@Test
	public void testCreateCreditCardPaymentWithClient() throws PaymillException {
		String token = Bridge.create(PublishableKey, cardParams);
		Payment payment = Payment.createWithTokenAndClient(token, null);
		assertThat(payment.getId(), notNullValue());
	}
	
	@Test
	public void testCreateDebitPayment() throws PaymillException {
		String token = Bridge.create(PublishableKey, bankParams);
		Payment payment = Payment.createWithToken(token);
		assertThat(payment.getId(), notNullValue());
	}
	
	@Test
	public void testCreateDebitPaymentWithClient() throws PaymillException {
		String token = Bridge.create(PublishableKey, bankParams);
		Payment payment = Payment.createWithTokenAndClient(token, null);
		assertThat(payment.getId(), notNullValue());
	}
	
	@Test
	public void testCreateIbanPayment() throws PaymillException {
		String token = Bridge.create(PublishableKey, ibanParams);
		Payment payment = Payment.createWithToken(token);
		assertThat(payment.getId(), notNullValue());
	}
	
	@Test
	public void testCreateIbanPaymentWithClient() throws PaymillException {
		String token = Bridge.create(PublishableKey, ibanParams);
		Payment payment = Payment.createWithTokenAndClient(token, null);
		assertThat(payment.getId(), notNullValue());
	}

}
