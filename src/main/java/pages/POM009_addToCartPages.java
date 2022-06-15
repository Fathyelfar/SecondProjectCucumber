package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    @FindBy(xpath = "//div[@class='sc-3dcc674c-0 fydakl']")
    WebElement xpath1;


    public WebElement addToCartSigninElPF() {
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement addToCartEmailElPF() {
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement addToCartPasswElPF() {
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement addToCartLoginBttnPF() {
        return driver.findElement(By.id("login-submit"));
    }

    public WebElement addToCartPF() {
        return driver.findElement(By.xpath("//div[@class='sc-3dcc674c-0 fydakl']"));
    }


}
