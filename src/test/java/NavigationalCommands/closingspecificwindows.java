package NavigationalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class closingspecificwindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();
        Set<String> windowids = driver.getWindowHandles();

        for (String winid: windowids)
        {
            String title = driver.switchTo().window(winid).getTitle();
            System.out.println(title);

            if (title.equals("Human Resources Management Software | OrangeHRM"))
            {
                driver.close();
            }
        }
    }
}
