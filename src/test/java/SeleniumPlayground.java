import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPlayground {
    WebDriver driver;
    WebElement field;
    @Before
    public void setups(){
        driver = new FirefoxDriver();
        driver.get("http://seleniumplayground.vectordesign.gr/");
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void tryIdSelector() {
        field = driver.findElement(By.id("id-playground-field"));
        field.sendKeys("Hello Id Selector");
    }

    @Test
    public void tryNameSelector() {
        field = driver.findElement(By.name("name-playground-field"));
        field.sendKeys("Hello Name Selector");
    }

    @Test
    public void tryClassSelector() {
        field = driver.findElement(By.className("class-playground-field"));
        field.sendKeys("Hello Class Selector");
    }

    @Test
    public void tryCSSSelector() {
        field = driver.findElement(By.cssSelector(".css-playground-field"));
        field.sendKeys("Hello CSS Selector");
    }

//    @Test
//    public void tryXpathSelector() {
//        field = driver.findElement(By.xpath("//html/body/div/div[2]/div[2]/form/div[2]/div[4]/input"));
//        field.sendKeys("Hello xpath Selector");
//    }

    @Test
    public void tryTagNameSelector() {
        field = driver.findElement(By.tagName("textarea"));
        field.sendKeys("Hello Tag Name Selector");
    }

    @Test
    public void trySelectBox() {
        Select dropdown = new Select(driver.findElement(By.id("sword-playground-dropdown")));
        dropdown.selectByValue("apollo");

    }
}
