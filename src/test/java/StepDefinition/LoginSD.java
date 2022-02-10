package StepDefinition;

import Pages.Base;
import Pages.Login;
import cucumber.api.java.en.*;
import java.io.IOException;

public class LoginSD extends Base {
    Login log;

    @Given("^User is on Login Page$")
    public void LoginPage() {
        launch();
        log= new Login();
    }
    @When("^User enters username and password in user and pass field$")
    public void UserLogin() throws IOException {
        log.userlogin();
    }
    @Then("^User clicks on login button$")
    public void LoginButton(){
        log.loginbutton();
    }
    @And("^User is on Home Page$")
    public void UserOnHomePage(){
        log.Verify();
    }
}
