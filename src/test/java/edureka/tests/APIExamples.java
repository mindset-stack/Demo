package edureka.tests;


import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class APIExamples {
	
	//@Test
	
	public void test_01() {
		
		baseURI="http://localhost:3000";
		
		
		
		given().
		param("id", "1").
		get("/subject").then().
		statusCode(200)
		.log().all();
	}

	//@Test
	public void Test_02() {
		
		
		baseURI="http://localhost:3000";
		JSONObject req= new JSONObject();
		req.put("firstName", "A");
		req.put("lastName", "B");
		req.put("subjectId", 1);

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("content-type","application/json").
		
		
		
		body(req.toJSONString()).
		when().post("/users").
then().
statusCode(201).log().all();
		
	}
	
	
	//@Test
	public void test_03()
	{
		
		
		JSONObject req= new JSONObject();
		req.put("lastName", "jk");
				
		baseURI="http://localhost:3000";	
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("content-type" ,"application/json").
		body(req.toJSONString()).
		when().patch("/users/6").
		then().statusCode(200).log().all();
		
		
		
		
		
		
	}
	
	//@Test
	public void test_04() {
		
		
		JSONObject req= new JSONObject();
		req.put("firstName", "kl");
		req.put("lastName", "ki");
		baseURI="http://localhost:3000";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("content-type" ,"application/json").
		body(req.toJSONString()).
		when().
		put("/users/6").
		then().statusCode(200).log().all();
		
	}
	
	
	@Test
	public void test_06() {
	
		JSONObject req= new JSONObject();
		req.put("fristName", "loool");
		req.put("lastName", "plk");
		req.put("subjectId", 2);
		baseURI="http://localhost:3000";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("content-type" ,"application/json").
		body(req.toJSONString()).
		when().post("/users").
		then().statusCode(201);
		

		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("content-type" ,"application/json").
		body(req.toJSONString()).
		when().put("/users/1").
		then().statusCode(200);
	
		
		given().
		
		when().
		delete("/users/1").then().statusCode(200);
		
		
given().
		
		when().
		get("/users").then().statusCode(200).log().all();
		
	}
}
