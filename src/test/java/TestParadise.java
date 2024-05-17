import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestParadise {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://seleniumplayground.vectordesign.gr/");
        driver.manage().window().maximize();
    }

    @Test
    public void mainPageByXpath() {
        WebElement titleTL = driver.findElement(By.xpath("//h1[@class='site-title']//a[normalize-space()='Selenium Playground']"));
        titleTL.click();
        Assert.assertTrue(driver.getTitle().contains("Selenium Playground"));
    }

    @Test
    public void mainPageSubTitleByClassName() {
        WebElement subTitleTL = driver.findElement(By.className("site-description"));
        System.out.println(subTitleTL.getText());
//        String expectedSubTitleTL = "Just another WorldPress site";
//        Assert.assertEquals(subTitleTL.toString(), expectedSubTitleTL);
    }

    @Test
    public void magnifyingGlass() {
        WebElement magGlass = driver.findElement(By.className("svg-icon"));
        magGlass.click();
        WebElement searchForm = driver.findElement(By.id("search-form-1"));
        Assert.assertTrue(searchForm.isDisplayed());
    }

    @Test
    public void fillFields() {
        WebElement fieldFiller = driver.findElement(By.id("id-playground-field"));
        fieldFiller.sendKeys("AT123456");
        Assert.assertEquals("AT123456", fieldFiller.getText());
    }

    @Test
    public void dropDownBox() {
        WebElement DDB = driver.findElement(By.id("sword-playground-dropdown"));
        DDB.click();
        WebElement Husker = driver.findElement(By.xpath("/html/body/main/article[5]/div[1]/div/div[2]/div[2]/div[2]/div[2]/div/select/option[1]"));
        Husker.click();
        Assert.assertTrue(Husker.isSelected());
    }

    @Test
    public void checkBox1() {
        WebElement checkBox1 = driver.findElement(By.id("pokemonRed"));
        checkBox1.click();
        boolean checkedCheckBox1 = checkBox1.isSelected();
        Assert.assertTrue(checkedCheckBox1);
    }

    @Test
    public void checkBox2() {
        WebElement checkBox2 = driver.findElement(By.id("pokemonBlue"));
        checkBox2.click();
        boolean checkedCheckBox2 = checkBox2.isSelected();
        Assert.assertTrue(checkedCheckBox2);
    }

    @Test
    public void checkBox3() {
        WebElement checkBox3 = driver.findElement(By.id("checkbox1"));
        checkBox3.click();
        boolean checkedCheckBox3 = checkBox3.isSelected();
        Assert.assertTrue(checkedCheckBox3);
    }

    @Test
    public void checkBox4() {
        WebElement checkBox4 = driver.findElement(By.id("checkbox2"));
        checkBox4.click();
        boolean checkedCheckBox4 = checkBox4.isSelected();
        Assert.assertTrue(checkedCheckBox4);
    }

    @After
    public void shutDown() {
        driver.close();
    }
}
