package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;

public class POM011_sliderPages {

    WebDriver driver;

    public POM011_sliderPages (WebDriver driver) {
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


    @FindBy(xpath = "/html/body/div[1]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/span[1]")
    WebElement xpath1;

    @FindBy(xpath ="/html/body/div[1]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/a/div/div/div/img")
    WebElement xpath2;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/span[2]")
    WebElement xpath3;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div/a/div/div/div/img")
    WebElement xpath4;



    public WebElement sliderSigninElPF() {
        return Hooks.driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement sliderEmailElPF() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement sliderPasswElPF() {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement sliderLoginBttnPF() {
        return Hooks.driver.findElement(By.id("login-submit"));
    }

    public WebElement slider1() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/span[1]"));
    }

    public WebElement sliderr1() {
        return Hooks.driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div/a/div/div/div/img"));

    }
    public WebElement slider2() {
       return Hooks.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[2]/span[2]"));

    }
    public WebElement sliderr2() {
      return  Hooks.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div[2]/div/div/div/div/div/div/div/div[2]/div[1]/div[1]/div[3]/div/a/div/div/div/img"));

    }

}
