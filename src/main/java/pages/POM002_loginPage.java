package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class POM002_loginPage {
    WebDriver driver;
    public POM002_loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//span[@id='dd_header_signInOrUp']")
    WebElement signinEle;


    @FindBy(xpath = "//*[@id=\"emailInput\"]")
    WebElement emailEle;

    @FindBy(xpath = "//*[@id=\"passwordInput\"]")
    WebElement passwordEle;


    @FindBy(id = "login-submit" )
    WebElement loginBttnEle;



    public WebElement signinElementPF(){
        return driver.findElement(By.xpath("//span[@id='dd_header_signInOrUp']"));
    }

    public WebElement emailElementPF(){
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement passwordElementPF(){
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }
    public WebElement loginBttnPF(){
        return  driver.findElement(By.id("login-submit"));
    }





    }




