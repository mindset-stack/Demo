package edureka.tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListneres implements ITestListener{
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("test case passed and results are   " +result.getName());
	}

}
