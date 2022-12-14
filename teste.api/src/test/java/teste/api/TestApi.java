package teste.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestApi {
	
	
	private String url = "https://jsonplaceholder.typicode.com/users";
	
	Response responseGet = RestAssured.get(url);
	Response responsePost = RestAssured.post(url);
	Response responsePut = RestAssured.put(url);
	Response responseDelete = RestAssured.delete(url);
	
	@Test
	public void getTest(){
		
		int code = responseGet.getStatusCode();
		
		System.out.println(responseGet.asPrettyString());
		System.out.println();
		System.out.println("Get");
		System.out.println("Status Code: " + responseGet.getStatusCode());
		System.out.println();
		
		//Valida o Status code
		assertEquals(200, code);
		
		
	}
	
	@Test
	public void postTest() {
		
		int code = responsePost.getStatusCode();
		
		System.out.println(responsePost.asPrettyString());
		System.out.println();
		System.out.println("Post");
		System.out.println("Status Code: " + responsePost.getStatusCode());
		System.out.println();
		
		//Valida o Status code
				assertEquals(500, code);

	}
	
	
	@Test
	public void putTest() {
		
		int code = responsePut.getStatusCode();
		
		System.out.println(responsePut.asPrettyString());
		System.out.println();
		System.out.println("Put");
		System.out.println("Status Code: " + responsePut.getStatusCode());
		System.out.println();

		//Valida o Status code
				assertEquals(404, code);
		
	}
	
	@Test
	public void deleteTest() {
		
		int code = responseDelete.getStatusCode();

		
		System.out.println(responseDelete.asPrettyString());
		System.out.println();
		System.out.println("Delete");
		System.out.println("Status Code: " + responseDelete.getStatusCode());
		System.out.println();

		//Valida o Status code
				assertEquals(404, code);
		
	}
	
} 
