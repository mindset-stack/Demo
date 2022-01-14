package edureka.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class DemoParameterization extends Data {


   @Test

	@Parameters({"firstName", "lastName","subjectId"})
	//@Test(dataProvider = "post data")
	public void testcase_01(String firstName, String lastName, int subjectId) {
		JSONObject req= new JSONObject();
		req.put("firstName", firstName);
		req.put("lastName", lastName);
		req.put("subjectId", subjectId);

		baseURI="http://localhost:3000";


		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		header("content-type", "application/JSON").
		body(req).
		when().
		post("/users").
		then().
		statusCode(201);
	}


	
	
//@Test
	@Parameters({"userId"})
//	@Test(dataProvider="delete data")
	public void deteteData(int userId) {
		System.out.println("parameter is " +userId);
		
		baseURI="http://localhost:3000";
		
		given().
		when().
		delete("/users/" +userId).
		then().statusCode(200);
		
		
	}


}
