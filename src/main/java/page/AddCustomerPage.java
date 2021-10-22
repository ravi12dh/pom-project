package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends BasePage {
	WebDriver driver;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement USERNAME_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") 
	WebElement COMPANY_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") 
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") 
	WebElement PHONE_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDERSS_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") 
	WebElement COUNTRY_FIELD_LOCATOR;
	
	
	
	public void insertUserName(String username) {
		
		int genNum = randonGenerator(999);
		USERNAME_FIELD_LOCATOR.sendKeys(username + genNum);
	}

	public void insertCompanyName(String companyName) {
		selectDropDown(COMPANY_FIELD_LOCATOR, companyName);
	}

	
	public void insertEmailAddress(String email) {
		int genNum = randonGenerator(999);
		EMAIL_FIELD_LOCATOR.sendKeys(email + genNum);
		
	}
	
	
	public void insertPhoneNumber() {
		PHONE_FIELD_LOCATOR.sendKeys("6823600000");
	}
	
	public void insertAdderss() {
		ADDERSS_FIELD_LOCATOR.sendKeys("USA Texas");
	}
	
	
	
	public void enterCountryName(String countryName) {
		selectDropDown(COUNTRY_FIELD_LOCATOR, countryName);
	}
	
}
