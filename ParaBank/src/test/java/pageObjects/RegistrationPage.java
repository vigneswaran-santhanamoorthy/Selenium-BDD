package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import utilities.commonMethods;

public class RegistrationPage {
	
	commonMethods methods = new commonMethods();
	WebDriver driver = new ChromeDriver();
	
	
	public RegistrationPage() {
		PageFactory.initElements(driver,this);
		//this is to pass current instance of the class
	}
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	@FindBy(css="[href='register.htm']")
	WebElement RegisterLink;
	
	@FindBy(css="h1.title")
	WebElement RegistrationTitle;
	
	@FindBy(id="customer.firstName")
	WebElement FirstName;
	
	@FindBy(id="customer.lastName")
	WebElement LastName;
	
	@FindBy(id="customer.address.street")
	WebElement Address;
	
	@FindBy(id="customer.address.city")
	WebElement City;
	
	@FindBy(id="customer.address.state")
	WebElement State;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipCode;
	
	@FindBy(id="customer.phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement ssn;
	
	@FindBy(id="customer.username")
	WebElement username;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="repeatedPassword")
	WebElement repeatPassword;
	
	@FindBy(css="input[value='Register']")
	WebElement registerButton;
	
	@FindBy(xpath="//h1[@class='title']/following-sibling::p")
	WebElement successRegistration;
	
	public void enterHomePage() {
		driver.get("https://parabank.parasoft.com/");
		Assert.assertEquals(driver.getTitle(),"ParaBank | Welcome | Online Banking");
	}
	
	public void clickRegister() {
		RegisterLink.click();
	}
	
	public void verifyRegistrationPage() {
		Assert.assertEquals(RegistrationTitle.getText(), "Signing up is easy!");
	}
	
	public void enterAllFields() {
		String firstname=methods.createRandomString(8);
		FirstName.sendKeys(firstname);
		LastName.sendKeys(methods.createRandomString(6));
		Address.sendKeys("A Street");
		City.sendKeys("AAA");
		State.sendKeys("california");
		zipCode.sendKeys("435672");
		phoneNumber.sendKeys("9997775551");
		ssn.sendKeys("1234");
		String username1=firstname+"1234";
		username.sendKeys(username1);
		System.out.println("USERNAME ---> "+username1);
		String password1=methods.createRandomString(8)+methods.createRandomNumber(4);
		password.sendKeys(password1);
		System.out.println("PASSWORD ---> "+password1);
		repeatPassword.sendKeys(password1);
	}
	
	public void clickRegisterButton() {
		registerButton.click();
	}
	
	public void registerSuccesspage() {
		Assert.assertEquals(true,RegistrationTitle.getText().contains("Welcome "));
		Assert.assertEquals(successRegistration.getText(),"Your account was created successfully. You are now logged in.");
	}
	
	public void entermandatoryFields() {
		String firstname=methods.createRandomString(8);
		FirstName.sendKeys(firstname);
		LastName.sendKeys(methods.createRandomString(6));
		Address.sendKeys("A Street");
		City.sendKeys("AAA");
		State.sendKeys("california");
		zipCode.sendKeys("435672");
		ssn.sendKeys("1234");
		String username1=firstname+"1234";
		username.sendKeys(username1);
		System.out.println("USERNAME ---> "+username1);
		String password1=methods.createRandomString(8)+methods.createRandomNumber(4);
		password.sendKeys(password1);
		System.out.println("PASSWORD ---> "+password1);
		repeatPassword.sendKeys(password1);
	}

}
