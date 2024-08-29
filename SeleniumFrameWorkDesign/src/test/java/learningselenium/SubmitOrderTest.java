package learningselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import learningseleniumPOM.page.CartPage;
import learningseleniumPOM.page.CheckoutPage;
import learningseleniumPOM.page.ConfirmationPage;
import learningseleniumPOM.page.LandingPage;
import learningseleniumPOM.page.ProductCatalouge;

public class SubmitOrderTest {

	public static void main(String[] args) {
		
		String prodname = "ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.goTo();
		
		landingpage.loginApplication("messifootball@test.com", "Sonumessi@46");
		
		ProductCatalouge prodcatalog = new ProductCatalouge(driver);
		List<WebElement>products = prodcatalog.getProductList();
		
		prodcatalog.addProductToCart(prodname);
		
		prodcatalog.goToCartPage();
		
		
		CartPage cartpage = new CartPage(driver);
		Boolean match = cartpage.VerifyProductDisplay(prodname);
	        
	    Assert.assertTrue(match);
	    CheckoutPage checkoutpage = cartpage.goToCheckout();   
	    checkoutpage.selectCountry("India");
	    ConfirmationPage confirmpage = checkoutpage.submitOrder();
	    
	    
	        driver.findElement(By.cssSelector(".totalRow button")).click();
	        
	      
	        
	        driver.findElement(By.cssSelector(".action_submit")).click();
	        
	        String confirmMessage = confirmpage.getconfirmationMessage();
	        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	        
	        driver.close();
	
	}
	

}
	 