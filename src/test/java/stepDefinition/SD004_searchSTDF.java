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

import java.util.concurrent.TimeUnit;

public class SD004_searchSTDF {
    WebDriver driver;
    POM004_searchPage searchPage;

    @Given("user logged in with valid credential")
    public void user_logged_in_with_valid_credential() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        searchPage=new POM004_searchPage(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
         Thread.sleep(2000);
        searchPage.searchSigninElPF().click();
         Thread.sleep(3000);
        searchPage.searchEmailElementPF().sendKeys("fathyelfar11@gmail.com");
        searchPage.searchPasswElementPF().sendKeys("123412341");
       driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPage.searchLoginBttnPF().click();
      //  driver.findElement(By.id("login-submit")).click();


    }
    @When("click in the search field and searched by the word mobiles")
    public void click_in_the_search_field_and_searched_by_the_word_mobiles() throws InterruptedException {
      //  driver.findElement(By.id("searchBar")).sendKeys("mobiles",Keys.ENTER);
        searchPage.searchField().sendKeys("mobiles",Keys.ENTER);

         Thread.sleep(5000);

    }

    @Then("relative results appears confirm the url")
    public void relative_results_appears_confirm_the_url() {
        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "https://www.noon.com/egypt-en/search/?q=mobiles";
        String actualResult = driver.getCurrentUrl();
        softAssert.assertEquals(actualResult,expectedResult);

    }
    @When("click in the search field by product name then model number")
    public void click_in_the_search_field_by_product_name_then_model_number() throws InterruptedException {
         Thread.sleep(5000);
       // driver.findElement(By.id("searchBar")).sendKeys("Redmi Note 11 6GB RAM 128GB Lte Graphite Grey",Keys.ENTER);
        searchPage.searchField().sendKeys("Redmi Note 11 6GB RAM 128GB Lte Graphite Grey",Keys.ENTER);

        Thread.sleep(7000);
        driver.navigate().back();
        Thread.sleep(7000);
        searchPage.searchField().sendKeys("2201117TG",Keys.ENTER);
      //  driver.findElement(By.id("searchBar")).sendKeys("2201117TG",Keys.ENTER);



    }

    @Then("relative results appears confirm url")
    public void relative_results_appears_confirm_url() throws InterruptedException {
        Thread.sleep(4000);
        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "https://www.noon.com/egypt-en/search/?q=2201117TG";
        String actualResult = driver.getCurrentUrl();
        softAssert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
        driver.close();
    }


}
