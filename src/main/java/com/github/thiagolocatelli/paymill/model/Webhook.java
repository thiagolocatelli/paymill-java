package com.github.thiagolocatelli.paymill.model;

import java.util.Date;
import java.util.List;
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

public class Webhook extends APIResource {

	String id;
	String url;
	String email;
	List<String> eventTypes;
	Date createdAt;
	Date updatedAt;
	Boolean active;
	Boolean livemode;
	String appId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getEventTypes() {
		return eventTypes;
	}

	public void setEventTypes(List<String> eventTypes) {
		this.eventTypes = eventTypes;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getLivemode() {
		return livemode;
	}

	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public static Webhook create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return create(params, null);
	}

	public static Webhook create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.POST, classURL(Webhook.class), params,
				Webhook.class, apiKey);
	}

	public static Webhook retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return retrieve(id, null);
	}

	public static Webhook retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, instanceURL(Webhook.class, id), null,
				Webhook.class, apiKey);
	}

	public Webhook update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return update(params, null);
	}

	public Webhook update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.PUT, instanceURL(Webhook.class, getId()),
				params, Webhook.class, apiKey);
	}

	public void delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		request(RequestMethod.DELETE,
				instanceURL(Webhook.class, getId()), null, VoidResponse.class,
				apiKey);
	}

	public void delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		delete(null);
	}

	public static WebhookCollection list() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return list(null);
	}

	public static WebhookCollection list(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, classURL(Webhook.class),
				null, WebhookCollection.class, apiKey);
	}

}
