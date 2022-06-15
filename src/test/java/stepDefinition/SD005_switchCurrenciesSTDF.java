package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.POM003_forgotPasswordPage;
import pages.POM004_searchPage;
import pages.POM005_switchCurrenciesPages;

import java.util.concurrent.TimeUnit;
public class SD005_switchCurrenciesSTDF {
    WebDriver driver;
    POM005_switchCurrenciesPages switchCurrenciesPages;

    @Given("user logged in with valid credentials")
    public void user_logged_in_with_valid_credentials() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        switchCurrenciesPages=new POM005_switchCurrenciesPages(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        switchCurrenciesPages.swCurrencySigninElPF().click();
        Thread.sleep(3000);
        switchCurrenciesPages.swCurrencyEmailElPF().sendKeys("fathyelfar11@gmail.com");
        switchCurrenciesPages.swCurrencyPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        switchCurrenciesPages.swCurrencyLoginBttnPF().click();
        switchCurrenciesPages=new POM005_switchCurrenciesPages(driver);


    }
    @When("click on the dropdown menu next to country at the top left")
    public void click_on_the_dropdown_menu_next_to_country_at_the_top_left() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Thread.sleep(2000);
        switchCurrenciesPages.clickCurrencyPF().click();
       // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")).click();
        Thread.sleep(3000);
    }
    @And("click on the dropdown menu next to country at the top right")
    public void click_on_the_dropdown_menu_next_to_country_at_the_top_right() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        switchCurrenciesPages.selectCurrencyPF().click();
       // driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/button/img")).click();
    }
    @And("change the currency by selecting radio button")
    public void change_the_currency_by_selecting_radio_button() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        Thread.sleep(4000);
        switchCurrenciesPages.changeCurrencyPF().click();
       // driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")).click();

    }
    @Then("currency change it successfully")
    public void currency_change_it_successfully() throws InterruptedException {
        //softAssertion
         SoftAssert softAssert =new SoftAssert();
         String expectedResult = "https://www.noon.com/uae-en/";
         Thread.sleep(4000);
         String actualResult = driver.getCurrentUrl();
         softAssert.assertEquals(actualResult,expectedResult);
         Thread.sleep(3000);
         driver.close();

    }
}
