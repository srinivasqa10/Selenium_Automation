package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framecontainanotheriframe {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        //Frame 3

        WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

        driver.switchTo().frame(frame3);

        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Test");

        //INNER FRAME - Part of FRAME 3
        driver.switchTo().frame(0); //switching to frame using index

        //driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
        //driver.switchTo().defaultContent(); //go back to page

        //Java Script Executor
        WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",rdbutton);

    }
}
