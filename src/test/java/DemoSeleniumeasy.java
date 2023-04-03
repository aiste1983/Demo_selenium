import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoSeleniumeasy {


    public WebDriver driver;

    @Test
    public void pageLoads(){
        driver.get("http://demo.seleniumeasy.com/");
    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver111.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @Test
    //  public void login()throws InterruptedException {
       // driver.get("http://www.demo.seleniumeasy.com/");
       // WebElement user = driver.findElement(By.ByXPath.name("panel-heading"));
    //}



}
