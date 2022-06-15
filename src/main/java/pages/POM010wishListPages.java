package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM010wishListPages {

    WebDriver driver;

    public POM010wishListPages(WebDriver driver) {
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


    @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div[4]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/a/div/div/div[1]/div[2]/div[2]/button/img")
    WebElement xpath1;


    public WebElement wishListSigninElPF() {
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement wishListEmailElPF() {
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement wishListPasswElPF() {
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement wishListLoginBttnPF() {
        return driver.findElement(By.id("login-submit"));
    }

    public WebElement wishListPF() {
        return driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[4]/div/div/div/div/div/div/div/div[2]/div[1]/div/div[1]/div/a/div/div/div[1]/div[2]/div[2]/button/img"));
    }


}
