package io.restassured.test.RestAPITest;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import com.restassured.baseclass.BaseClass;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.utility.ResponseConverter;

public class TC_001_GetGoogleMap_API_Test extends BaseClass {

	@Test(description="Validate response, body")
	public void homoSearch() {

		RestAssured.baseURI = properties.getProperty("Homo");

		Response res = given()
			.when().get(properties.getProperty("homoResources"))
			.then().log().all()
				.statusCode(200)
				.header("ETag", equalTo("W/\"320d4dca7ae350a0115ce7904c03b38b\""))
				.body("totalResults", Matchers.is(9)).body("results[0].id", Matchers.is(327955))
				.body("results[0].title", Matchers.is("Homo sapiens")).extract().response();

		JsonPath data = ResponseConverter.rawToJSON(res);
		System.out.println(data.get("results[0].title"));

		int result = data.get("results.size()");
		for (int i = 0; i < result; i++) {

			System.out.println(data.get("results[" + i + "].title"));

		}
	}
}
