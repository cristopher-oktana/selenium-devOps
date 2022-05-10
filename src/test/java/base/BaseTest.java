package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;
    private String username="//input[@id='username']";
    private String password="//input[@id='password']";
    private String BUTTON_LOGIN="//input[@id='Login']";

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
    }

    public void LoginSalesforce(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://teamorg2-dev-ed.my.salesforce.com/");
        driver.findElement(By.xpath(username)).sendKeys("cristopher.cardenas.blue.sky@oktana.com");
        driver.findElement(By.xpath(password)).sendKeys("Oktana.2022!");
        driver.findElement(By.xpath(BUTTON_LOGIN)).click();
    }

    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.LoginSalesforce();
    }
}
