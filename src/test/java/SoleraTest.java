import Pages.GooglePage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoleraTest {

    private WebDriver driver;
    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void searchSoleraOnGoogle(){
        GooglePage googlePage = new GooglePage(driver);
        googlePage.goToMainPage();
        googlePage.acceptCookies();
        googlePage.enterSearch("solera inc");
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
