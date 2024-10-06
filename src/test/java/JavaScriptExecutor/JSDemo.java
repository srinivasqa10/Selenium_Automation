package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //JavaScriptExecutor

        //input box
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        //JavascriptExecutor js=  driver;
        js.executeScript("arguments[0].setAttribute('value','John')",inputbox);

        //radiobutton
        WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));

        js.executeScript("arguments[0].click()",radiobtn);
    }
}
