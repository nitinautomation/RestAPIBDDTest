package io.restassured.test.RestAPITest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.restassured.baseclass.BaseClass;

public class TC_001_GetGoogleMap_API_Test extends BaseClass{

	
	

	@Test
	public void getMapAPI() {
		System.out.println(properties.getProperty("google"));
		
		
	}
	
}
