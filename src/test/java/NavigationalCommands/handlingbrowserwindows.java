package NavigationalCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class handlingbrowserwindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();
        Set<String> windowids = driver.getWindowHandles();

        //Approach -1 -- It will convert set collection into list collection

        List<String> windowlist = new ArrayList<>(windowids);
        String parentid = windowlist.get(0);
        String childid = windowlist.get(1);

        System.out.println(driver.getTitle());

        //switch to childwindow
         driver.switchTo().window(childid);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());

        //Approach -2 -- looping statements

        for(String winid : windowids)
        {
            String title = driver.switchTo().window(winid).getTitle();
            if (title.equals("OrangeHRM"))
            {
                System.out.println(driver.getCurrentUrl());
                //somevalidation on parent window
            }
        }


    }
}
