package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.POM011_sliderPages;
import java.util.concurrent.TimeUnit;

public class SD011_sliderSTDF {
    WebDriver driver;

    POM011_sliderPages sliderPages;

    @Given("user logged in the browser")
    public void user_logged_in_the_browser() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        sliderPages=new POM011_sliderPages(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        sliderPages.sliderSigninElPF().click();
        Thread.sleep(3000);
        sliderPages.sliderEmailElPF().sendKeys("fathyelfar11@gmail.com");
        sliderPages.sliderPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sliderPages.sliderLoginBttnPF().click();
        Thread.sleep(3000);

    }
    @When("click on first slider")
    public void click_on_first_slider() throws InterruptedException {
        sliderPages.slider1().click();
    //    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/span[1]")).click();
        Thread.sleep(5000);
        sliderPages.sliderr1().click();
     //   driver.findElement(By.xpath("//div[@class='swiper-slide swiper-slide-visible swiper-slide-active']//div//img")).click();
        Thread.sleep(4000);
    }
    @Then("confirm the user direct to the correct url")
    public void confirm_the_user_direct_to_the_correct_url() {
        String expectedResult = "https://www.noon.com/egypt-en/eg-welcome-new-user/";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);

    }
    @When("click on second slider")
    public void click_on_second_slider() throws InterruptedException {
        Thread.sleep(4000);
       sliderPages.slider2().click();
      //  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/span[2]")).click();
        Thread.sleep(5000);
        sliderPages.sliderr2().click();
       // driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div/a/div/div/div/img")).click();
        Thread.sleep(2000);
    }
    @Then("confirm the user navigate to the correct url")
    public void confirm_the_user_navigate_to_the_correct_url() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedResult = "https://www.noon.com/egypt-en/daily-deals-eg/";
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
        driver.close();

    }

}
