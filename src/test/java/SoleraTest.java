import Pages.GooglePage;
import org.testng.annotations.Test;

public class SoleraTest extends BaseTest{

    @Test
    public void searchSoleraOnGoogle(){
        GooglePage googlePage = new GooglePage(driver);
        googlePage.acceptCookies();
        googlePage.enterSearch("solera inc");
    }

}
