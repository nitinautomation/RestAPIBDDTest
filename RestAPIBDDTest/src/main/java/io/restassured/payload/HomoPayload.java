package io.restassured.payload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.utility.RandomStringGenerator;

public class HomoPayload {

	public static String postRes = "{\r\n" + 
			"		\"FirstName\":\"nitin\",\r\n" + 
			"		\"LastName\":\"Gholap\",\r\n" + 
			"		\"UserName\":"+RandomStringGenerator.getUserName()+",\r\n" + 
			"		\"Password\":\"23435\",\r\n" + 
			"		\"Email\":"+RandomStringGenerator.getEmailAddress()+",\r\n" + 
			"	}";

	

	public static HashMap postData() {
			
		HashMap hash = new HashMap();
		hash.put("FirstName", "Nitin");
		hash.put("LastName", "Gholap");
		hash.put("UserName", RandomStringGenerator.getUserName());
		hash.put("Password", "value");
		hash.put("Email", RandomStringGenerator.getEmailAddress());
		return hash;
	
	}
	
	public static RegisterUser PostReg()	{
		
		RegisterUser user = new RegisterUser();
		user.setFirstName("Nitin");
		user.setLastName("gholap");
		user.setUserName("fdnknds@fskdn.co");
		user.setPassword("2344");
		user.setEmail("fsklmflk@fkdndsfk.com");
		
		return user; 
		
	}
	
}


