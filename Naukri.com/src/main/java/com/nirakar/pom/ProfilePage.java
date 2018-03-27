package com.nirakar.pom;

import org.apache.regexp.recompile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	WebDriver driver;

	@FindBy(xpath = ".//*[@id='name']")
	WebElement name;

	@FindBy(xpath = ".//*[@id='title']")
	WebElement headLine;

	@FindBy(xpath = ".//*[@id='cityId']")
	WebElement currentCity;

	@FindBy(xpath = ".//*[@id='country']")
	WebElement currentCountry;

	@FindBy(xpath = ".//*[@id='experienceYear']")
	WebElement experienceYears;

	@FindBy(xpath = ".//*[@id='experienceMonth']")
	WebElement experienceMonths;

	@FindBy(xpath = ".//*[@id='ctcLacs']")
	WebElement ctcLakhs;

	@FindBy(xpath = ".//*[@id='ctcThousands']")
	WebElement ctcThousands;

	@FindBy(xpath = ".//*[@id='rPanel']/div/div/form/div[3]/div[2]/div[3]/p")
	WebElement ctcCurrency;

	@FindBy(xpath = ".//*[@id='cityName']")
	WebElement cityName;

	@FindBy(xpath = ".//*[@id='rPanel']/div/div/form/div[5]/div/button")
	WebElement save;
	
	@FindBy(xpath=".//*[@id='confirmMessage']")
	WebElement confirmMessage;
	
	/*public String confirmMessage(){
		return confirmMessage.getText();
	}*/

	public void writeTitel(String Titel) {
		headLine.clear();
		headLine.sendKeys(Titel);
	}

	public void writeText(String Name) {
		name.clear();
		name.sendKeys(Name);
	}

	public void saveButton() {

		save.click();
	}

	public ProfilePage(WebDriver Idriver) {

		this.driver = Idriver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);
		// System.out.println("pom page object="+driver);

	}

	public void saveProfileDetails(String cName, String headLine) {

		this.writeText(cName);
		this.writeTitel(headLine);
		System.out.println("before");
		this.saveButton();
		System.out.println("after");
	}
}
