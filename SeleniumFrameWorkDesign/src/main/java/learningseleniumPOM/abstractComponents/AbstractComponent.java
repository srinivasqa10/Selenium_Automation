package learningseleniumPOM.abstractComponents;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	
	//This will be parent class for all POM Classes
	
	WebDriver driver;
	public AbstractComponent(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(css="button[routerlink*='cart']")
	WebElement cartheader;

	public void waitForElementToAppear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated((findBy)));
	}
	
	public void goToCartPage()
	{
		cartheader.click();
	}
	
	public void waitForElementToDisappear(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}

}
