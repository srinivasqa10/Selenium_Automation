package learningseleniumPOM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import learningseleniumPOM.abstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent {
	
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;

	
	@FindBy(css=".action_submit")
	WebElement submit;
	
	//button[contains@class,'ta-item')])[2]
	
	@FindBy(xpath="//button[contains@class,'ta-item')])[2]")
	WebElement selectcountry;
	
	By results = By.cssSelector(".ta-results");
	
	
	public void selectCountry(String countryname)
	{
		Actions a = new Actions(driver);
		
		a.sendKeys(country, countryname).build().perform();
        
		waitForElementToAppear(results);
        
		selectcountry.click();
	}
	
	public ConfirmationPage submitOrder()
	{
		submit.click();
		return new ConfirmationPage(driver);
	}

}
