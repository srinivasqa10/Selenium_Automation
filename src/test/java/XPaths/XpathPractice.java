package XPaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //Xpath with Single attribute
        driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Mac");

        //Xpath with multiple attributes
        driver.findElement(By.xpath("//input[@name='search'][@type='text']")).sendKeys("Test");


        //Xpath with and operator
        driver.findElement(By.xpath("//input[@name='search' and @type='text']")).sendKeys("Test");


        //Xpath with OR operator
        driver.findElement(By.xpath("//input[@name='search' or @type='text']")).sendKeys("Test");

        //Xpath with Inner Text
        driver.findElement(By.xpath("//*[text()='MacBook']")).click();

        //Xpath with contains
        driver.findElement((By.xpath("//input[contains(@placeholder,'Sea')]"))).sendKeys("Test");

        //Xpath with stat-with
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Test");


        //Chained Xpath
        boolean status =driver.findElement(By.xpath("//div[@id=’logo’]/a/img")).isDisplayed();
        System.out.println(status);
    }
}
