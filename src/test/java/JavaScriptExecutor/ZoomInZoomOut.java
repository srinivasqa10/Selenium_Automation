package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInZoomOut {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.body.style.zoom='50%'"); // it will set zoom level 50%
        Thread.sleep(5000);

        js.executeScript("document.body.style.zoom='100%'");
    }
}
