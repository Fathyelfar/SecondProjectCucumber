package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.POM011_sliderPages;

import java.util.concurrent.TimeUnit;

public class SD011_sliderSTDF {
    WebDriver driver;

    POM011_sliderPages sliderPages;

     @Given("user sign in to the website")
     public void user_sign_in_to_the_website() throws InterruptedException {
         sliderPages = new POM011_sliderPages(driver);
         Thread.sleep(3000);
         sliderPages.sliderSigninElPF().click();
         Thread.sleep(3000);
         sliderPages.sliderEmailElPF().sendKeys("fathyfathylfar@gmail.com");
         sliderPages.sliderPasswElPF().sendKeys("123412341");
         Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         sliderPages.sliderLoginBttnPF().click();
         Thread.sleep(3000);
     }
    @When("click on first slider")
    public void click_on_first_slider() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        sliderPages.slider1().click();
    //    driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/span[1]")).click();
        Thread.sleep(5000);
        sliderPages.sliderr1().click();
     //   driver.findElement(By.xpath("//div[@class='swiper-slide swiper-slide-visible swiper-slide-active']//div//img")).click();
        Thread.sleep(4000);
    }
    @Then("confirm the user direct to the correct url")
    public void confirm_the_user_direct_to_the_correct_url() {
        String expectedResult = "https://www.noon.com/egypt-en/beauty/";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);

    }
    @When("click on second slider")
    public void click_on_second_slider() throws InterruptedException {
        Thread.sleep(5000);
        sliderPages.slider2().click();
      //  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/span[2]")).click();
        Thread.sleep(5000);
        sliderPages.sliderr2().click();
       // driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[1]/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div/a/div/div/div/img")).click();
        Thread.sleep(2000);
    }
    @Then("confirm the user navigate to the correct url")
    public void confirm_the_user_navigate_to_the_correct_url() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedResult = "https://www.noon.com/egypt-en/eg-fathers-day22/";
        String actualResult = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actualResult,expectedResult);
    }



}
