package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.POM004_searchPage;
import pages.POM005_switchCurrenciesPages;
import pages.POM006_categoriesPages;

import java.util.concurrent.TimeUnit;


public class SD006_categoriesSTDF {
    WebDriver driver;
    POM006_categoriesPages categoriesPages;


    @Given("open the browser and log in")
    public void open_the_browser_and_log_in() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        categoriesPages=new POM006_categoriesPages(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        categoriesPages.categorySigninElPF().click();
        Thread.sleep(3000);
        categoriesPages.categoryEmailElPF().sendKeys("fathyelfar11@gmail.com");
        categoriesPages.categoryPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        categoriesPages.categoryLoginBttnPF().click();


    }
    @When("hover the mouse over all categories")
    public void hover_the_mouse_over_all_categories() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(8000);
        WebElement supermarket =driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div[2]/div/ul/div/div[1]/div[8]/li/a/span"));
        Actions action=new Actions(driver);
        action.moveToElement(supermarket).build().perform();
        Thread.sleep(7000);
    }
    @And("hover over any category and select subcategory")
    public void hover_over_any_category_and_select_subcategory() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.findElement(By.partialLinkText("Beverages")).click();
        categoriesPages.categoryPF().click();
        Thread.sleep(4000);
       // driver.findElement(By.linkText("Juices")).click();
        categoriesPages.subCategoryPF().click();
        Thread.sleep(5000);

    }
    @Then("user able to select category and subcategory")
    public void user_able_to_select_category_and_subcategory() throws InterruptedException {
        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "Juices Egypt | 30-75% OFF | Cairo, Giza | noon";
        String actualResult = driver.getTitle();
        softAssert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
        driver.close();


    }
}
