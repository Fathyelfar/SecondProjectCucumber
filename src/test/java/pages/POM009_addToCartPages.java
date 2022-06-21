package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;

public class POM009_addToCartPages {

    WebDriver driver;

    public POM009_addToCartPages (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "dd_header_signInOrUp")
    WebElement signinElement;


    @FindBy(xpath = "//*[@id=\"emailInput\"]")
    WebElement emailElement;

    @FindBy(xpath = "//*[@id=\"passwordInput\"]")
    WebElement passwElement;

    @FindBy(id = "login-submit")
    WebElement loginBttn;


    @FindBy(xpath = "//div[@class='sc-3dcc674c-0 jJHOCL']")
    WebElement xpath1;


    public WebElement addToCartSigninElPF() {
        return Hooks.driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement addToCartEmailElPF() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement addToCartPasswElPF() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement addToCartLoginBttnPF() {
        return Hooks.driver.findElement(By.id("login-submit"));
    }

    public WebElement addToCartPF() {
        return Hooks.driver.findElement(By.xpath("//div[@class='sc-3dcc674c-0 jJHOCL']"));
    }


}
