package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/*Retry mechanism is used to re-execute the failed test cases due to network error or in such cases.
For that TestNG provides an interface called IRetryAnalyzer.

*/

public class Retry implements IRetryAnalyzer{
	
	int counter = 0;
	int retryLimit = 2;
	
	public boolean retry(ITestResult result)
	{
		if(counter<retryLimit)
		{
			counter++;
			return true;
			
		}
		
		return false;
	}

}
