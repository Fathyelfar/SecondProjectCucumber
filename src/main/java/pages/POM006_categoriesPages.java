package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM006_categoriesPages {

    WebDriver driver;

    public POM006_categoriesPages(WebDriver driver) {
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


    @FindBy(partialLinkText = "Beverages")
    WebElement selectCategory;

    @FindBy(linkText = "Juices")
    WebElement subCategory;


    public WebElement categorySigninElPF() {
        return driver.findElement(By.id("dd_header_signInOrUp"));
    }

    public WebElement categoryEmailElPF() {
        return driver.findElement(By.xpath("//*[@id=\"emailInput\"]"));
    }

    public WebElement categoryPasswElPF() {
        return driver.findElement(By.xpath("//*[@id=\"passwordInput\"]"));
    }

    public WebElement categoryLoginBttnPF() {
        return driver.findElement(By.id("login-submit"));
    }

    public WebElement categoryPF() {
        return driver.findElement(By.partialLinkText("Beverages"));
    }

    public WebElement subCategoryPF() {
        return driver.findElement(By.linkText("Juices"));
    }


}

