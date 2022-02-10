package StepDefinition;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginPage {
   public static WebDriver driver;
    @Given("^User is on Login Page$")
    public void UserOnLoginPage(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("User enters {string} and {string} in user and pass field")
    public void UserEnters(String username,String password) {
        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    @Then("^User clicks on login button$")
    public void UserClicksLogin(){
        driver.findElement(By.id("btnLogin")).click();
    }
    @And("^User is on Home Page$")
    public void VerifyHomePage(){
        Assert.assertEquals("OrangeHRM",driver.getTitle());
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }

}
