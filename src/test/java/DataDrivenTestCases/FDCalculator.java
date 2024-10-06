package DataDrivenTestCases;

import UtilityFiles.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FDCalculator {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        driver.manage().window().maximize();

        String filepath = System.getProperty("user.dir") +"\\testdata\\FixedDepositData.xlsx";

        int rows = ExcelUtils.getRowCount(filepath, "Sheet1");

        for (int i=1; i<=rows; i++)
        {
            //read data from excel
            String price=ExcelUtils.getCellData(filepath, "Sheet1", i, 0);
            String rateofinterest=ExcelUtils.getCellData(filepath, "Sheet1", i, 1);
            String per1=ExcelUtils.getCellData(filepath, "Sheet1", i, 2);
            String per2=ExcelUtils.getCellData(filepath, "Sheet1", i, 3);
            String freq=ExcelUtils.getCellData(filepath, "Sheet1", i, 4);

            String exp_mvalue=ExcelUtils.getCellData(filepath, "Sheet1", i, 5);

            //pass above data into application
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(price);
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);

            Select perdrop = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));

            perdrop.selectByVisibleText(per2);

            Select fredrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));

            fredrp.selectByVisibleText(freq);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();

            //validation
            String act_value = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();

            if (Double.parseDouble(exp_mvalue)==Double.parseDouble(act_value))
            {
                System.out.println("Value is matching");
                ExcelUtils.setCellData(filepath,"Sheet1", i, 7, "Passed");
                ExcelUtils.fillGreenColor(filepath,"Sheet1",i,7);
            }
            else
            {
                System.out.println("Value is not matching");
                ExcelUtils.setCellData(filepath,"Sheet1", i, 7, "Failed");
                ExcelUtils.fillRedColor(filepath,"Sheet1",i,7);
            }
            Thread.sleep(3000);
            driver.findElement(By.xpath("//img[@class='PL5']")).click();

        }
        driver.quit();
    }
}
