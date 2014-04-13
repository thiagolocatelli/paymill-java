package com.github.thiagolocatelli.paymill.net;

import com.google.gson.JsonObject;

public class PaymillResponse {

	JsonObject data;

	public JsonObject getData() {
		return data;
	}

	public void setData(JsonObject data) {
		this.data = data;
	}

}
