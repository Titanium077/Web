package lesson3_HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestOne {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/");

        WebElement webElement1 = driver.findElement(By.cssSelector(".s-header-item__link--login"));
        webElement1.click();

        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        WebElement webElement2 = driver.findElement(By.cssSelector("#user"));
        webElement2.sendKeys("Tester_GB");

        WebElement webElement3 = driver.findElement(By.id("lj_loginwidget_password"));
        webElement3.sendKeys("B3aTVY773");

        WebElement webElement4 = driver.findElement(By.cssSelector("button.b-loginform-btn:nth-child(4)"));
        webElement4.click();

        driver.quit();
    }
}
