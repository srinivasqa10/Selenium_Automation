package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignmentOneDemoBlaze {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();

        List<WebElement> linkcount = driver.findElements(By.className("nav-item"));
        System.out.println("Total no of links " + linkcount.size());

        List<WebElement> imagecount =driver.findElements(By.tagName("img"));
        System.out.println("Total no of Images " + imagecount.size());

        List<WebElement> imagescount =driver.findElements(By.className("card-img-top"));
        System.out.println("Total no of Images " + imagescount.size());

        driver.findElement(By.linkText("Contact")).click();
    }
}
