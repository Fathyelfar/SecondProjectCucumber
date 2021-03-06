package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.POM002_loginPage;

import java.util.concurrent.TimeUnit;


public class SD002_loginSTDF {
    WebDriver driver;
    POM002_loginPage loginPage;

    @When("click sign in and enter the registered email and password")
    public void click_sign_in_and_enter_the_registered_email_and_password() throws InterruptedException {
        // driver.findElement(By.xpath("//span[@id='dd_header_signInOrUp']")).click();
        loginPage =new POM002_loginPage(driver);
        loginPage.signinElementPF().click();
        Thread.sleep(3000);
        loginPage.emailElementPF().sendKeys("fathyfathylfar@gmail.com");
        // driver.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys("fathyelfar11@gmail.com");
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.passwordElementPF().sendKeys("123412341");
        // driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys("123412341");
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("click sign in button")
    public void click_sign_in_button() throws InterruptedException {
        //   driver.findElement(By.id("login-submit")).click();
        loginPage.loginBttnPF().click();


    }

    @Then("textUser is displayed")
    public void textUser_is_displayed() {

        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SoftAssert softAssert = new SoftAssert();
        String actualResult=Hooks.driver.findElement(By.className("userText")).getText();
        String expectedResult= "Ahlan Fathy!";
        softAssert.assertEquals(actualResult,expectedResult);}



    @When("sign in with invalid credentials {string} {string}")
    public void sign_in_with_invalid_credentials(String username,String password) throws InterruptedException {
        loginPage =new POM002_loginPage(driver);
        Hooks.driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//span[@id='dd_header_signInOrUp']")).click();
        loginPage.signinElementPF().click();
        Thread.sleep(3000);
        // driver.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys(username);
        loginPage.emailElementPF().sendKeys(username);
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // driver.findElement(By.xpath("//*[@id=\"passwordInput\"]")).sendKeys(password);
        loginPage.passwordElementPF().sendKeys(password);


    }
    @And("click on sign in button")
    public void click_on_sign_in_button() throws InterruptedException {
        //   driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        loginPage.loginBttnPF().click();

    }

    @Then("Error message display")
    public void Error_message_display() throws InterruptedException {
        SoftAssert softAssert =new SoftAssert();
        String expectedResult="Invalid email";
        String actualResult = Hooks.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div[2]/div/p")).getText();
        softAssert.assertTrue(actualResult.contains(expectedResult));

    }


}
