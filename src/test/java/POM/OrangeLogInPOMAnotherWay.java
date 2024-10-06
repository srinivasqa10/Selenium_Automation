package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrangeLogInPOMAnotherWay {

    WebDriver driver;
    //constructor
    OrangeLogInPOMAnotherWay(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }


    //Locators
    /*By txt_username_loc = By.xpath("//input[@placeholder='username']");
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
    }*/

    //Locators Page Factory
    @FindBy(xpath = "//input[@placeholder='username']")
    WebElement txt_username;
    @FindBy(xpath = "//input[@placeholder='password']")
    WebElement txt_password;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btn_login;

    @FindBy(tagName="a")
    List<WebElement> links;

    //ActionMethods
    public void setUserName(String user)
    {
        txt_username.sendKeys(user);
    }

    public void setPassword(String pwd)
    {
        txt_password.sendKeys(pwd);
    }

    public void clickLogIn()
    {
        btn_login.click();
    }

}
