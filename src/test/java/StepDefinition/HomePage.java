package StepDefinition;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;
import static StepDefinition.LoginPage.driver;

public class HomePage {

    @When("^User clicks on PIM tag$")
    public void UserClickPIM(){
        driver.findElement(By.linkText("PIM")).click();
    }
    @Then("^User clicks on Add Employee tag$")
    public void AddEmployee(){
        driver.findElement(By.id("menu_pim_addEmployee")).click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    @Then("User enters {string} and {string} in the fields")
    public void UserEnterDetails(String fname,String lname){
        driver.findElement(By.id("firstname")).sendKeys(fname);
        driver.findElement(By.id("lastName")).sendKeys(lname);
        driver.findElement(By.id("chkLogin")).click();
    }
    @Then("User enters {string} and {string}")
    public void UserDetails(String uname, String pass){
        driver.findElement(By.id("user_name")).sendKeys(uname);
        driver.findElement(By.id("user_password")).sendKeys(pass);
        driver.findElement(By.id("re_password")).sendKeys(pass);
    }
    @And("^User clicks on save button$")
    public void UserSaveDetails(){
        driver.findElement(By.id("btnSave")).click();
    }
}
