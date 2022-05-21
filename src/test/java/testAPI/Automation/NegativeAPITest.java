package testAPI.Automation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NegativeAPITest extends TokenAPI {
	String wrongtoken = "";
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
	public void negativekolakup() {
		String count = "up";
	}
	
	public void negativekolakdown() {
		String count = "down";
	}
}
