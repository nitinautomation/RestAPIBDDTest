package io.restassured.test.RestAPITest;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import com.restassured.baseclass.BaseClass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TC_001_GetGoogleMap_API_Test extends BaseClass{

	
	

	@Test
	public void getPlaceAPI() {
		RestAssured.baseURI = properties.getProperty("SearchPlaceBaseUrl");
		given()
			.queryParam("input", "Museum%20of%20Contemporary%20Art%20Australia")
			.queryParam("inputtype", "textquery")
			.queryParam("fields", "photos,formatted_address,name,rating,opening_hours,geometry")
			.queryParam("key", "AIzaSyD5UyJZknReiN5uJVzoLQoLva1NJV0yt_E")
			.contentType(ContentType.JSON)
		.when()
			.get(properties.getProperty("SearchPlaceResources"))
		.then()
			.statusCode(200)
			.contentType("application/json");
		
		
	}
	
}
