package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.POM004_searchPage;

import java.util.concurrent.TimeUnit;

public class SD004_searchSTDF {
    WebDriver driver;
    POM004_searchPage searchPage;

    @Given("user logged into the website")
    public void user_logged_into_the_website() throws InterruptedException {
        searchPage=new POM004_searchPage(driver);
        Hooks.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        searchPage.searchSigninElPF().click();
        Thread.sleep(4000);
        searchPage.searchEmailElementPF().sendKeys("fathyfathylfar@gmail.com");
        searchPage.searchPasswElementPF().sendKeys("123412341");
        searchPage.searchLoginBttnPF().click();

    }

    @When("click in the search field and searched by the word mobiles")
    public void click_in_the_search_field_and_searched_by_the_word_mobiles() throws InterruptedException {
      //  driver.findElement(By.id("searchBar")).sendKeys("mobiles",Keys.ENTER);
        Hooks.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        Hooks.driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        searchPage.searchField().sendKeys("mobiles",Keys.ENTER);
         Thread.sleep(5000);
    }

    @Then("relative results appears confirm the url")
    public void relative_results_appears_confirm_the_url() {
        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "https://www.noon.com/egypt-en/search/?q=mobiles";
        String actualResult = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(actualResult,expectedResult);
    }
    @When("click in the search field by product name then model number")
    public void click_in_the_search_field_by_product_name_then_model_number() throws InterruptedException {
         Thread.sleep(5000);
         Hooks.driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
       // driver.findElement(By.id("searchBar")).sendKeys("Redmi Note 11 6GB RAM 128GB Lte Graphite Grey",Keys.ENTER);
        searchPage.searchField().sendKeys("Redmi Note 11 6GB RAM 128GB Lte Graphite Grey",Keys.ENTER);

        Thread.sleep(7000);
        Hooks.driver.navigate().back();
        Thread.sleep(7000);
        searchPage.searchField().sendKeys("2201117TG",Keys.ENTER);
      //  driver.findElement(By.id("searchBar")).sendKeys("2201117TG",Keys.ENTER);

    }

    @Then("relative results appears confirm url")
    public void relative_results_appears_confirm_url() throws InterruptedException {
        Thread.sleep(4000);
        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "https://www.noon.com/egypt-en/search/?q=2201117TG";
        String actualResult = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(actualResult,expectedResult);

    }




}
