package HandlingCheckboxesandAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //singlecheckbox
        //driver.findElement(By.xpath("//input[@id='sunday']")).click();

        //multiplecheckbox
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        //normal for loop
        /*for (int i=0; i<=checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }*/

        //enhanced for loop
        /*for(WebElement checkbox: checkboxes)
        {
            checkbox.click();
        }*/

        //select last 3 checkboxes -- Here we can use only normal for loop
        /*for (int i=4; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }*/

        //select first 3 checkboxes
        for (int i=0; i<3; i++)
        {
            checkboxes.get(i).click();
        }

        //Thread.sleep(3000);

        //unselect checkboxes if they are selected
        for (int i=0; i<checkboxes.size(); i++)
        {
            if (checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }

        }

    }
}
