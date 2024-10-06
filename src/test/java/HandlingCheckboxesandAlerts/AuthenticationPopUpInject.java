package HandlingCheckboxesandAlerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthenticationPopUpInject {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit Wait
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        
    }
}
