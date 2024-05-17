
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ParisTest {
    WebDriver driver;

    @Before
    public void setUps() {
        driver = new FirefoxDriver();
        driver.get("http://seleniumplayground.vectordesign.gr/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {
        //   driver.quit();
    }

    //Changing multiple Data fields on the same page.
    @Test
    public void byID() {
        driver.findElement(By.id("id-playground-field")).sendKeys("Id Field Here My G");
        String post = driver.findElement(By.id("id-playground-field")).getText();
        System.out.println("Keys have been sent now the text follows" + post + "Den paizei na mhn to vlepei kan");
        System.out.println(post);
        System.out.println("Keys have been sent now the text follows" + post);
        System.out.println(post);
       // Assert.assertTrue(postText.contains("Id Field Here my G"));
    }

    @Test
    public void byName() {
        driver.findElement(By.name("name-playground-field")).sendKeys("Name Field Here");
    }

    @Test
    public void byClassName() {
        driver.findElement(By.className("class-playground-field")).sendKeys("Class Field here!!!!!!");
    }

    @Test
    public void byCssSelector() {
        driver.findElement(By.cssSelector(".css-playground-field")).sendKeys("CSSs Field here!!!!!!");
    }

    @Test
    public void byXpath() {
        try {
            driver.findElement(By.xpath("/html/body/main/article[5]/div[1]/div/div[2]/div[2]/div[1]/div[3]/div[4]/input"))
                    .sendKeys("We have finally changed the Xpath");
        } catch (NoSuchElementException e) {
            System.out.println("\n\n\n" + e + "\n\nXPATH HAS FAILED!");
        }
    }

    @Test
    public void byTagName() {
        driver.findElement(By.tagName("textarea")).sendKeys("That's all Folks! ");
    }

    //Select the drop down option.
 //   @Test
    public void doByValue() {
        WebElement dropdown = driver.findElement(By.id("sword-playground-dropdown"));
        new Actions(driver).scrollToElement(dropdown).perform();
//        Select select1 = new Select(driver.findElement(By.id("sword-playground-dropdown")));
//        try {
//            select1.selectByValue("apollo");
//        } catch (ElementNotInteractableException e) {
//            System.out.println("Select by Value has failed");
//        }
    }

    @Test
    public void doByVisibleText() {
        Select dropdown = new Select(driver.findElement(By.id("sword-playground-dropdown")));
        try {
            dropdown.selectByVisibleText("Apollo");
        } catch (ElementNotInteractableException e) {
            System.out.println("Select by Visible has failed");
        }
    }

    @Test
    public void doByIndex(){
        Select objSelect = new Select(driver.findElement(By.id("sword-playground-dropdown")));
        driver.findElement(By.id("sword-playground-dropdown")).click();
        objSelect.selectByIndex(3);
//        Select dropdown = new Select(driver.findElement(By.id("sword-playground-dropdown")));
//        try {
//            dropdown.selectByIndex(3);
//        } catch (ElementNotInteractableException e) {
//            System.out.println("Select by Index has failed");
//        }
    }
}
