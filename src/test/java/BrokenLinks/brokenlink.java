package BrokenLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenlink {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total no of links: " + links.size());

        int noOfBrokenLinks = 0;

        for (WebElement linkElement:links)
        {
            String hrefattValue = linkElement.getAttribute("href");
            if (hrefattValue == null || hrefattValue.isEmpty())
            {
                System.out.println("href attribute value is null or empty, So not possible to check");
                continue;
            }

            //hit url to the server
            try {

                URL linkurl = new URL(hrefattValue); //converted href value from string to URL format
                HttpURLConnection conn = (HttpURLConnection) linkurl.openConnection(); //it will open connection to the server
                conn.connect();  //connect to server and sent request to the server

                if (conn.getResponseCode() >= 400) {
                    System.out.println("It is a broken link" + hrefattValue);
                    noOfBrokenLinks++;
                } else {
                    System.out.println("Not a broken link" + hrefattValue);
                }
            } catch (Exception e)
            {

            }
        }
        System.out.println("No of Broken Links:" + noOfBrokenLinks);
    }
}
