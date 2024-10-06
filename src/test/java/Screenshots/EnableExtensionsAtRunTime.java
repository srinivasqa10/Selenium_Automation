package Screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRunTime {

      /*
        1. Launch Browser(chrome)
        2. Open URL
        3. Validate title should open
        4. Close browser
         */

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

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
