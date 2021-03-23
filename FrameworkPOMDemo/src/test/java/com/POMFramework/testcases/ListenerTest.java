package com.POMFramework.testcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("onTestFailure method is called");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped method is called");
		
	}

	public void onTestStart(ITestResult arg0) {
		
		System.out.println("onTestStart method is called");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess method is called");
		
	}
	
	

}
