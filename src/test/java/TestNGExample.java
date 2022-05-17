import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGExample {
    private WebDriver driver;
    private String username="//input[@id='username']";
    private String password="//input[@id='password']";
    private String BUTTON_LOGIN="//input[@id='Login']";//test

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://teamorg2-dev-ed.my.salesforce.com/");
    }
    @Test
    public void f(){
        driver.findElement(By.xpath(username)).sendKeys("cristopher.cardenas.blue.sky@oktana.com");
        driver.findElement(By.xpath(password)).sendKeys("Oktana.2023!");
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
    }
    @AfterClass
    public void afterClass(){
        //driver.close();
    }


}
