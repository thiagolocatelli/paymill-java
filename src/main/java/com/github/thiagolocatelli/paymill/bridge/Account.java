package com.github.thiagolocatelli.paymill.bridge;

import com.google.gson.annotations.SerializedName;

public class Account {

	String bin;
	String brand;
	@SerializedName("last4Digits")
	String last4Digits;

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLast4Digits() {
		return last4Digits;
	}

	public void setLast4Digits(String last4Digits) {
		this.last4Digits = last4Digits;
	}

}
