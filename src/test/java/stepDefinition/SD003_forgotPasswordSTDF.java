package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.POM003_forgotPasswordPage;

import java.util.concurrent.TimeUnit;

public class SD003_forgotPasswordSTDF {
    WebDriver driver;

    POM003_forgotPasswordPage forgotPasswordPage;

    @When("click the link of forgot your password")
    public void click_the_link_of_forgot_your_password() throws InterruptedException {
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     //   driver.findElement(By.linkText("Forgot your password?")).click();
     //   driver.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys("fathyelfar11@gmail.com");
      //  Thread.sleep(2000);
       // driver.findElement(By.cssSelector("#login-submit")).click();
        forgotPasswordPage=new POM003_forgotPasswordPage(Hooks.driver);
        Thread.sleep(2000);
        Hooks.driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
        forgotPasswordPage.forgotPasswUsingPF();


    }
    @Then("success message appear")
    public void success_message_appear() throws InterruptedException {
        Thread.sleep(2000);
        Hooks.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SoftAssert softAssert=new SoftAssert();
        String actualResult=Hooks.driver.findElement(By.cssSelector("div[class='forgot-password-success-header']")).getText();
        String expectedResult = "Password Reset Email Sent";
        softAssert.assertEquals(actualResult.contains(expectedResult),true);

    }




}
