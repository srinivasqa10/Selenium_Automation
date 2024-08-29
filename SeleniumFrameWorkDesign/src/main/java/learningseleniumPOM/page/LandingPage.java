package learningseleniumPOM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import learningseleniumPOM.abstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent{
	
	
	WebDriver driver;
	
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactory
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submit;
	
	
	//Action Methods
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public void loginApplication(String email, String pass)
	{
		userEmail.sendKeys(email);
		password.sendKeys(pass);
		submit.click();
	}

}
