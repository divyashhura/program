package StepDefinition;


import Pages.Base;
import cucumber.api.java.en.*;
import java.io.IOException;


public class HomePageSD extends Base {

    @When("^User clicks on PIM tag$")
    public void UserClickPIM() throws IOException {
        obj.getlogin().userlogin();
        obj.getlogin().loginbutton();
        obj.gethomepage().UserClickPIM();
    }
    @Then("^User clicks on Add Employee tag$")
    public void AddEmployee(){
        obj.gethomepage().AddEmployee();
    }
    @Then("^User enters firstname and lastname in the fields$")
    public void UserEnterDetails() throws IOException {
        obj.gethomepage().UserDetail();
    }
    @Then("^User enters username and password$")
    public void UserAddDetails() throws IOException {
        obj.gethomepage().UserDetails();

    }
    @And("^User clicks on save button$")
    public void UserSaveDetails(){
        obj.gethomepage().UserSave();
    }
}
