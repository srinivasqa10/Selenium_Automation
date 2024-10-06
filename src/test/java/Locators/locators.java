package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

        //nameLcator
        //driver.findElement(By.name("search")).sendKeys("Mac");

        //IdLocator
       // boolean logodisplay = driver.findElement(By.id("logo")).isDisplayed();
        //System.out.println(logodisplay);

        //LinkText and PartialLinkText
        //driver.findElement(By.linkText("Tablets")).click();

        //driver.findElement(By.partialLinkText("Table")).click();


         //ClassLocator
        List<WebElement> headerlinks = driver.findElements(By.className("list-inline-item"));

        System.out.println("Total no. of header links " + headerlinks.size());

        //TagLocator
        List<WebElement> linksvar=driver.findElements(By.tagName("a"));
        System.out.println("Total no of links " + linksvar.size());

        List<WebElement> imagevar =driver.findElements(By.tagName("img"));
        System.out.println("Total no of images " +imagevar.size());
    }
}
