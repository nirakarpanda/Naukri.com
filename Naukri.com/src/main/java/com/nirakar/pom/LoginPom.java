package com.nirakar.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	WebDriver driver;
	@FindBy(xpath=".//*[@id='login_Layer']")
	//@FindBy(css="input#usernameField")
	WebElement loginBtn;
	@FindBy(xpath=".//*[@id='eLogin']")
	//@FindBy(css="input#usernameField")
	WebElement email;

	@FindBy(xpath = ".//*[@id='pLogin']")
	//@FindBy(css="input#passwordField")
	WebElement password;

	@FindBy(xpath = ".//*[@id='lgnFrm']/div[8]/button")
	WebElement login;

	public LoginPom(WebDriver Idriver) {

		this.driver = Idriver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
		// System.out.println("pom page object="+driver);

	}

	// Set user name in textbox

	public void setUserName(String emailId) {

		email.sendKeys(emailId);

	}

	// Set password in password textbox

	public void Password(String strPassword) {

		password.sendKeys(strPassword);

	}
	public void clickLoginLink() {
System.out.println("clickLoginLink");
		loginBtn.click();

	}
	// Click on login button

	public void clickLogin() {

		login.click();

	}

	// Get the title of Login Page

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */

	public void loginNaukri(String strUserName, String strPasword) {

		// Fill user name
		//this.clickLoginLink();
		this.setUserName(strUserName);
System.out.println("setUserName");
		// Fill password

		this.Password(strPasword);

		// Click Login button

		this.clickLogin();

	}

}
