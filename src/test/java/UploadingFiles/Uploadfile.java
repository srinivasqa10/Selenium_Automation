package UploadingFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //single file upload
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\ADMIN\\Documents\\New Text Document.txt");

        //Multiple files upload
        String file1 = "C:\\Users\\ADMIN\\Documents\\New Text Document.txt";
        String file2 = "C:\\Users\\ADMIN\\Documents\\Text.txt";

        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n"+ file2);

    }
}
