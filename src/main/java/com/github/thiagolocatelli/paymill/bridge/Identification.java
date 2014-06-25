package com.github.thiagolocatelli.paymill.bridge;

import com.google.gson.annotations.SerializedName;

public class Identification {

	@SerializedName("shortId")
	String shortId;
	@SerializedName("uniqueId")
	String uniqueId;

	public String getShortId() {
		return shortId;
	}

	public void setShortId(String shortId) {
		this.shortId = shortId;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
