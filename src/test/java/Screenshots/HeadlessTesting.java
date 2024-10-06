package Screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");  //setting for headless mode of execution


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String title = driver.getTitle();

        System.out.println(title);

        if (title.equals("Let's Shop"))
        {
            System.out.println("Title is True " + title);
        }
        else {
            System.out.println("Title does not Match");
        }

        driver.quit();

    }
}
