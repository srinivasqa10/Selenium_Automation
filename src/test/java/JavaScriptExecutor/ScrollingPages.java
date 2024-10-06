package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPages {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //scroll down page by pixel number
        //js.executeScript("window.scrollBy(0,3000)","");
        //System.out.println(js.executeScript("return window.pageYOffset;"));

        //scroll the page till element is visible
        /*WebElement tag = driver.findElement(By.xpath("//h2[text()='XPath Axes']"));
        js.executeScript("arguments[0].scrollIntoView();", tag);
        System.out.println(js.executeScript("return window.pageYOffset;"));*/

        //Scroll page till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(3000);


        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));

    }
}
