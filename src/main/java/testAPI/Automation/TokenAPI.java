package testAPI.Automation;

import static org.testng.Assert.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TokenAPI {
	String token = "";
	String wrongtoken = "asasd";
	
	@Test
	public void testLoginAPI() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String loginPayLoad = "{\"username\":\"kentak2un\",\"password\":\"passwordsangatkuat\"}";
		Response response = RestAssured.given().contentType("application/json").body(loginPayLoad).when().post("/login");
		int statusCode = response.getStatusCode();
		assertEquals(200, statusCode);
		System.out.println(statusCode);
		token = response.jsonPath().get("Authorization");
		System.out.println(token);
	}
}
