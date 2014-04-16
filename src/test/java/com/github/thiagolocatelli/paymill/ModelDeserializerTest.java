package com.github.thiagolocatelli.paymill;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.github.thiagolocatelli.paymill.bridge.TokenRequest;
import com.github.thiagolocatelli.paymill.model.Client;
import com.github.thiagolocatelli.paymill.model.ClientCollection;
import com.github.thiagolocatelli.paymill.model.Offer;
import com.github.thiagolocatelli.paymill.model.OfferCollection;
import com.github.thiagolocatelli.paymill.model.Payment;
import com.github.thiagolocatelli.paymill.model.PaymentCollection;
import com.github.thiagolocatelli.paymill.model.PreAuthorization;
import com.github.thiagolocatelli.paymill.model.PreAuthorizationCollection;
import com.github.thiagolocatelli.paymill.model.Refund;
import com.github.thiagolocatelli.paymill.model.RefundCollection;
import com.github.thiagolocatelli.paymill.model.Subscription;
import com.github.thiagolocatelli.paymill.model.SubscriptionCollection;
import com.github.thiagolocatelli.paymill.model.Transaction;
import com.github.thiagolocatelli.paymill.model.TransactionCollection;
import com.github.thiagolocatelli.paymill.model.Webhook;
import com.github.thiagolocatelli.paymill.model.WebhookCollection;
import com.github.thiagolocatelli.paymill.net.APIResource;
import com.github.thiagolocatelli.paymill.net.PaymillResponse;
import com.google.gson.Gson;

public class ModelDeserializerTest {

	private static Gson gson = APIResource.GSON;

	@Test
	public void deserializePayment() throws IOException {
		String json = resource("payment.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Payment payment = gson.fromJson(response.getData(), Payment.class);
		assertEquals(payment.getId(), "pay_3af44644dd6d25c820a8");
	}

	@Test
	public void deserializePaymentCollection() throws IOException {
		String json = resource("payments.json");
		PaymentCollection collection = gson.fromJson(json, PaymentCollection.class);
		assertEquals(collection.getDataCount(), new Integer(1));
	}

	@Test
	public void deserializePreAuthorization() throws IOException {
		String json = resource("preauthorization.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		PreAuthorization preauth = gson.fromJson(response.getData(), PreAuthorization.class);
		assertEquals(preauth.getId(), "preauth_31eb90495837447f76b7");
	}

	@Test
	public void deserializePreAuthorizationCollection() throws IOException {
		String json = resource("preauthorizations.json");
		PreAuthorizationCollection collection = gson.fromJson(json, PreAuthorizationCollection.class);
		assertEquals(collection.getDataCount(), new Integer(1));
	}
	
	@Test
	public void deserializeTransaction() throws IOException {
		String json = resource("transaction.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Transaction transaction = gson.fromJson(response.getData(), Transaction.class);
		assertEquals(transaction.getId(), "tran_023d3b5769321c649435");
	}

	@Test
	public void deserializeTransactionCollection() throws IOException {
		String json = resource("transactions.json");
		TransactionCollection collection = gson.fromJson(json, TransactionCollection.class);
		assertEquals(collection.getDataCount(), new Integer(2));
	}

	@Test
	public void deserializeRefund() throws IOException {
		String json = resource("refund.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Refund refund = gson.fromJson(response.getData(), Refund.class);
		assertEquals(refund.getId(), "refund_70392dc6a734a8233130");
	}

	@Test
	public void deserializeRefundCollection() throws IOException {
		String json = resource("refunds.json");
		RefundCollection collection = gson.fromJson(json, RefundCollection.class);
		assertEquals(collection.getDataCount(), new Integer(1));
	}
	
	@Test
	public void deserializeClient() throws IOException {
		String json = resource("client.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Client client = gson.fromJson(response.getData(), Client.class);
		assertEquals(client.getId(), "client_88a388d9dd48f86c3136");
	}

	@Test
	public void deserializeClientCollection() throws IOException {
		String json = resource("clients.json");
		ClientCollection collection = gson.fromJson(json, ClientCollection.class);
		assertEquals(collection.getDataCount(), new Integer(1));
	}	
	
	@Test
	public void deserializeOffer() throws IOException {
		String json = resource("offer.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Offer offer = gson.fromJson(response.getData(), Offer.class);
		assertEquals(offer.getId(), "offer_40237e20a7d5a231d99b");
		assertEquals(offer.getSubscriptionCount().getActive(), new Integer(3));
	}

	@Test
	public void deserializeOfferCollection() throws IOException {
		String json = resource("offers.json");
		OfferCollection collection = gson.fromJson(json, OfferCollection.class);
		assertEquals(collection.getDataCount(), new Integer(1));
	}
	
	@Test
	public void deserializeSubscription() throws IOException {
		String json = resource("subscription.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Subscription subscription = gson.fromJson(response.getData(), Subscription.class);
		assertEquals(subscription.getId(), "sub_dc180b755d10da324864");
	}

	@Test
	public void deserializeSubscriptionCollection() throws IOException {
		String json = resource("subscriptions.json");
		SubscriptionCollection collection = gson.fromJson(json, SubscriptionCollection.class);
		assertEquals(collection.getDataCount(), new Integer(1));
	}		
	
	@Test
	public void deserializeWebhook() throws IOException {
		String json = resource("webhook.json");
		PaymillResponse response = gson.fromJson(json, PaymillResponse.class);
		Webhook webhook = gson.fromJson(response.getData(), Webhook.class);
		assertEquals(webhook.getId(), "hook_40237e20a7d5a231d99b");
	}

	@Test
	public void deserializeWebhookCollection() throws IOException {
		String json = resource("webhooks.json");
		WebhookCollection webhookCollection = gson.fromJson(json, WebhookCollection.class);
		assertEquals(webhookCollection.getDataCount(), new Integer(2));
	}

	@Test
	public void deserializeToken() throws IOException {
		String json = resource("token.json");
		TokenRequest token = gson.fromJson(json, TokenRequest.class);
		assertEquals(token.getTransaction().getIdentification().getUniqueId(), "tok_3b6bce6d21ed67dc85c7");
	}		

	private String resource(String path) throws IOException {
		InputStream resource = getClass().getResourceAsStream(path);

		ByteArrayOutputStream os = new ByteArrayOutputStream(1024);
		byte[] buf = new byte[1024];

		for (int i = resource.read(buf); i > 0; i = resource.read(buf)) {
			os.write(buf, 0, i);
		}

		return os.toString("utf8");

	}
}
