package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame1 -- WebElement
        WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); //switch to frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Test");

        driver.switchTo().defaultContent(); //go back to page

        //Frame2 --
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2); //switch to frame 2
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Test");

        driver.switchTo().defaultContent(); //go back to page


    }
}
