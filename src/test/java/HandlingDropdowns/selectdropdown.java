package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class selectdropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //Store the elements in a variable
        WebElement drpElement =driver.findElement(By.xpath("//select[@id='country']"));

        Select drpCountry = new Select(drpElement);

        //selecting a option from dropdown
        //drpCountry.selectByVisibleText("Canada");

        //drpCountry.selectByValue("japan");

        drpCountry.selectByIndex(2);

        //counting options in a dropdown
        List<WebElement> options = drpCountry.getOptions();
        System.out.println("Number of options in a drop down: " + options.size());


        //Printing the options
        //we can use for loop
        /*for (int i=0; i<options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        }*/

        //Using Enhanced for loop
        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }



    }
}
