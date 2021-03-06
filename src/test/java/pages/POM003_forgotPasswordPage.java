package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;

import java.util.concurrent.TimeUnit;

public class POM003_forgotPasswordPage {
    WebDriver driver;
    public POM003_forgotPasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "dd_header_signInOrUp")
    WebElement SignInClickElementPF;
    @FindBy (linkText = "Forgot your password?")
    WebElement forgotPasswordElementPF;

    @FindBy (xpath = "//*[@id=\"emailInput\"]")
    WebElement emailForgotPasswElementPF;

    @FindBy (css = "#login-submit")
    WebElement submitEmailElementPF;

    public WebElement SignInClickElementPF (){
        return Hooks.driver.findElement(By.id("dd_header_signInOrUp"));
    }


    public WebElement forgotPasswordElementPF (){
        return Hooks.driver.findElement(By.linkText("Forgot your password?"));
    }
    public WebElement emailForgotPasswElementPF(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }
    public WebElement submitEmailElementPF(){
        return Hooks.driver.findElement(By.cssSelector("#login-submit"));
    }

    public void forgotPasswUsingPF() throws InterruptedException {
       Hooks.driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

                SignInClickElementPF.click();
                Thread.sleep(4000);
                forgotPasswordElementPF.click();
                Thread.sleep(4000);
                emailForgotPasswElementPF .sendKeys("fathyelfar11@gmail.com");
                Thread.sleep(3000);
                submitEmailElementPF.click();

    }
}
