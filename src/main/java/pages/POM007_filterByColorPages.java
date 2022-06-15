package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM007_filterByColorPages {

    WebDriver driver;

    public POM007_filterByColorPages (WebDriver driver) {
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


    @FindBy(xpath = "//div[@class='sc-160e1e76-13 jbdKGa']//div[1]//div[1]//*[name()='svg']//*[name()='path'][2]")
    WebElement xpath1;

    @FindBy(xpath = "/html/body/div[1]/div/header/div[2]/div[2]/div/div[2]/ul/li[1]/a/img))")
    WebElement xpath2;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section/div/div/div/div[2]/div[2]/div/div[2]/button[2]/div/span[2]/img")
    WebElement xpath3;

    @FindBy(css = "#__next > div > section > div > div > div > div.sc-15b94da2-5.iMJUuX > div:nth-child(2) > div > div.sc-26dd1814-1.kndIRE.open > div > div.sc-bc02f790-7.cYUrub > div > div > label:nth-child(3) > span > span > img")
    WebElement css4;



    public WebElement filterByColorSigninElPF() {
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement filterByColorEmailElPF() {
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement filterByColorPasswElPF() {
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement filterByColorLoginBttnPF() {
        return driver.findElement(By.id("login-submit"));
    }

    public WebElement filterbyColor1() {
        return driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/ul/div/div[1]/div[2]/li/a/span"));

    }

    public WebElement filterByColor2() {
        return driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div[2]/div/div[2]/ul/li[1]/a/img"));

    }
    public WebElement filterByColor3() {
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section/div/div/div/div[2]/div[2]/div/div[2]/button[2]/div/span[2]/img"));

    }
    public WebElement filterByColor4() {
        return driver.findElement(By.cssSelector("#__next > div > section > div > div > div > div.sc-15b94da2-5.iMJUuX > div:nth-child(2) > div > div.sc-26dd1814-1.kndIRE.open > div > div.sc-bc02f790-7.cYUrub > div > div > label:nth-child(3) > span > span > img"));

    }
}
