import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public static WebDriver driver;
    public static Properties properties = new Properties();

    @BeforeTest
    public void setUp() throws IOException {
        if (driver==null){
            FileReader fr = new FileReader("src/main/java/Utils/config.properties");
            properties.load(fr);
        }
        if(properties.getProperty("browser").equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(properties.getProperty("testurl"));
        }
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }


}
