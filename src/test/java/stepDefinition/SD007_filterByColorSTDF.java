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
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.POM006_categoriesPages;
import pages.POM007_filterByColorPages;

import java.util.concurrent.TimeUnit;

public class SD007_filterByColorSTDF {
    WebDriver driver;
    POM007_filterByColorPages filterByColorPages;


    @Given("user logged in the website")
    public void user_logged_in_the_website() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        filterByColorPages=new POM007_filterByColorPages(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        filterByColorPages.filterByColorSigninElPF().click();
        Thread.sleep(3000);
        filterByColorPages.filterByColorEmailElPF().sendKeys("fathyelfar11@gmail.com");
        filterByColorPages.filterByColorPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        filterByColorPages.filterByColorLoginBttnPF().click();
        Thread.sleep(3000);


    }
    @When("select any category in the header")
    public void select_any_category_in_the_header() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement mobiles=driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/ul/div/div[1]/div[2]/li/a/span"));
        Actions action=new Actions(driver);
        action.moveToElement(mobiles).build().perform();
        filterByColorPages.filterbyColor1().click();
       // driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/ul/div/div[1]/div[2]/li/a/span")).click();
        Thread.sleep(3000);
        filterByColorPages.filterByColor2().click();
       // driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/div/div[2]/ul/li[1]/a/img")).click();


    }
    @And("filter by color")
    public void filter_by_color() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        filterByColorPages.filterByColor3().click();
       // driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div/div[2]/div[2]/div/div[2]/button[2]/div/span[2]/img")).click();
        Thread.sleep(4000);
        filterByColorPages.filterByColor4().click();
       // driver.findElement(By.cssSelector("#__next > div > section > div > div > div > div.sc-15b94da2-5.iMJUuX > div:nth-child(2) > div > div.sc-26dd1814-1.kndIRE.open > div > div.sc-bc02f790-7.cYUrub > div > div > label:nth-child(3) > span > span > img")).click();


    }
    @Then("confirm the url is correct")
    public void confirm_the_url_is_correct() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        String expectedResult = "https://www.noon.com/egypt-en/eg-mobile-brands/samsung/?f[colour_family]=blue&limit=50&sort[by]=popularity&sort[dir]=desc";
        String actualResult = driver.getCurrentUrl();
        softAssert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
        driver.close();
    }
}
