package com.nirakar.Lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClase {

public WebDriver driver;

	@BeforeClass
	public void OpenBrowser()
	//public void OpenBrowser()
	{
		
			int a=7;
		
			  // If the browser is Firefox, then do this

			System.out.println("Nirakar");
			 

			
			 String str="Jitunu cnflict check";

				//System.setProperty("webdriver.gecko.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\geckodriver.exe");        
				     
					//WebDriver driver = new FirefoxDriver();
				
				 // driver = new FirefoxDriver();
				  System.out.println("after firefox");
				 //driver.get("https://login.naukri.com/nLogin/Login.php");
			 
			  
			 
			
			 
				  // Here I am setting up the path for my IEDriver
			 
				 System.setProperty("webdriver.chrome.driver", "E:\\SOfT\\java\\JarFiles\\selenium\\chromedriver.exe");      
					
					Reporter.log("=====Browser Session Started=====", true);
					
			               driver=new ChromeDriver();
					//driver = new FirefoxDriver();
			           	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			            //   driver.get("https://www.naukri.com");
			               driver.get("https://www.google.com");
	     String title= driver.getTitle();
	     System.out.println(title);
   	Assert.assertTrue(title.equals("Google"));
   
   	System.out.println("helloprint.......................................................................");
       //Create Login Page object
			//  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
      		driver.manage().window().maximize();
      		

              //  System.out.println(driver);
               
		
	//	driver.get("http://demo.guru99.com/V4/");
		
		Reporter.log("=====Application Started=====", true);
	}
	
	
	@AfterClass
	public void closeApplication()
	{
			if(driver!=null){
		//driver.quit();
		}
		Reporter.log("=====Browser Session End=====", true);
		
	}

}
