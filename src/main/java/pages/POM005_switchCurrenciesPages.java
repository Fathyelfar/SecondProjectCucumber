package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM005_switchCurrenciesPages {
    WebDriver driver;
    public POM005_switchCurrenciesPages(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id ="dd_header_signInOrUp" )
    WebElement signinElement;


    @FindBy(xpath = "//*[@id=\"emailInput\"]")
    WebElement emailElement;

    @FindBy(xpath = "//*[@id=\"passwordInput\"]")
    WebElement passwElement;

    @FindBy(id = "login-submit")
    WebElement loginBttn;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
    WebElement clickCurrencyElement;

    @FindBy(xpath = "/html/body/div[1]/div/header/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/button/img")
    WebElement selectCurrencyEl;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
    WebElement changeCurrencyEl;


    public WebElement swCurrencySigninElPF(){
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement swCurrencyEmailElPF(){
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement swCurrencyPasswElPF(){
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }
    public WebElement swCurrencyLoginBttnPF(){
        return  driver.findElement(By.id("login-submit"));
    }
    public WebElement clickCurrencyPF(){
        return driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]"));
    }
    public WebElement selectCurrencyPF(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/button/img"));

    }
    public WebElement changeCurrencyPF(){
        return driver.findElement(By.xpath("/html/body/div[1]/div/header/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div[2]/div/button/img"));
    }



}
