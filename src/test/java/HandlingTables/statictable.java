package HandlingTables;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //find total number of rows in a table
        int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println("Number of rows: " + rows);

        //find total number of columns in a table
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("Number of columns: " + columns);

        //Read data from specific row and column 9Ex: 5th Row and 1st Column)
        String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(bookname);

        //Read data from all the rows and columns --Nested for loop

        /*for (int r=2; r<=rows; r++)
        {
            for (int c=1; c<=columns; c++)
            {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
                System.out.print(value + "\t"); // the reverse slash symbol is for to get the data in table format

            }
            System.out.println();
        }*/

        //Print book name whose author is Mukesh
        /*for (int r =2; r<=rows; r++)
        {
            String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if (authorName.equals("Mukesh"))
            {
                 String bname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                 System.out.println(bname + "\t" + authorName);
            }
        }*/

        //Find total price of all the books
        int total =0;
        for (int r =2; r<=rows; r++)
        {
            String totalamount = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            total = total+ Integer.parseInt(totalamount);

        }
        System.out.println("Total no of price is: " +total);



    }
}
