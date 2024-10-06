package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditonalmethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        //isDisplayed()
        WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Display status of logo " + logo.isDisplayed());

        boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Display status is: " + status);

        //isEnabled
        boolean textstatus = driver.findElement(By.xpath("//input[@placeholder='Search store']")).isEnabled();
        System.out.println("Search box is Enabled" + textstatus);

        //boolean maleradiobtn = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
        //System.out.println("Male Radio box is enabled" + maleradiobtn);


        //isSelected
        WebElement maleradiobtn = driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement femaleradiobtn = driver.findElement(By.xpath("//input[@id='gender-female']"));

        System.out.println("Before ------");
        System.out.println(maleradiobtn.isSelected());
        System.out.println(femaleradiobtn.isSelected());

        //maleradiobtn.click(); -- select male radio button

        femaleradiobtn.click();
        System.out.println("After ------");
        System.out.println(maleradiobtn.isSelected());
        System.out.println(femaleradiobtn.isSelected());

        boolean newsletterstatus = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        System.out.println("News Letter check box is checked " + newsletterstatus);

    }
}
