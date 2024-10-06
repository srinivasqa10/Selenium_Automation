package KeyboardActions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OpenLinkInNewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        WebElement reg= driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        Actions act = new Actions(driver);

        //Control + Reg Link
        act.keyDown(Keys.CONTROL).click(reg).keyUp(Keys.CONTROL).perform();

        //Switching to registration page
        List<String> ids = new ArrayList(driver.getWindowHandles());

        driver.switchTo().window(ids.get(1)); //switching to registration page

        //HomePage
        driver.switchTo().window(ids.get(0));



    }
}
