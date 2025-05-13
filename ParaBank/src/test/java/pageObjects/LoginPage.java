package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage {

		
		@FindBy(xpath="//input[@name=\"username\"]")
		WebElement usernamelink;
		
		@FindBy(xpath="//input[@name=\"password\"]")
		WebElement passwordlink;
		
		@FindBy(xpath="//input[@value=\"Log In\"]")
		WebElement LogInButton;
		
		@FindBy(xpath="//*[@id=\"loginPanel\"]/p[1]/a")
		WebElement ForgotloginInfo;
		
		@FindBy(css="[href='register.htm']")
		WebElement RegisterLink;
		
		public void  loginchecks() {
			usernamelink.isDisplayed();
			passwordlink.isDisplayed();
			ForgotloginInfo.isDisplayed();
			RegisterLink.isDisplayed();
		}
		
		public void login(String username, String password) {
			usernamelink.sendKeys(username);
			passwordlink.sendKeys(password);
			LogInButton.click();
		}
	


}
