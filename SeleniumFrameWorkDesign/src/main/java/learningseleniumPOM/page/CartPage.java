package learningseleniumPOM.page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import learningseleniumPOM.abstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent{
	
	
	WebDriver driver;
	
	
	public CartPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactory
	@FindBy(css=".totalRow button")
	WebElement checkoutEle;
	
	
	@FindBy(css=".cartSection h3")
	private List<WebElement> cartproducts;
	
	@FindBy(id="login")
	WebElement submit;
	
	
	//Action Methods
	
	public Boolean VerifyProductDisplay(String productname) {
		Boolean match = cartproducts.stream().anyMatch(cartprod->cartprod.getText().equalsIgnoreCase(productname));
		return match;
	}
	
	public CheckoutPage goToCheckout() {
		checkoutEle.click();
		return new CheckoutPage(driver);
	}
	
}
