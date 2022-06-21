package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import pages.POM001_registrationPage;

import java.util.concurrent.TimeUnit;


public class SD001_registerSTDF {
    WebDriver driver;

    POM001_registrationPage registerPage;

    @When("click on sign up")
    public void click_on_sign_up() throws InterruptedException {
        registerPage=new POM001_registrationPage(driver);
        registerPage.signinElementPF().click();
        Hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        registerPage.signupElementPF().click();
        Thread.sleep(2000);

    }
    @And("type valid email and valid password")
    public void type_valid_email_and_valid_password() throws InterruptedException {
        registerPage.regEmailElementPF().sendKeys("fathyfathylfar@gmail.com");
        Thread.sleep(2000);
        registerPage.regPasswordElementPF().sendKeys("123412341");
        Thread.sleep(3000);
    }

    @And("type first and last name and click on create and account button")
    public void type_first_and_last_name_and_click_on_create_and_account_button() throws InterruptedException {

        registerPage.firstNameElementPF().sendKeys("Fathy");
        registerPage.lastNameElementPF().sendKeys("Elfar");
        registerPage.createAcctElementPF().click();
        Thread.sleep(3000);

    }



    @Then("user successfully register and the userText appears")
    public void user_successfully_register_and_the_userText_appears() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SoftAssert softAssert = new SoftAssert();
        String expectedResult= "Ahlan Fathy!";
        String actualResult=Hooks.driver.findElement(By.className("userText")).getText();
        softAssert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);
    }


}
