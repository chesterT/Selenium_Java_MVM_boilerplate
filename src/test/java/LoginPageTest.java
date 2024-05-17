
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
      // driver.quit();
    }

    @Test
    public void openLoginPage(){
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Selenium Playground"));

    }

    @Test
    public void validateElementPresence(){
           WebElement post = driver.findElement(By.id("post-15"));
           String postText = post.getText();
           System.out.println(postText);
           Assert.assertTrue(postText.contains(" Responsive Elements"));

    }

    @Test
    public void enterDataInFieldbyID(){
        WebElement field =  driver.findElement(By.id("id-playground-field"));
        field.sendKeys("Hello Id Selector");

    }

    @Test
    public void enterDataInFieldbyName() {
        WebElement field = driver.findElement(By.name("name-playground-field"));
        field.sendKeys("Hello Name Selector");
    }

    @Test
    public void enterDataInFieldbyClassName() {
        WebElement field = driver.findElement(By.className("class-playground-field"));
        field.sendKeys("Hello Class Selector");
    }

    @Test
    public void enterDataInFieldCSS() {
        WebElement field = driver.findElement(By.cssSelector(".css-playground-field"));
        field.sendKeys("Hello CSS Selector");
    }

    @Test
    public void enterDataInFieldbyxpath() {
        WebElement field = driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[4]/input"));
        field.sendKeys("Hello xpath Selector");
    }

    @Test
    public void enterDataInFieldbytagName() {
        WebElement field = driver.findElement(By.tagName("textarea"));
        field.sendKeys("Hello tag name Selector");
    }

    @Test
    public  void  ClickButton() throws Exception {
       // WebElement dropdownElement = driver.findElement();
    }




}
