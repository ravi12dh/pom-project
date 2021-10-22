package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	public  DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//h2[contains(test(), 'Dashboard']") 
	WebElement DASHBOARD_HEADER_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a") 
	WebElement CUSTOMER_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") 
	WebElement ADD_CUSTOMER_FIELD_LOCATOR;
	
	//INTERACTIVE METHOD
	public void validateDashboardHeader() {
		Assert.assertEquals(DASHBOARD_HEADER_FIELD.getText(), "Dashboard", "dashboard page not found");
	}
	public void clickOnCustomerButton() {
		CUSTOMER_FIELD_LOCATOR.click();
	}
	
	public void clickOnAddCustomerButton() {
		waitForElement(driver, 10, ADD_CUSTOMER_FIELD_LOCATOR);
		ADD_CUSTOMER_FIELD_LOCATOR.click();
	}
	public void waitForElement(WebDriver driver, int timeInSeconds, WebElement elementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(elementLocator) );
}
}