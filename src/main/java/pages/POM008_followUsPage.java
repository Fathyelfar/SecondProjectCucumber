package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM008_followUsPage {

    WebDriver driver;

    public POM008_followUsPage (WebDriver driver) {
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


    @FindBy(xpath = "/html/body/div[1]/div/header/div[2]/div/ul/div/div[1]/div[2]/li/a/span")
    WebElement xpath1;

    @FindBy(xpath ="(//*[name()='path'][@fill-rule='evenodd'])[5]")
    WebElement xpath2;

    @FindBy(xpath = "(//*[name()='path'][@fill-rule='evenodd'])[6]")
    WebElement xpath3;

    @FindBy(xpath = "//footer[@class='sc-160e1e76-0 huMkCr']//div[4]//div[1]//*[name()='svg']//*[name()='path'][2]")
    WebElement xpath4;



    public WebElement followUsSigninElPF() {
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement followUsEmailElPF() {
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement followUsPasswElPF() {
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement followUsLoginBttnPF() {
        return driver.findElement(By.id("login-submit"));
    }

    public WebElement xpath1() {
       return driver.findElement(By.xpath("//div[@class='sc-160e1e76-13 jbdKGa']//div[1]//div[1]//*[name()='svg']//*[name()='path'][2]"));
    }

    public WebElement xpath2() {
        return driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[5]"));

    }
    public WebElement xpath3() {
        return driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[6]"));

    }
    public WebElement xpath4() {
       return driver.findElement(By.xpath("//footer[@class='sc-160e1e76-0 huMkCr']//div[4]//div[1]//*[name()='svg']//*[name()='path'][2]"));

    }

}
