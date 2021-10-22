package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
 
	WebDriver driver;
	
	@Test
	public void validUserShouldAbleTologinTest() {
		
		
		driver = BrowserFactory.init();
		
		//LoginPage loginPage = new LoginPage();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterUserName("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickSignIn();
		//BrowserFactory.tearDown();
   
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardHeader();
		
		BrowserFactory.tearDown();
	}
}
