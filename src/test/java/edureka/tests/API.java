package edureka.tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
//import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;
public class API
{
	
	
@Test(priority=1)
	
	public void put()
	{
		
		JSONObject req1= new JSONObject();
		req1.put("name", "test");
		req1.put("job", "test");
		
		given().
		body(req1).
	
		when().put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();

		
		
	}
	

	@Test(priority=2)
	
	public void APITest()
	{
//		Map<String, Object> mp=  new HashMap<String, Object>();
//		mp.put("name", "test");

		JSONObject req= new JSONObject();
		req.put("name", "test");
		req.put("job", "test");
		
		
		given().
		body(req).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(200);
		
		
		
	

	
				
		
		
	}
	
	
		
	}


