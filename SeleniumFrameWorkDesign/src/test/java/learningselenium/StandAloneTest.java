package learningselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		
		String prodname = "ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("messifootball@test.com");
		driver.findElement(By.id("userPassword")).sendKeys("Sonumessi@46");
		
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		WebElement prod = products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(prodname)).findFirst().orElse(null);
	
	        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	        
	        
	        
	        
	        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-containser")));
	        
	        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animated"))));
	        
	        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
	        
	        
	       // List<WebElement> cartproducts = driver.findElements(By.cssSelector(".cartSection h3"));
	        
	        //Boolean match = cartproducts.stream().anyMatch(cartprod->cartprod.getText().equalsIgnoreCase(prodname));
	        
	        //Assert.assertTrue(match);
	        
	        
	        driver.findElement(By.cssSelector(".totalRow button")).click();
	        
	        Actions a = new Actions(driver);
	        a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	        
	        driver.findElement(By.xpath("(//button[contains@class,'ta-item')])[2]")).click();
	        driver.findElement(By.cssSelector(".action_submit")).click();
	        
	        String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
	        
	        driver.close();
	
	}
	

}
	 