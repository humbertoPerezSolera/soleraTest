package Pages;


import java.io.File;
import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {
    WebDriver driver;
    //Constructor that will be automatically called as soon as the object of the class is created
    public GooglePage(WebDriver driver) {
        this.driver=driver;
    }

    By cookies = By.id("L2AGLb");
    By searchBox = By.xpath("//input[@name = 'q']");


    public void acceptCookies() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(cookies)).click();
    }

    public void enterSearch(String search) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchInput = driver.findElement(searchBox);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput)).click();
        searchInput.sendKeys(search);
        searchInput.sendKeys(Keys.ENTER);
    }


}
