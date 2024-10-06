package NavigationalCommands;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class navigational {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.opencart.com/"); // -- accepts in string format
        //driver.navigate().to("https://demo.opencart.com/");  //accepts in string format and also in URL OBJECT

        /*URL myurl = new URL("https://demo.opencart.com/");
        driver.navigate().to(myurl);*/
        driver.navigate().to("https://demo.opencart.com/");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

    }
}
