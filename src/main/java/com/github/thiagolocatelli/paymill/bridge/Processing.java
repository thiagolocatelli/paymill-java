package com.github.thiagolocatelli.paymill.bridge;

import com.google.gson.annotations.SerializedName;

public class Processing {

	String code;
	String result;
	String timestamp;
	Reason reason;
	@SerializedName("return")
	Return _return;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
		this.reason = reason;
	}

	public Return getReturn() {
		return _return;
	}

	public void set_return(Return _return) {
		this._return = _return;
	}

}
