package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage{
    WebDriver driver;
     @Given("^User is on Login Page$")
    public void UserOnLoginPage(){
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Then("^User enters username in username textfield$")
    public void UserEntersUsername() {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
    }
    @Then("^User enters password in password textfield$")
    public void UserEntersPassword(){
         driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    }
    @Then("^User clicks on login button$")
    public void UserClicksLogin(){
         driver.findElement(By.id("btnLogin")).click();
    }
    @Then("^User is on Home Page$")
    public void VerifyHomePage(){
         Assert.assertEquals("OrangeHRM",driver.getTitle());
    }
}
