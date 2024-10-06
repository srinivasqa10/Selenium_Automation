package HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/index.php?route=customer/customer&user");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.clear();
        username.sendKeys("demo");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.clear();
        password.sendKeys("demo");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//a[@class='parent']")).click();

        driver.findElement(By.xpath("//ul[@class='collapse show']//a[text()='Customers']")).click();

        //Showing pages
        String text =driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
        int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));

        //clicking on next page button until we reach last page
        for (int p=1; p<5; p++)
        {
            if (p>1)
            {
                WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
                active_page.click();
            }
            //reading data from the page
            int noofrows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();

            for (int r=1; r<=noofrows; r++)
            {
                String customername = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
                String emailname = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
                String stats = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();

                System.out.println(customername+"\t"+emailname+"\t"+ stats);
            }

        }


    }
}
