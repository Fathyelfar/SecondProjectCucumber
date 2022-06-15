package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.POM008_followUsPage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SD008_followUsSTDF {
    WebDriver driver;
    POM008_followUsPage followUsPages;

    //Scenario 1
    @Given("User open the browser and log in")
    public void user_open_the_browser_and_log_in() throws InterruptedException {
        String chromePath= System.getProperty("user.dir")+"\\src\\Browsers\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.silentOutput","true");
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver =new ChromeDriver();
        followUsPages=new POM008_followUsPage(driver);
        driver.get("https://www.noon.com/egypt-en/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        followUsPages.followUsSigninElPF().click();
        Thread.sleep(3000);
        followUsPages.followUsEmailElPF().sendKeys("fathyelfar11@gmail.com");
        followUsPages.followUsPasswElPF().sendKeys("123412341");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        followUsPages.followUsLoginBttnPF().click();
        Thread.sleep(3000);
    }

    @When("scroll down and click on facebook icon")
    public void scroll_down_and_click_on_facebook_icon() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
      //  driver.findElement(By.xpath("//*[local-name()='svg']/*[local-name()='title']/*[local-name()='path'][1]")).click();
      //  driver.findElement(By.xpath("//*[local-name()='svg'][2]")).click();
      //  driver.findElement(By.xpath("//div[@class='sc-160e1e76-13 jbdKGa']//div[1]//div[1]//*[name()='svg']//*[name()='path'][2]")).click();
        followUsPages.xpath1().click();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());

        }
       @Then("switch the url to the childWindow and confirm it")
       public void switch_the_url_to_the_childWindow_and_confirm_it() throws InterruptedException {
           Set<String> window = driver.getWindowHandles();
           Iterator<String> iter = window.iterator();
           String parentWindow = iter.next();
           String childWindow = iter.next();
           driver.getCurrentUrl();
           driver.switchTo().window(childWindow);
           Thread.sleep(4000);
           Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/noon/");
           Thread.sleep(3000);
           driver.close();
           Thread.sleep(4000);
           driver.switchTo().window(parentWindow);
           Thread.sleep(7000);
           driver.close();
           driver.quit();
           Thread.sleep(2000);
       }

        //Scenario 2
           @When("scroll down and click on twitter icon")
           public void scroll_down_and_click_on_twitter_icon() throws InterruptedException {
               driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
               Thread.sleep(3000);
               followUsPages.xpath2().click();
             //  driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[5]")).click();
               Thread.sleep(2000);
               System.out.println(driver.getCurrentUrl());

           }
           @Then("switch the url to the childWindow and confirm")
           public void switch_the_url_to_the_child_window_and_confirm() throws InterruptedException {
               Set<String> window = driver.getWindowHandles();
               Iterator<String> iter = window.iterator();
               String parentWindow = iter.next();
               String childWindow = iter.next();
               driver.getCurrentUrl();

               driver.switchTo().window(childWindow);
               Thread.sleep(4000);
               Assert.assertEquals(driver.getCurrentUrl(), "https://twitter.com/noon/");
               Thread.sleep(3000);
               driver.close();
               Thread.sleep(4000);
               driver.switchTo().window(parentWindow);
               Thread.sleep(7000);
               driver.close();
               driver.quit();
               Thread.sleep(2000);
           }
    //Scenario 3
    @When("scroll down and click on instagram icon")
    public void scroll_down_and_click_on_instagram_icon() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        followUsPages.xpath3().click();
       // driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[6]")).click();
        Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());


    }

    @Then("switch the url to the childWindow and confirm that")
    public void switch_the_url_to_the_child_window_and_confirm_that() throws InterruptedException {

        Set<String> window = driver.getWindowHandles();
        Iterator<String> iter = window.iterator();
        String parentWindow = iter.next();
        String childWindow = iter.next();
        driver.getCurrentUrl();

        driver.switchTo().window(childWindow);
        Thread.sleep(4000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/accounts/login/?next=/noon/");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(4000);
        driver.switchTo().window(parentWindow);
        Thread.sleep(7000);
        driver.close();
        driver.quit();
        Thread.sleep(2000);
    }
        //Scenario 4
        @When("scroll down and click on linkedin icon")
        public void scroll_down_and_click_on_linkedin_icon() throws InterruptedException {

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Thread.sleep(3000);
            followUsPages.xpath4().click();
            //driver.findElement(By.xpath("//footer[@class='sc-160e1e76-0 huMkCr']//div[4]//div[1]//*[name()='svg']//*[name()='path'][2]")).click();
            Thread.sleep(2000);
            System.out.println(driver.getCurrentUrl());

        }

    @Then("switch the url to the childWindow then confirm")
    public void switch_the_url_to_the_child_window_then_confirm() throws InterruptedException {

        Set<String> window = driver.getWindowHandles();
        Iterator<String> iter = window.iterator();
        String parentWindow = iter.next();
        String childWindow = iter.next();
        driver.getCurrentUrl();

        driver.switchTo().window(childWindow);
        Thread.sleep(4000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.linkedin.com/uas/login?session_redirect=%2Fcompany%2F18045372%2F");
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(4000);
        driver.switchTo().window(parentWindow);
        Thread.sleep(7000);
        driver.close();
        driver.quit();
        Thread.sleep(2000);
    }






}




