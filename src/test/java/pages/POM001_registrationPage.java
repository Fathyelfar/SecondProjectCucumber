package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.Hooks;


public class POM001_registrationPage  {
    WebDriver driver;


    public POM001_registrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

        @FindBy(id ="dd_header_signInOrUp")
        WebElement signinElementPF;

        @FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[2]")
        WebElement signupElementPF;

        @FindBy(id = "emailInput")
        WebElement regEmailElementPF;

        @FindBy(id = "passwordInput")
        WebElement regPasswordElementPF;

        @FindBy(id = "firstNameInput")
        WebElement firstNameElementPF;

        @FindBy(id = "lastNameInput")
        WebElement lastNameElementPF;

        @FindBy(id = "login-submit" )
        WebElement createAcctElementPF;


        public WebElement signinElementPF(){
            return Hooks.driver.findElement(By.id("dd_header_signInOrUp"));
        }
       public WebElement signupElementPF(){
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/h3[2]"));
    }
        public WebElement regEmailElementPF(){
            return  Hooks.driver.findElement(By.id("emailInput"));
        }
        public WebElement regPasswordElementPF(){
            return Hooks.driver.findElement(By.id("passwordInput"));
    }
        public WebElement firstNameElementPF(){
           return Hooks.driver.findElement(By.id("firstNameInput"));
         }
        public WebElement lastNameElementPF(){
           return Hooks.driver.findElement(By.id("lastNameInput"));
    }
        public WebElement createAcctElementPF(){
           return  Hooks.driver.findElement(By.id("login-submit"));
    }



    }








