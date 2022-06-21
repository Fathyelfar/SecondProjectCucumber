package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.POM006_categoriesPages;

import java.util.concurrent.TimeUnit;


public class SD006_categoriesSTDF {
    WebDriver driver;
    POM006_categoriesPages categoriesPages;

    @When("hover the mouse over all categories")
    public void hover_the_mouse_over_all_categories() throws InterruptedException {
        categoriesPages=new POM006_categoriesPages(driver);
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(8000);
        WebElement supermarket =Hooks.driver.findElement(By.xpath("//*[@id=\"__next\"]/div/header/div[2]/div/ul/div/div[1]/div[8]/li/a/span"));
        Actions action=new Actions(Hooks.driver);
        action.moveToElement(supermarket).build().perform();
        Thread.sleep(7000);
    }
    @And("hover over any category and select subcategory")
    public void hover_over_any_category_and_select_subcategory() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //driver.findElement(By.partialLinkText("Beverages")).click();
        categoriesPages.categoryPF().click();
        Thread.sleep(4000);
       // driver.findElement(By.linkText("Juices")).click();
        categoriesPages.subCategoryPF().click();
        Thread.sleep(5000);

    }
    @Then("user able to select category and subcategory")
    public void user_able_to_select_category_and_subcategory() throws InterruptedException {
        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "Juices Egypt | 30-75% OFF | Cairo, Giza | noon";
        String actualResult = Hooks.driver.getTitle();
        softAssert.assertEquals(actualResult,expectedResult);
        Thread.sleep(3000);

    }



}
