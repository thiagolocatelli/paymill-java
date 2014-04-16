package com.github.thiagolocatelli.paymill.model;

import java.util.Date;

public class Fee {

	String type;
	String application;
	String payment;
	Integer amount;
	String currency;
	Date billedAt;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Date getBilledAt() {
		return billedAt;
	}

	public void setBilledAt(Date billedAt) {
		this.billedAt = billedAt;
	}

}