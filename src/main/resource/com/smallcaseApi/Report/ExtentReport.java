//package com.smallcaseApi.Report;
//
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//
//
//public class ExtentReport{
//	
//	public ExtentReports extent;
//	public ExtentTest extentTest;
//
//public static final DateFormat date = new SimpleDateFormat("YYYY_MM_dd HH mm ss ");
//public Date dateform = new Date();
//	
//	@BeforeTest
//	public void setExtent(){
//		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReports/ExtentReport-"+date.format(dateform).trim().replace(' ', '_') + "html", true);
//
//		extent.addSystemInfo("Host Name", "Komal Desktop");
//		extent.addSystemInfo("Report", "Smallcase Api Test Execution Report");
//		extent.addSystemInfo("Environment", "QA");
//		
//	}
//	String fileName = System.getProperty("user.dir") + "/test-output/ExtentReport-"
//		+ date.format(dateform).trim().replace(' ', '_') + ".html";
//	
//	@AfterTest
//	public void endReport(){
//		extent.flush();
//		extent.close();
//	}
//	
//	
//	
//	
//	@AfterMethod
//	public void tearDown(ITestResult result) throws IOException{
//		
//		if(result.getStatus()==ITestResult.FAILURE){
//			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
//			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
//			
//			
//		}
//		else if(result.getStatus()==ITestResult.SKIP){
//			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
//		}
//		else if(result.getStatus()==ITestResult.SUCCESS){
//			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
//
//		}
//		
//		
//		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
//		
//	}
//	
//	
//	
//	
//}