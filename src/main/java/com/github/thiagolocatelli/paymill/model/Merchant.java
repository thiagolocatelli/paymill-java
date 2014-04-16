package com.github.thiagolocatelli.paymill.model;

import java.util.List;

public class Merchant {

	String identifierKey;
	String email;
	String locale;
	String country;
	List<String> currencies;
	List<String> methods;

	public String getIdentifierKey() {
		return identifierKey;
	}

	public void setIdentifierKey(String identifierKey) {
		this.identifierKey = identifierKey;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(List<String> currencies) {
		this.currencies = currencies;
	}

	public List<String> getMethods() {
		return methods;
	}

	public void setMethods(List<String> methods) {
		this.methods = methods;
	}

}
