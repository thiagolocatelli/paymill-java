package com.github.thiagolocatelli.paymill;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.github.thiagolocatelli.paymill.exception.PaymillException;
import com.github.thiagolocatelli.paymill.model.Webhook;

public class WebhookTest {

	private static List<String> types = new ArrayList<String>();
	private static List<String> new_types = new ArrayList<String>();
	private static List<String> webhooks = new ArrayList<String>();
	
	@BeforeClass
	public static void beforeClass() throws PaymillException {	
		Paymill.apiKey = "500260567449523bea3ab30829b7f392";
		
		types.add("chargeback.executed");
		types.add("subscription.created");
		types.add("subscription.updated");
		types.add("subscription.deleted");
		types.add("subscription.succeeded");
		types.add("subscription.failed");
		types.add("transaction.created");
		types.add("transaction.succeeded");
		types.add("transaction.failed");
		types.add("refund.created");
		types.add("refund.succeeded");
		types.add("refund.failed");
		types.add("payout.transferred");
		types.add("invoice.available");
		types.add("app.merchant.activated");
		types.add("app.merchant.deactivated");
		types.add("app.merchant.rejected");
		types.add("app.merchant.app.disabled");
		types.add("client.updated");
		types.add("payment.expired");
		
		new_types.add("chargeback.executed");
		new_types.add("subscription.created");
		new_types.add("subscription.updated");
		new_types.add("subscription.deleted");
		
	}	
	
	@AfterClass
	public static void afterClass() throws PaymillException {
		
		for(String webhookId : webhooks) {
			Webhook webhook = Webhook.retrieve(webhookId);
			webhook.delete();
		}
		
	}
	
	@Test
	public void testWebhookUrlCreate() throws PaymillException {
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("url","http://webhook.getcontrol.co");
		params.put("event_types",types);
		Webhook webhook = Webhook.create(params);
		assertThat(webhook.getId(), notNullValue());
		assertEquals(webhook.getUrl(), "http://webhook.getcontrol.co");
		webhooks.add(webhook.getId());
	}
	
	@Test
	public void testWebhookEmailCreate() throws PaymillException {		
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("email","thiago.locatelli@gmail.com");
		params.put("event_types",types);
		Webhook webhook = Webhook.create(params);
		assertThat(webhook.getId(), notNullValue());
		assertEquals(webhook.getEmail(), "thiago.locatelli@gmail.com");
		webhooks.add(webhook.getId());
	}	
	
	@Test
	public void testWebhookUrlUpdate() throws PaymillException {
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("url","http://webhook.getcontrol.co");
		params.put("event_types",types);
		Webhook webhook = Webhook.create(params);
		assertThat(webhook.getId(), notNullValue());
		assertEquals(webhook.getUrl(), "http://webhook.getcontrol.co");

		HashMap<String, Object> newparams = new HashMap<String, Object>();
		newparams.put("url","http://webhook_updated.getcontrol.co");
		newparams.put("event_types",new_types);
		Webhook updatedWebhook = webhook.update(newparams);
		assertEquals(updatedWebhook.getEventTypes().size(), 4);
		assertEquals(updatedWebhook.getUrl(), "http://webhook_updated.getcontrol.co");
		webhooks.add(webhook.getId());
	}
	
	@Test
	public void testWebhookEmailUpdate() throws PaymillException {		
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("email","thiago.locatelli@gmail.com");
		params.put("event_types", types);
		Webhook webhook = Webhook.create(params);
		assertThat(webhook.getId(), notNullValue());
		assertEquals(webhook.getEmail(), "thiago.locatelli@gmail.com");
		
		HashMap<String, Object> newparams = new HashMap<String, Object>();
		newparams.put("email","paymill@gmail.com");
		newparams.put("event_types",new_types);
		Webhook updatedWebhook = webhook.update(newparams);
		assertEquals(updatedWebhook.getEventTypes().size(), new_types.size());
		assertEquals(updatedWebhook.getEmail(), "paymill@gmail.com");
		webhooks.add(webhook.getId());
	}		
	
}
