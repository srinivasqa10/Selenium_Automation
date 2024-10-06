package CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();

        //tagId   tag#id or #id
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("messifootball@test.com");

        //tagClass  tag.classname or .classname
        driver.findElement(By.cssSelector(("input.btn"))).click();


        //tag attribute  tag[attribute='value']
       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Sonumessi@46");

       //tag class attribute tag.classname[attribute='value']
        driver.findElement(By.cssSelector("input.btn[value='Login']")).click();


    }
}
