package edureka.tests;

import org.testng.annotations.DataProvider;

public class Data {
	
	@DataProvider(name="post data")
	public Object [][] postData(){
		return new Object[][] {
			{"o","B", 1},
			{"l", "W",2}
			
		};
		
		
	}
	
	@DataProvider(name="delete data")
	public Object[] deleteData() 
	{
		return new Object[] {
				
				7,8,9,10
		};
	}
		
		
	}


