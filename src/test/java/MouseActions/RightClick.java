package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();

        //RightClick
        WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions act= new Actions(driver);
        act.contextClick(rclick).perform();

        Thread.sleep(3000);

        //click on copy
        driver.findElement(By.xpath("//span[text()='Copy']")).click();

        Thread.sleep(3000);

        //close alert box
        driver.switchTo().alert().accept();
    }
}
