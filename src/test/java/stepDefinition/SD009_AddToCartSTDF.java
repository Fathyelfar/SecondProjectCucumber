package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.POM007_filterByColorPages;
import pages.POM009_addToCartPages;

import java.util.concurrent.TimeUnit;

public class SD009_AddToCartSTDF {
  WebDriver driver;
    POM009_addToCartPages addToCartPages;


    @Given("log in to the website")
    public void log_in_to_the_website() throws InterruptedException {

        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        addToCartPages=new POM009_addToCartPages(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        addToCartPages.addToCartSigninElPF().click();
        Thread.sleep(3000);
        addToCartPages.addToCartEmailElPF().sendKeys("fathyelfar11@gmail.com");
        addToCartPages.addToCartPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addToCartPages.addToCartLoginBttnPF().click();
        Thread.sleep(3000);

    }
    @When("adding many products to the Cart")
    public void adding_many_products_to_the_cart() throws InterruptedException {
        driver.navigate().to("https://www.noon.com/egypt-en/electronics/");
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        driver.navigate().to("https://www.noon.com/egypt-en/galaxy-tab-s8-plus-grey-8gb-ram-256gb-wifi-middle-east-version/N52536631A/p/?o=f3d9d50ffb83bd1a");
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        addToCartPages.addToCartPF().click();
        //driver.findElement(By.xpath("//div[@class='sc-3dcc674c-0 fydakl']")).click();
    }
    @Then("remove button is displayed")
    public void remove_button_is_displayed() throws InterruptedException {
       boolean expectedResult = true;
       Thread.sleep(3000);
       boolean actualResult= driver.findElement(By.cssSelector(".sc-45b93fdf-10.ijYStb")).isDisplayed();
       Thread.sleep(5000);
       driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
        driver.close();




    }



}
