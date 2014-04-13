package com.github.thiagolocatelli.paymill.net;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.github.thiagolocatelli.paymill.exception.InvalidRequestException;
import com.github.thiagolocatelli.paymill.model.Webhook;

public class ClassUrlTest {

	@Test
	public void testWebook() throws IOException {
		String url = APIResource.classURL(Webhook.class);
		assertEquals(url, "https://api.paymill.com/v2/webhooks");
	}
	
	@Test
	public void testWebookInstance() throws IOException, InvalidRequestException {
		String url = APIResource.instanceURL(Webhook.class, "hook_40237e20a7d5a231d99b");
		assertEquals(url, "https://api.paymill.com/v2/webhooks/hook_40237e20a7d5a231d99b");
	}


}
