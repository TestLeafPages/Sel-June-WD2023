package week6.day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTC implements IRetryAnalyzer{

	int count=0;
	
	//0,1
	public boolean retry(ITestResult result) {
		if(count<2) {
			System.out.println("count of iteration: "+count);
			count++;
		return true;//once 1st rerun failed ,
		}
		
		return false;//program its passed it will stop executed
	}

}
