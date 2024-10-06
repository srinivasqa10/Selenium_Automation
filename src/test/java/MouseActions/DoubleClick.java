package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
        driver.manage().window().maximize();
        Thread.sleep(3000 );

        driver.switchTo().frame("iframeResult");

        WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-click me']"));
        Thread.sleep(3000);

        //Double click
        Actions act = new Actions(driver);
        act.doubleClick(dclick).perform();

        String validate = driver.findElement(By.xpath("//p[text()='Hello World']")).getText();

        System.out.println(validate);
        if (validate.equals("Hello World"))
        {
            System.out.println("Matches");
        }
        else
        {
            System.out.println("Not Matches");
        }
    }
}
