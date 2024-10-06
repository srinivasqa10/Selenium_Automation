package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        Thread.sleep(5000);
        //MouseHover
        WebElement desktops =driver.findElement(By.xpath("(//a[normalize-space()='Desktops'])[1]"));
        WebElement mac =driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
        Actions act = new Actions(driver);
        act.moveToElement(desktops).moveToElement(mac).click().build().perform();



    }
}
