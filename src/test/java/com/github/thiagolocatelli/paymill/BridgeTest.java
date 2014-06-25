package com.github.thiagolocatelli.paymill;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.HashMap;

import org.junit.Test;

import com.github.thiagolocatelli.paymill.exception.BridgeException;
import com.github.thiagolocatelli.paymill.model.Bridge;

public class BridgeTest {

	@Test
	public void bridgeTest() throws BridgeException {
		
		HashMap<String, Object> params = new HashMap<String, Object>();
		params.put("account.number", "4111111111111111");
		params.put("account.expiry.month", "12");
		params.put("account.expiry.year", "2015");
		params.put("account.verification", "111");
		params.put("account.holder", "John Doe");
		
		String token = Bridge.create("01417159439a5f194a1b0a1fe04a1849", params);
		assertThat(token, notNullValue());
		
	}
	
}
