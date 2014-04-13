package com.github.thiagolocatelli.paymill.deserializer;

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class DateDeserializer implements JsonDeserializer<Date> {

	public Date deserialize(JsonElement element, Type arg1,
			JsonDeserializationContext arg2) throws JsonParseException {

		try {
			Integer date = element.getAsInt();
			return new Date(date * 1000);
		} catch (Exception e) {
			throw new JsonParseException(e);
		}
	}
}
