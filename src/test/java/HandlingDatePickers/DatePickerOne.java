package HandlingDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerOne {

    static void selectMonthandYear(WebDriver driver, String month, String year)
    {
        //select month and year
        while(true)
        {
            String currentmonth =   driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
            String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year

            if(currentmonth.equals(month) && currentyear.equals(year))
            {
                break;
            }

            driver.findElement(By.xpath("//a[@data-handler='next']//span")).click(); //Next
        }
    }

    static void selectDate(WebDriver driver, String date)
    {

        //select the date
        List<WebElement> vardates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
        for (WebElement dt: vardates)
        {
            if (dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        //switch to frame
        driver.switchTo().frame(0);


        //Methos1 - using senkeys
        //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");

        //Method 2 - using date picker

        //Expected data
        String year ="2025";
        String month = "May";
        String date = "20";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker

        selectMonthandYear(driver, month, year);
        Thread.sleep(5000);
        selectDate(driver, date);




    }
}
