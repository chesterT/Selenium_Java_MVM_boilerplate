
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest {

    @Test
    public void openLoginPage(){
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.get("http://seleniumplayground.vectordesign.gr/");
        String title = driver.getTitle();
        Assert.assertEquals("Please sign in",title);
        driver.quit();
    }


}
