package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeLogIn {

    WebDriver driver;
    //constructor
    OrangeLogIn(WebDriver driver)
    {
        this.driver=driver;
    }


    //Locators
    By txt_username_loc = By.xpath("//input[@placeholder='username']");
    By txt_password_loc = By.xpath("//input[@placeholder='password']");
    By btn_login_loc = By.xpath("//button[normalize-space()='Login']");

    //Action methods
    public void setUserName(String user)
    {
        driver.findElement(txt_username_loc).sendKeys(user);
    }

    public void setPassword(String pwd)
    {
        driver.findElement(txt_password_loc).sendKeys(pwd);
    }

    public void clickLogIn()
    {
        driver.findElement(btn_login_loc).click();
    }

}
