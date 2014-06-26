package com.github.thiagolocatelli.paymill.model;

/**
 * There are a number of events you can react to. Each webhook can be configured
 * to catch any kind of event individually, so you can create different webhooks
 * for different events. Each Webhook needs to be attached to at least one
 * event.
 * 
 * @author Vassil Nikolov
 * @since 3.0.0
 */
public enum EventType {

	/**
	 * Returns a {@link Transaction} with state set to chargeback.
	 */
	CHARGEBACK_EXECUTED("chargeback.executed"),

	/**
	 * Returns a {@link Transaction}.
	 */
	TRANSACTION_CREATED("transaction.created"),

	/**
	 * Returns a {@link Transaction}.
	 */
	TRANSACTION_SUCCEEDED("transaction.succeeded"),

	/**
	 * returns a {@link Transaction}.
	 */
	TRANSACTION_FAILED("transaction.failed"),

	/**
	 * Returns a {@link Subscription}.
	 */
	SUBSCRIPTION_CREATED("subscription.created"),

	/**
	 * Returns a {@link Subscription}.
	 */
	SUBSCRIPTION_UPDATED("subscription.updated"),

	/**
	 * Returns a {@link Subscription}.
	 */
	SUBSCRIPTION_DELETED("subscription.deleted"),

	/**
	 * Returns a {@link Transaction} and a {@link Subscription}.
	 */
	SUBSCRIPTION_SUCCEEDED("subscription.succeeded"),

	/**
	 * Returns a {@link Transaction} and a {@link Subscription}.
	 */
	SUBSCRIPTION_FAILED("subscription.failed"),

	/**
	 * Returns a refund.
	 */
	REFUND_CREATED("refund.created"),

	/**
	 * Returns a {@link Refund}.
	 */
	REFUND_SUCCEEDED("refund.succeeded"),

	/**
	 * Returns a {@link Refund}.
	 */
	REFUND_FAILED("refund.failed"),

	/**
	 * Returns an invoice with the payout sum for the invoice period.
	 */
	PAYOUT_TRANSFERRED("payout.transferred"),

	/**
	 * Returns an invoice with the fees sum for the invoice period.
	 */
	INVOICE_AVAILABLE("invoice.available"),

	/**
	 * Returns a merchant if a connected merchant was activated.
	 */
	APP_MERCHANT_ACTIVATED("app.merchant.activated"),

	/**
	 * Returns a merchant if a connected merchant was deactivated.
	 */
	APP_MERCHANT_DEACTIVATED("app.merchant.deactivated"),

	/**
	 * Returns a merchant if a connected merchant was rejected.
	 */
	APP_MERCHANT_REJECTED("app.merchant.rejected"),

	/**
	 * Returns a {@link Client} if a {@link Client} was updated.
	 */
	CLIENT_UPDATED("client.updated"),

	UNDEFINED("undefined");

	private String value;

	private EventType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static EventType create(String value) {
		for (EventType type : EventType.values()) {
			if (type.getValue().equals(value)) {
				return type;
			}
		}
		return EventType.UNDEFINED;
	}

}