package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import pages.POM003_forgotPasswordPage;

import java.util.concurrent.TimeUnit;

public class SD003_forgotPasswordSTDF {
    WebDriver driver;

    POM003_forgotPasswordPage forgotPasswordPage;


    @Given("launch the browser and click sign in")
    public void launch_the_browser_and_click_sign_in() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
       // driver.findElement(By.id("dd_header_signInOrUp")).click();
        forgotPasswordPage=new POM003_forgotPasswordPage(driver);



    }
    @When("click the link of forgot your password")
    public void click_the_link_of_forgot_your_password() throws InterruptedException {
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     //   driver.findElement(By.linkText("Forgot your password?")).click();
     //   driver.findElement(By.xpath("//*[@id=\"emailInput\"]")).sendKeys("fathyelfar11@gmail.com");
      //  Thread.sleep(2000);
       // driver.findElement(By.cssSelector("#login-submit")).click();
        forgotPasswordPage.forgotPasswUsingPF();


    }
    @Then("success message appear")
    public void success_message_appear() throws InterruptedException {
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        SoftAssert softAssert=new SoftAssert();
        String actualResult=driver.findElement(By.cssSelector("div[class='forgot-password-success-header']")).getText();
        String expectedResult = "Password Reset Email Sent";
        softAssert.assertEquals(actualResult.contains(expectedResult),true);
        Thread.sleep(7000);
        driver.close();

    }

}
