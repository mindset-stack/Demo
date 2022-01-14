package edureka.tests;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class SchemaValidation {

	
	
	@Test
	public void getData() {
		
		baseURI="https://reqres.in/api";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).		header("content-type", "application/json");
		when().
		get("/users?page=2").
		then().
		assertThat().body(matchesJsonSchemaInClasspath("schemajson.json")).
		statusCode(200);
		
	}
	
}
