package com.github.thiagolocatelli.paymill.model;

import java.util.Date;
import java.util.Map;

import com.github.thiagolocatelli.paymill.exception.APIConnectionException;
import com.github.thiagolocatelli.paymill.exception.APIException;
import com.github.thiagolocatelli.paymill.exception.AuthenticationException;
import com.github.thiagolocatelli.paymill.exception.InvalidRequestException;
import com.github.thiagolocatelli.paymill.exception.PreConditionFailedException;
import com.github.thiagolocatelli.paymill.exception.ResourceNotFoundException;
import com.github.thiagolocatelli.paymill.exception.TransactionErrorException;
import com.github.thiagolocatelli.paymill.net.APIResource;

public class Offer extends APIResource {

	String id;
	String name;
	Integer amount;
	String currency;
	String inverval;
	Integer trialPeriodDays;
	Date createdAt;
	Date updatedAt;
	SubscriptionCount subscriptionCount;
	String appId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getInverval() {
		return inverval;
	}

	public void setInverval(String inverval) {
		this.inverval = inverval;
	}

	public Integer getTrialPeriodDays() {
		return trialPeriodDays;
	}

	public void setTrialPeriodDays(Integer trialPeriodDays) {
		this.trialPeriodDays = trialPeriodDays;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public SubscriptionCount getSubscriptionCount() {
		return subscriptionCount;
	}

	public void setSubscriptionCount(SubscriptionCount subscriptionCount) {
		this.subscriptionCount = subscriptionCount;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public static Offer create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return create(params, null);
	}

	public static Offer create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.POST, classURL(Offer.class), params,
				Offer.class, apiKey);
	}

	public static Offer retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return retrieve(id, null);
	}

	public static Offer retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, instanceURL(Offer.class, id), null,
				Offer.class, apiKey);
	}

	public Offer update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return update(params, null);
	}

	public Offer update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.PUT, instanceURL(Offer.class, getId()),
				params, Offer.class, apiKey);
	}

	public Offer delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return request(RequestMethod.DELETE, instanceURL(Offer.class, getId()),
				null, Offer.class, apiKey);
	}

	public Offer delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return delete(null);
	}

	public static OfferCollection list() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return list(null);
	}

	public static OfferCollection list(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, classURL(Offer.class), null,
				OfferCollection.class, apiKey);
	}

}
