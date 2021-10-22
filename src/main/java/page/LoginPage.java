package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	
	public  LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element library
	
	
	//WebElement USERNAME_ELEMENT = driver.findElement(By.xpath("//*[@id='username']"));
	//By USER_NAME_FIELD = By.xpath("//*[@id='username']");
	
	@FindBy(how = How.XPATH, using = "//*[@id='username']") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id='password']") WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@name='login']") WebElement SIGNIN_FIELD;
	
	
	
	
	//Interactive method
	public void enterUserName(String username) {
		USERNAME_FIELD.sendKeys(username);
		
	}	
		public void enterPassword(String password) {	
		  PASSWORD_FIELD.sendKeys(password);
	}
		public void clickSignIn() {	
			SIGNIN_FIELD.click();
    }
		/*public void login(String userName, String password) {
			USERNAME_FIELD.sendKeys(userName);
			PASSWORD_FIELD.sendKeys(password);
			SIGNIN_FIELD.click();
		}	*/
}
	

