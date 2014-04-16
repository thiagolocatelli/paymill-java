package com.github.thiagolocatelli.paymill;

public abstract class Paymill {
	

	public static final String API_BASE = "https://api.paymill.com";
	public static final String VERSION = "v2";
	public static String apiKey;
	public static String apiVersion = "v2";

	private static String apiBase = API_BASE;

	public static String getApiBase() {
		return apiBase;
	}

}
