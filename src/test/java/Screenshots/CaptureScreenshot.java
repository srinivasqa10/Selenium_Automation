package Screenshots;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class CaptureScreenshot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Capture full Page Screenshot
        TakesScreenshot ts= (TakesScreenshot) driver;

        /*File sourcefile = ts.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+ "\\screenshots\\fullpage.png");
        sourcefile.renameTo(targetfile); //It will copy the source file to target file */


        //Capture the screenshot of specific section
        /* WebElement featuredproduct = driver.findElement(By.xpath("//div[@class='form-group'][4]"));
        File sourcefile  = featuredproduct.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+ "\\screenshots\\featuresproduct.png");
        sourcefile.renameTo(targetfile);*/

        //Capture the screenshot of Specific WebElement

        WebElement logo = driver.findElement(By.xpath("//h1[@class='title']"));
        File sourcefile  = logo.getScreenshotAs(OutputType.FILE);
        File targetfile=new File(System.getProperty("user.dir")+ "\\screenshots\\logo.png");
        sourcefile.renameTo(targetfile);



    }
}
