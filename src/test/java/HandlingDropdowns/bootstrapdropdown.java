package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class bootstrapdropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        //Select single option
        driver.findElement(By.xpath("//button[@type='button']")).click();

        //capture all the options and find out size
        List<WebElement> options  =driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println("Number of options: " + options.size());

        //printing the options from dropdown
        /*for (WebElement op:options)
        {
            System.out.println(op.getText());
        }*/

        //select multiple options
        for (WebElement op: options)
        {
            String option = op.getText();
            if (option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
            {
                op.click();
            }
        }

    }
}
