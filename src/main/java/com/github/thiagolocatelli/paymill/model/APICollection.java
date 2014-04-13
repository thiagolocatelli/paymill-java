package com.github.thiagolocatelli.paymill.model;

import java.util.List;

public abstract class APICollection<T> extends APIObject {

	List<T> data;
	Integer dataCount;
	String mode;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public Integer getDataCount() {
		return dataCount;
	}

	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
