package com.smallcaseAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.publisherResources.PublisherTest;
import com.smallcaseApi.Report.ExtentReport;

import commonUtils.ConfigRead;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class abc extends ExtentReport  {
	
		Logger logger = Logger.getLogger(abc.class);
		@Test(priority=1,description="Get page details")
		
		public void pageDetails() throws IOException{
			 //extentTest = extent.startTest("omnathTest");
			ConfigRead.allConsoleLog();
			logger.info("==========get all page details=======");

			
			RestAssured.baseURI=ConfigRead.getPropertyValue("auth_url");
			
			//RestAssured.baseURI= "https://reqres.in";

			 Response resp = given().log().all().
			header("Content-Type","application/json").
			param("page","2").
			when().relaxedHTTPSValidation().get(PublisherTest.pageallDetails());
			
			//then();
			 
				logger.info("==========Assert for statuscode=======");

			 Assert.assertEquals(200,resp.statusCode());
				logger.info("==========Assertion pass for statuscode=======");

//			statusCode(200).and().
//			contentType(ContentType.JSON).and().log().all().
//			body("data[0].id",equalTo(7)).extract().
//			response();
//			 String ress = resp.asString();
//				System.out.println(ress);
		//
//			 // Time
//			Long RespTime=resp.time();
//			System.out.println("Response Time in Mili Second for Request is\t"+RespTime);
//			RespTime.ge
		//	
		//	
//			 //JsonPath Extract & assertion
//			 JsonPath js=new JsonPath(ress);
//			 
//			String expected = js.getString("total");
//			System.out.println(expected);
//			Assert.assertEquals(expected, "12");
//			 
//		     
			

//				int count=js.get("total_pages.size()");
//				System.out.println("Total size is\t"+count);

			
			
			
			
			
			
			
		}
		
		
		
		@Test(priority=2,description="Get page ")
		
		public void pageDs() throws IOException{
			//test= reports.createTest("logining","need to  jcjfhjfh");
			extentTest = extent.startTest("freemCRMLobgrkbnknbkgnkbggoTest");
			logger.info("==========get all page details=======");

			
			RestAssured.baseURI=ConfigRead.getPropertyValue("auth_url");
			
			//RestAssured.baseURI= "https://reqres.in";

			 Response resp = given().log().all().
			header("Content-Type","application/json").
			param("page","2").
			when().relaxedHTTPSValidation().get(PublisherTest.pageallDetails());
			
			//then();
			 
				logger.info("==========Assert for statuscode=======");

			 Assert.assertEquals(20,resp.statusCode());
				logger.info("==========Assertion pass for statuscode=======");

//			statusCode(200).and().
//			contentType(ContentType.JSON).and().log().all().
//			body("data[0].id",equalTo(7)).extract().
//			response();
//			 String ress = resp.asString();
//				System.out.println(ress);
		//
//			 // Time
//			Long RespTime=resp.time();
//			System.out.println("Response Time in Mili Second for Request is\t"+RespTime);
//			RespTime.ge
		//	
		//	
//			 //JsonPath Extract & assertion
//			 JsonPath js=new JsonPath(ress);
//			 
//			String expected = js.getString("total");
//			System.out.println(expected);
//			Assert.assertEquals(expected, "12");
//			 
//		     
			

//				int count=js.get("total_pages.size()");
//				System.out.println("Total size is\t"+count);

			
			
			
			
			
			
			
		}

		
		
		@Test(priority=3,description="pagekkkkkk details")
		
		public void pagelllllll() throws IOException{
			//test= reports.createTest("logaouufu5f ing","need to njbjtjbtkvfmvnfn jcjfhjfh");
			extentTest = extent.startTest("freemCRhkhkjomnathMLogoTest");
			logger.info("==========get all page details=======");

			
			RestAssured.baseURI=ConfigRead.getPropertyValue("auth_url");
			
			//RestAssured.baseURI= "https://reqres.in";

			 Response resp = given().log().all().
			header("Content-Type","application/json").
			param("page","2").
			when().relaxedHTTPSValidation().get(PublisherTest.pageallDetails());
			
			//then();
			 
				logger.info("==========Assert for statuscode=======");

			 Assert.assertEquals(200,resp.statusCode());
				logger.info("==========Assertion pass for statuscode=======");

//			statusCode(200).and().
//			contentType(ContentType.JSON).and().log().all().
//			body("data[0].id",equalTo(7)).extract().
//			response();
//			 String ress = resp.asString();
//				System.out.println(ress);
		//
//			 // Time
//			Long RespTime=resp.time();
//			System.out.println("Response Time in Mili Second for Request is\t"+RespTime);
//			RespTime.ge
		//	
		//	
//			 //JsonPath Extract & assertion
//			 JsonPath js=new JsonPath(ress);
//			 
//			String expected = js.getString("total");
//			System.out.println(expected);
//			Assert.assertEquals(expected, "12");
//			 
//		     
			

//				int count=js.get("total_pages.size()");
//				System.out.println("Total size is\t"+count);

			
			
			
			
			
			
			
		}


		}


