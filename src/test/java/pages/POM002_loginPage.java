package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;


public class POM002_loginPage {
    WebDriver driver;

    public POM002_loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "///html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]")
    WebElement signinEle;


    @FindBy(xpath = "//*[@id=\"emailInput\"]")
    WebElement emailEle;

    @FindBy(xpath = "//*[@id=\"passwordInput\"]")
    WebElement passwordEle;


    @FindBy(id = "login-submit" )
    WebElement loginBttnEle;



    public WebElement signinElementPF(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[4]/div[1]/button[1]/span[1]"));
    }

    public WebElement emailElementPF(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement passwordElementPF(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }
    public WebElement loginBttnPF(){
        return  Hooks.driver.findElement(By.id("login-submit"));
    }


    }




