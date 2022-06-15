package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.POM010wishListPages;

import java.util.concurrent.TimeUnit;

public class SD010_wishListSTDF {
    WebDriver driver;
    POM010wishListPages wishListPages;


    @Given("launch the browser and log in")
    public void launch_the_browser_and_log_in() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        wishListPages=new POM010wishListPages(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        wishListPages.wishListSigninElPF().click();
        Thread.sleep(3000);
        wishListPages.wishListEmailElPF().sendKeys("fathyelfar11@gmail.com");
        wishListPages.wishListPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wishListPages.wishListLoginBttnPF().click();
        Thread.sleep(3000);

    }
    @When("click on the heart icon")
    public void click_on_the_heart_icon() throws InterruptedException {
      //  driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/ul/div/div[1]/div[1]/li/a/span")).click();
   //     driver.navigate().to("https://www.noon.com/egypt-en/electronics/");
        Thread.sleep(7000);
        JavascriptExecutor scrll= (JavascriptExecutor)driver;
        scrll.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       wishListPages.wishListPF().click();
        //driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[4]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/a/div/div/div[1]/div[2]/div[2]/button/img")).click();
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.navigate().to("https://www.noon.com/egypt-en/cart/#wishlist/");
        Thread.sleep(5000);

    }
    @Then("user successfully add the product to the wish list")
    public void user_successfully_add_the_product_to_the_wish_list() throws InterruptedException {
        JavascriptExecutor scrll= (JavascriptExecutor)driver;
        scrll.executeScript("window.scrollBy(0,300)");
        Thread.sleep(3000);
        boolean expectedResult= true;
        boolean actualResult= driver.findElement(By.xpath("//span[normalize-space()='Move to Cart']")).isDisplayed();
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
        driver.close();


    }

}
