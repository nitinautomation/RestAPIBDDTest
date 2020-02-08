package io.restassured.test.RestAPITest;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.restassured.baseclass.BaseClass;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import io.restassured.RestAssured;
import  org.hamcrest.Matchers;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.payload.HomoPayload;
import io.restassured.payload.RegisterUser;
import io.restassured.payload.userPayload;
import io.restassured.response.Response;
import io.restassured.utility.RandomStringGenerator;
import io.restassured.utility.ResponseConverter;

public class TC_002_PostRequest extends BaseClass{

	@Test(enabled=false)
	public void custRegister() throws JsonGenerationException, JsonMappingException, IOException {
		
		RestAssured.baseURI = properties.getProperty("custBaseURL");
		
	//	RegisterUser user = new RegisterUser("Ndsitin", "Gdsholap", "nitingholapefer4392", "PAssword", "ntidfjreerjgf@gmia.com");
		RegisterUser user = new RegisterUser();
		user.setFirstName("Nitin");
		user.setLastName("Gholap");
		user.setUserName("nitnguh");
		user.setPassword("lkdmlmkd");
		user.setEmail("ntrhj@fnfn.com");
		
		given()
			.contentType("application/json	")
			.body(user)
		.when()
			.post(properties.getProperty("custParameter"))
		.then()
			.log().all()
			.statusCode(201)
			.body("SuccessCode",Matchers.is("OPERATION_SUCCESS"));
	
	}
	
	
	@Test
	public void user() {
		RestAssured.baseURI = properties.getProperty("userURL");
		
		userPayload user = new userPayload();
		user.setName(RandomStringGenerator.getUserName());
		user.setJob("IT");
		
		Response res = given()
		.contentType("application/json	")
		.body(user)
	.when()
		.post(properties.getProperty("userParameter"))
	.then()
		.log().all()
		.statusCode(201)
	.extract().response();
		
		JsonPath ress = ResponseConverter.rawToJSON(res);
		System.out.println(ress.get("id"));
	
	}
}
