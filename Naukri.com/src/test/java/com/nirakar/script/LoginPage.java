package com.nirakar.script;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nirakar.Lib.BaseClase;
import com.nirakar.pom.HomePage;
import com.nirakar.pom.LoginPom;
import com.nirakar.pom.ProfilePage;

public class LoginPage extends BaseClase {
	LoginPom loginPom ;
	
	HomePage homepage;
	ProfilePage profilepage;
	
	@Test(priority=0)
	public void testLogin(){
		
		 loginPom = new LoginPom(driver);
		loginPom.clickLoginLink();
		loginPom.loginNaukri("nirakarpanda@hotmail.com", "Bhagirathi143");
		
		
	}
	@Test(priority=1)
	public void MovetoProfile(){
		
		homepage = new HomePage(driver);
		System.out.println("calling mouseover");
		homepage.MouseHover();
		
		 List<WebElement> links =driver.findElements(By.xpath("html/body/div[1]/div/div/ul[2]/li[2]/a"));
		 System.out.println("links="+links);
		 int count = links.size();
		 System.out.println("count="+count);
		 for(int i=0;i<count;i++){
	    	  String s=links.get(i).getText();
	    	  
	    	  if(s.equalsIgnoreCase("Edit Profile")){
	    		  
	    		  homepage.clickOnProfile();
	    		  break;
	    	  }
	    //	String s=  name.getAttribute("innerHTML");
	    	
	    	// System.out.println("names are "+s);
	    	 
	    	}
		 
		/* ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 System.out.println("tab="+tabs2);
		   
		    driver.switchTo().window(tabs2.get(1));
		    System.out.println("title="+driver.getTitle());
		   // Assert.assertEquals(profilepage.confirmMessage(),"Update Profile|Mynaukri");
		System.out.println("pagee");*/
		
	}
	@Test(priority=2)
	public void saveDetails(){
		
		profilepage = new ProfilePage(driver);
		profilepage.saveProfileDetails("NIrakar Panda", "3.4 years of experience as , Manual Tester,Automation (selenium) ,Web Services(API) Tester");
		driver.findElement(By.xpath(".//*[@id='rPanel']/div/div/form/div[5]/div/button")).click();
		System.out.println("clicked save button");
		//Assert.assertEquals("Update Profile|Mynaukri",profilepage.confirmMessage());
		
	}

}
