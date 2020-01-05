package io.restassured.utility;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ResponseConverter {
		
	public static JsonPath rawToJSON(Response res) {
		
		String response = res.asString();
		JsonPath jp = new JsonPath(response);
		return jp;
		
	}
	
	
}
