package testAPI.Automation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class APITest extends TokenAPI {
	String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImtlbnRhazJ1biIsImVtYWlsIjoiZ3JlY3RyZWVfN0BnbWFpbC5jb20iLCJwaG9uZW51bWJlciI6IjA4MDk4OTg5ODk4OSIsImtvbGFrQ291bnQiOjEzLCJydWpha0NvdW50IjowLCJjZW5kb2xDb3VudCI6MCwiaWF0IjoxNjUyMzI2NDExLCJleHAiOjE2NTI0MTI4MTF9.qmjCrQ5cHqAjkoS-GGOPlzJJZhrbU4otDOOHfDqg3h0";
	String wrongtoken ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImtlbnRhazJ1biIsImVtYWlsIjoiZ3JlY3RyZWVfN0BnbWFpbC5jb20iLCJwaG9uZW51bWJlciI6IjA4MDk4OTg5ODk4OSIsImtvbGFrQ291bnQiOjEzLCJydWpha0NvdW50IjowLCJjZW5kb2xDb3VudCI6MCwiaWF0IjoxNjUyMzI2NDExLCJleHAiOjE2NTI0MTI4MTF9.qmjCrQ5cHqAjkoS-GGOPlzJJZhrbU4otDOOHfDqg30";
	@Test
	public void user_input_right_credentials() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String loginPayLoad = "{\"username\":\"kentak2un\",\"password\":\"passwordsangatkuat\"}";
		Response response = RestAssured.given().contentType("application/json").body(loginPayLoad).when().post("/login");
		int statusCode = response.getStatusCode();
		assertEquals(200, statusCode);
		System.out.println(statusCode);
		token = response.jsonPath().get("Authorization");
		System.out.println(response);
	}
	@Test
	public void user_input_number_for_add_count() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String PayLoad = "{\"count\":\"1\"}";
		System.out.println(token);
		Response response = RestAssured.given().contentType("application/json").headers("Authorization", "Bearer " + token).body(PayLoad).when().post("/me/kolak/up");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		assertEquals(200, statusCode);
	}
	@Test
	public void user_get_username() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		System.out.println(token);
		Response response = RestAssured.given().contentType("application/json").headers("Authorization", "Bearer " + token).when().get("/me/status");
		int statusCode = response.getStatusCode();
		String usernameCheck = response.jsonPath().get("username");
		System.out.println(usernameCheck);
		assertEquals(200, statusCode);
		assertTrue(usernameCheck != null);
	}
	
	@Test
	public void user_input_wrong_credential() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String loginPayLoad = "{\"username\":\"kentakun\",\"password\":\"passwordsangatkuat\"}";
		Response response = RestAssured.given().contentType("application/json").body(loginPayLoad).when().post("/login");
		int statusCode = response.getStatusCode();
		assertEquals(200, statusCode);
		System.out.println(statusCode);
		token = response.jsonPath().get("Authorization");
		System.out.println(response);
	}
	@Test
	public void user_using_invalid_token() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String PayLoad = "{\"count\":\"1\"}";
		System.out.println(wrongtoken);
		Response response = RestAssured.given().contentType("application/json").headers("Authorization", "Bearer " + wrongtoken).body(PayLoad).when().post("/me/kolak/up");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		assertEquals(403, statusCode);
	}
	@Test
	public void user_input_mathematic_operator_in_count() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		String PayLoad = "{\"count\":\"-\"}";
		System.out.println(token);
		Response response = RestAssured.given().contentType("application/json").headers("Authorization", "Bearer " + token).body(PayLoad).when().post("/me/kolak/up");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		assertEquals(400, statusCode);
	}
	@Test
	public void user_get_false_key() {
		RestAssured.baseURI = "https://kolakproject.herokuapp.com";
		System.out.println(token);
		Response response = RestAssured.given().contentType("application/json").headers("Authorization", "Bearer " + token).when().get("/me/status");
		int statusCode = response.getStatusCode();
		String addressCheck = response.jsonPath().get("address");
		System.out.println(addressCheck);
		assertEquals(200, statusCode);
		assertFalse(addressCheck != null);
		System.out.println(addressCheck != null);
	}
}