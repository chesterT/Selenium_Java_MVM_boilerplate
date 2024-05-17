import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class NewTestsVasilis {
    WebDriver driver;

    @Before
    public void setUps() {
        driver = new ChromeDriver();//creaTE DRIVER
        driver.get("http://seleniumplayground.vectordesign.gr/"); //import the page
        driver.manage().window().maximize(); //maximize the window for better view
        System.out.println("The page is open");


    }


    @After
    public void tearDown() {
        //driver.quit();

    }


    @Test
    public void Filling() {
        WebElement post = driver.findElement(By.name("name-playground-field"));
        String postText = post.getText();
        System.out.println(postText);
        Assert.assertTrue(true);
        driver.findElement(By.name("name-playground-field")).sendKeys("aaa");
        driver.findElement(By.className("class-playground-field")).sendKeys("aaa");
        driver.findElement(By.cssSelector(".css-playground-field")).sendKeys("aaa");
        //driver.findElement(By.xpath("/html/body/main/article[5]/div[1]/div/div[2]/div[2]/div[1]/div[3]/div[4]/input")).sendKeys("aaa");
    }

    @Test

    public void ClickButton() throws Exception {
        WebElement dropdownElement = driver.findElement(By.id("sword-playground-dropdown"));
        new Actions(driver).scrollToElement(dropdownElement).perform();
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("apollo");

    }


    //driver.close();
    //System.out.println("Test Finished");
}
