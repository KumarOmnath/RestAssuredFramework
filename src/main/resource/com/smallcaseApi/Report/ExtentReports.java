package com.smallcaseApi.Report;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReports {
	
	//ExtentReports extent;
	//public ExtentTest extentTest;

//public static final DateFormat date = new SimpleDateFormat("YYYY_MM_dd HH mm ss ");
//public Date dateform = new Date();
	
	@BeforeTest
	public void extentReportGenerator(){
	//String	path = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReports/ExtentReport-"+date.format(dateform).trim().replace(' ', '_') + "html", true);

		String path = System.getProperty("user.dir")+"/test-output/ExtentReports/ExtentReport.html";
		
		ExtentSparkReporter reporter =  new ExtentSparkReporter(path);
		
		
		reporter.config().setReportName("WebAutomation Result");
		
		reporter.config().setDocumentTitle("TestResult");
		
		ExtentReports extent = new ExtentReports();
		extent.atta

		//extent.setSystemInfo("Tester", "Rahul Shetty");
		//return extent;
	}
	
	

}
