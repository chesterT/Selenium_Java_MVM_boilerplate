import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstJunitTest {
WebDriver driver;
   @Test
   public void helloSeleniumFF(){
       driver = new FirefoxDriver();
       driver.get("https://www.google.com/");
   }
    @Test
    public void helloSeleniumChrome(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    @Test
    public void helloSeleniumEdge(){
        driver = new EdgeDriver();
        driver.get("https://www.google.com/");
    }

   @After
    public void tearDown(){
       driver.quit();
   }
}
