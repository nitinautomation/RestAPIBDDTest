package io.restassured.utility;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGenerator {

	public static String getUserName() {
		String genaratedString = RandomStringUtils.randomAlphabetic(1);
		return ("nitisdsdng"+genaratedString);
	}
	
	public static String getEmailAddress() {
		
		String generatedEmail = RandomStringUtils.randomAlphabetic(12);
		return ("niddsti"+generatedEmail+"@fmai.com");
	}
	
	
}
