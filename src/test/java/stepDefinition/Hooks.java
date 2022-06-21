package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

     public static WebDriver driver =null;

    @Before
    public static void openBrowser() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @After
    public static void smoke1closeBrowser() throws InterruptedException {
        Thread.sleep(12000);
        driver.quit();
    }



}
