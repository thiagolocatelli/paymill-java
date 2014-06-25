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
import com.github.thiagolocatelli.paymill.net.VoidResponse;

public class Subscription extends APIResource {

	String id;
	Offer offer;
	Boolean livemode;
	Boolean cancelAtPeriodEnd;
	Integer trialStart;
	Integer trialEnd;
	Integer nextCaptureAt;
	Date createdAt;
	Date updatedAt;
	Date canceledAt;
	Payment payment;
	Client client;
	String appId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public Boolean getCancelAtPeriodEnd() {
		return cancelAtPeriodEnd;
	}

	public void setCancelAtPeriodEnd(Boolean cancelAtPeriodEnd) {
		this.cancelAtPeriodEnd = cancelAtPeriodEnd;
	}

	public Integer getTrialStart() {
		return trialStart;
	}

	public void setTrialStart(Integer trialStart) {
		this.trialStart = trialStart;
	}

	public Integer getTrialEnd() {
		return trialEnd;
	}

	public void setTrialEnd(Integer trialEnd) {
		this.trialEnd = trialEnd;
	}

	public Integer getNextCaptureAt() {
		return nextCaptureAt;
	}

	public void setNextCaptureAt(Integer nextCaptureAt) {
		this.nextCaptureAt = nextCaptureAt;
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

	public Date getCanceledAt() {
		return canceledAt;
	}

	public void setCanceledAt(Date canceledAt) {
		this.canceledAt = canceledAt;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public static Subscription create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return create(params, null);
	}

	public static Subscription create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.POST, classURL(Subscription.class),
				params, Subscription.class, apiKey);
	}

	public static Subscription retrieve(String id)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return retrieve(id, null);
	}

	public static Subscription retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, instanceURL(Subscription.class, id),
				null, Subscription.class, apiKey);
	}

	public Subscription update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return update(params, null);
	}

	public Subscription update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.PUT,
				instanceURL(Subscription.class, getId()), params,
				Subscription.class, apiKey);
	}

	public void delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		request(RequestMethod.DELETE,
				instanceURL(Subscription.class, getId()), null,
				VoidResponse.class, apiKey);
	}

	public void delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		delete(null);
	}

	public static SubscriptionCollection list() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return list(null);
	}

	public static SubscriptionCollection list(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, classURL(Subscription.class), null,
				SubscriptionCollection.class, apiKey);
	}

}
