package io.restassured.test.RestAPITest;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import com.restassured.baseclass.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.utility.ResponseConverter;

public class TC_001_GetGoogleMap_API_Test extends BaseClass {

	@Test
	public void homoSearch() {

		RestAssured.baseURI = properties.getProperty("Homo");

		Response res = given().when().get(properties.getProperty("homoResources")).then().statusCode(200)
				.body("totalResults", Matchers.is(9)).body("results[0].id", Matchers.is(327955))
				.body("results[0].title", Matchers.is("Homo sapiens")).extract().response();

		JsonPath data = ResponseConverter.rawToJSON(res);
		System.out.println(data.get("results[0].title"));

		
		
	}
}
