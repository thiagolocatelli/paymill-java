package com.github.thiagolocatelli.paymill.model;

public class Invoice implements Webhookable {

	String invoiceNr;
	Long netto;
	Long brutto;
	String status;
	Integer periodFrom;
	Integer periodUntil;
	String currency;
	Integer vatRate;
	Integer billingDate;
	String invoiceType;
	Integer lastReminderDate;

	public String getInvoiceNr() {
		return invoiceNr;
	}

	public void setInvoiceNr(String invoiceNr) {
		this.invoiceNr = invoiceNr;
	}

	public Long getNetto() {
		return netto;
	}

	public void setNetto(Long netto) {
		this.netto = netto;
	}

	public Long getBrutto() {
		return brutto;
	}

	public void setBrutto(Long brutto) {
		this.brutto = brutto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPeriodFrom() {
		return periodFrom;
	}

	public void setPeriodFrom(Integer periodFrom) {
		this.periodFrom = periodFrom;
	}

	public Integer getPeriodUntil() {
		return periodUntil;
	}

	public void setPeriodUntil(Integer periodUntil) {
		this.periodUntil = periodUntil;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getVatRate() {
		return vatRate;
	}

	public void setVatRate(Integer vatRate) {
		this.vatRate = vatRate;
	}

	public Integer getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Integer billingDate) {
		this.billingDate = billingDate;
	}

	public String getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(String invoiceType) {
		this.invoiceType = invoiceType;
	}

	public Integer getLastReminderDate() {
		return lastReminderDate;
	}

	public void setLastReminderDate(Integer lastReminderDate) {
		this.lastReminderDate = lastReminderDate;
	}

}
