package HandlingCheckboxesandAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertwithoutswitchTo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10)); //Explicit Wait
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //We Can use Explicit Wait -- without using switchTo

        Alert alert = mywait.until(ExpectedConditions.alertIsPresent()); //Capture Alert
        System.out.println(alert.getText());
        alert.accept();
    }
}
