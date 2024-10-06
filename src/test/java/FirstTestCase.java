import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

      /*
        1. Launch Browser(chrome)
        2. Open URL
        3. Validate title should open
        4. Close browser
         */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/client");
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
