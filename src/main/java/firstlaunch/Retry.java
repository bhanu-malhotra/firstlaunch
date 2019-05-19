package firstlaunch;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<6;i++)
		{
			System.out.println("method fails and run no is"+i+"\t"+result.getName());
		}
		return false;
	}

	
}
