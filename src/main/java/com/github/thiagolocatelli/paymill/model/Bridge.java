package com.github.thiagolocatelli.paymill.model;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.thiagolocatelli.paymill.bridge.Identification;
import com.github.thiagolocatelli.paymill.bridge.Processing;
import com.github.thiagolocatelli.paymill.bridge.Return;
import com.github.thiagolocatelli.paymill.bridge.TokenRequest;
import com.github.thiagolocatelli.paymill.exception.BridgeException;
import com.github.thiagolocatelli.paymill.exception.PaymillException;
import com.github.thiagolocatelli.paymill.net.APIResource;

public class Bridge extends APIResource {
	
	public static String publishableKey = "";
	private static String bridge_live_api = "https://token-v2.paymill.de";
	private static String bridge_test_api = "https://test-token.paymill.de";

	public static String create(String publishableKly, HashMap<String, Object> params) throws BridgeException {
		
		TokenRequest token = null;
		String url;
		try {
			
			if(isTestKey(publishableKly)) {
				url = bridge_test_api;
				params.put("transaction.mode", "CONNECTOR_TEST");
			}
			else {
				url = bridge_live_api;
				params.put("transaction.mode", "LIVE");
			}
			
			token = request(RequestMethod.GET, url + "/",
					params, TokenRequest.class, "-1");			
			
		} catch (PaymillException e) {
			throw new BridgeException(e.getError(), e.getMessage());
		}
		
		if (token != null && token.getTransaction() != null
				&& token.getTransaction().getProcessing() != null) {
			Processing processing = token.getTransaction().getProcessing();
			if (!"ACK".equals(processing.getResult())) {
				Return _return = processing.getReturn();
				throw new BridgeException(_return.getCode(), _return.getMessage());
			} else {
				Identification identification = token.getTransaction().getIdentification();
				return identification.getUniqueId();
			}
		} else {
			throw new BridgeException("unknow_error", "Unknow error occurred");
		}

	}
	
	private static boolean isTestKey(String publishableKey) {
		Pattern pattern = Pattern.compile("^\\d{10}");
		Matcher matcher = pattern.matcher(publishableKey);
		return matcher.find();
	}
	
	public static void main(String args[]) {
		System.out.println(isTestKey("01417159439a5f194a1b0a1fe04a1849"));
		System.out.println(isTestKey("8a8394c44517d7be01451cfc02ef0c56"));
	}

}
