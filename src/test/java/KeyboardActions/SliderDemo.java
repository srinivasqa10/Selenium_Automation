package KeyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo  {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        Actions act= new Actions(driver);

        //Min Slider
        WebElement min_slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Before:" + min_slider.getLocation());
        act.dragAndDropBy(min_slider,100,249).perform();
        System.out.println("After:" + min_slider.getLocation());

        //Max Slider
        WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Before" + max_slider);
        act.dragAndDropBy(max_slider,49,249).perform();
        System.out.println("After" + max_slider);
    }
}
