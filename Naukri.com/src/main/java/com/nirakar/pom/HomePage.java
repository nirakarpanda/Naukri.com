package com.nirakar.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	 WebDriver driver;
	 
	 @FindBy(xpath="html/body/div[1]/div/div/ul[2]/li[2]/a")
	 
	 WebElement MyNaukri;
	 
	 @FindBy(xpath="html/body/div[1]/div/div/ul[2]/li[2]/div/ul/li[1]/a")
	 WebElement editProfile;
	
	 public void clickOnProfile(){
		 editProfile.click();
	 }
	 
	 public void MouseHover(){
		 System.out.println("enter mouse hover");
		 Actions actions = new Actions(driver);
		 actions.moveToElement(MyNaukri).perform();
		 System.out.println("befite page");
		/* List<WebElement> links =driver.findElements(By.xpath("html/body/div[2]/div/ul[2]/li[2]/div/ul"));
		 int count = links.size();
		 System.out.println("count="+count);
		 for(int i=0;i<count;i++){
	    	  String s=links.get(i).getText();
	    //	String s=  name.getAttribute("innerHTML");
	    	
	    	 System.out.println("names are "+s);
	    	 
	    	 if(s.equalsIgnoreCase("<span></span>iPads")){
	    		 System.out.println("before click");
	    		//.click();
	    		 System.out.println("after click");
	    		 break; 
	    	 }}}*/
	 }
	 
	 public  HomePage(WebDriver Idriver){

	        this.driver = Idriver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver,this);
	       // System.out.println("pom page object="+driver);

	    }
}
