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

public class Client extends APIResource {

	String id;
	String email;
	String description;
	Date createdAt;
	Date updatedAt;
	List<Payment> payment;
	List<Subscription> subscription;
	String appId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

	public List<Subscription> getSubscription() {
		return subscription;
	}

	public void setSubscription(List<Subscription> subscription) {
		this.subscription = subscription;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public static Client create(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return create(params, null);
	}

	public static Client create(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.POST, classURL(Client.class), params,
				Client.class, apiKey);
	}

	public static Client retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return retrieve(id, null);
	}

	public static Client retrieve(String id, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, instanceURL(Client.class, id), null,
				Client.class, apiKey);
	}

	public Client update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return update(params, null);
	}

	public Client update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.PUT, instanceURL(Client.class, getId()),
				params, Client.class, apiKey);
	}

	public Client delete(String apiKey) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return request(RequestMethod.DELETE, instanceURL(Client.class, getId()),
				null, Client.class, apiKey);
	}

	public Client delete() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return delete(null);
	}

	public static ClientCollection list() throws AuthenticationException,
			InvalidRequestException, APIConnectionException, APIException,
			TransactionErrorException, PreConditionFailedException,
			ResourceNotFoundException {
		return list(null);
	}

	public static ClientCollection list(String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, APIException, TransactionErrorException,
			PreConditionFailedException, ResourceNotFoundException {
		return request(RequestMethod.GET, classURL(Client.class), null,
				ClientCollection.class, apiKey);
	}

}
