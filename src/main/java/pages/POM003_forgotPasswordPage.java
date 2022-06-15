package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }


    public WebElement forgotPasswordElementPF (){
        return driver.findElement(By.linkText("Forgot your password?"));
    }
    public WebElement emailForgotPasswElementPF(){
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }
    public WebElement submitEmailElementPF(){
        return driver.findElement(By.cssSelector("#login-submit"));
    }

    public void forgotPasswUsingPF() throws InterruptedException {
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

                SignInClickElementPF.click();
                Thread.sleep(4000);
                forgotPasswordElementPF.click();
                Thread.sleep(4000);
                emailForgotPasswElementPF .sendKeys("fathyelfar11@gmail.com");
                Thread.sleep(3000);
                submitEmailElementPF.click();

    }
}
