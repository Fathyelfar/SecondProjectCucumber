package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.POM009_addToCartPages;

import java.util.concurrent.TimeUnit;

public class SD009_AddToCartSTDF {
  WebDriver driver;
    POM009_addToCartPages addToCartPages;

    @When("adding many products to the Cart")
    public void adding_many_products_to_the_cart() throws InterruptedException {
        addToCartPages = new POM009_addToCartPages(driver);
        Hooks.driver.navigate().to("https://www.noon.com/egypt-en/electronics/");
        Hooks.driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
        Hooks.driver.navigate().to("https://www.noon.com/egypt-en/galaxy-tab-s8-plus-grey-8gb-ram-256gb-wifi-middle-east-version/N52536631A/p/?o=f3d9d50ffb83bd1a");
        Thread.sleep(4000);
        Hooks.driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        addToCartPages.addToCartPF().click();
        //driver.findElement(By.xpath("//div[@class='sc-3dcc674c-0 fydakl']")).click();
    }
    @Then("remove button is displayed")
    public void remove_button_is_displayed() throws InterruptedException {
      boolean expectedResult = true;
      Thread.sleep(3000);
       boolean actualResult= Hooks.driver.findElement(By.xpath("//span[@class='sc-45b93fdf-10 nDDHx']")).isDisplayed();
      Thread.sleep(5000);
       Hooks.driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
       Assert.assertEquals(actualResult,expectedResult);
       // String expectedResult = "Added to cart";
     //   String actualResult = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[2]/div[1]/div[1]/span[1]/div[1]")).getText();
     //   Assert.assertEquals(actualResult,expectedResult);
    }




}
