
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageTest {
    WebDriver driver;
    @Before
    public void setUps(){
        driver = new FirefoxDriver();
        driver.get("http://seleniumplayground.vectordesign.gr/");
    }

    @After
    public void tearDown(){
       //driver.quit();
    }

    @Test
    public void openLoginPage(){
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Selenium Playground"));

    }

    @Test
    public void validateElementPresence(){
           WebElement post =  driver.findElement(By.id("post-15"));
           String postText = post.getText();
           System.out.println(postText);
        Assert.assertTrue(postText.contains(" Responsive Elements"));

    }

    @Test
    public void enterDataInField(){
        WebElement field =  driver.findElement(By.id("id-playground-field"));
        field.sendKeys("someRandomText");

    }
}
