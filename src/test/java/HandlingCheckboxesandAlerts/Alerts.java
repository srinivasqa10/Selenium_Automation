package HandlingCheckboxesandAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Normal alert with ok button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);

        Alert alerticon = driver.switchTo().alert();
        System.out.println(alerticon.getText());
        alerticon.accept();

        //confirmation alert with Ok and Cancel button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();   //close alert using ok button
        //driver.switchTo().alert().dismiss();  //close alert using dismiss button
        Thread.sleep(3000);
        //prompt alert - input box
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert mypromptalert = driver.switchTo().alert();
        mypromptalert.sendKeys("Test");
        mypromptalert.accept();

    }
}
