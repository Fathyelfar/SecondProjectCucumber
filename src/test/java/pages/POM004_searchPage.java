package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;

public class POM004_searchPage {

           WebDriver driver;

    public POM004_searchPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);

        }
    @FindBy(id ="dd_header_signInOrUp" )
    WebElement searchSigninElement;


    @FindBy(xpath = "//*[@id=\"emailInput\"]")
    WebElement searchEmailElement;

    @FindBy(xpath = "//*[@id=\"passwordInput\"]")
    WebElement searchPasswElement;

    @FindBy(id = "login-submit")
    WebElement searchLoginBttn;

    @FindBy(id = "searchBar")
    WebElement searchFieldElement;

    public WebElement searchSigninElPF(){
        return Hooks.driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement searchEmailElementPF(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement searchPasswElementPF(){
        return Hooks.driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }
    public WebElement searchLoginBttnPF(){
        return  Hooks.driver.findElement(By.id("login-submit"));
    }
    public WebElement searchField(){
        return Hooks.driver.findElement(By.id("searchBar"));}






    }
