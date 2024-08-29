package learningseleniumPOM.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import learningseleniumPOM.abstractComponents.AbstractComponent;

public class ProductCatalouge extends AbstractComponent {
	
	
	WebDriver driver;
	
	
	public ProductCatalouge(WebDriver driver)
	{
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//PageFactory
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	By productsBy = By.cssSelector(".mb-3");
	By addproduct = By.cssSelector(".card-body button:last-of-type");
	By toastmessage = By.cssSelector("#toast-container");
	public List<WebElement> getProductList()
	{
		waitForElementToAppear(productsBy);
		return products; 
	}
	
	
	public WebElement getProductByName(String productname)
	{
		WebElement prod = getProductList().stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(productname)).findFirst().orElse(null);
	    prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
	    return prod;
	}
	
	public void addProductToCart(String productName)
	{
		WebElement prod = getProductByName(productName);
		prod.findElement(addproduct).click();
		waitForElementToAppear(toastmessage);
		waitForElementToDisappear(spinner);
	}
	

}
