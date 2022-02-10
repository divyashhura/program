//package StepDefinition;
//
//import Pages.Base;
//import io.cucumber.java.en.*;
//import java.io.IOException;
//
//public class RecruitmentSD extends Base {
//    RecruitmentSD(){
//        super();
//    }
//
//    @When("^User clicks on Recruitment tag$")
//    public void RecruitPage() throws IOException {
//        obj.getlogin().userlogin();
//        obj.getlogin().loginbutton();
//        obj.getlogin().Verify();
//        obj.getRecruitpage().RecruitmentTag();
//    }
//    @When("^User clicks on Candidates tag$")
//    public void CandidatePage() {
//        obj.getRecruitpage().CandidateTag();
//    }
//    @Then("^User selects the Job Title$")
//    public void JobTitles() throws InterruptedException {
//        obj.getRecruitpage().JobTitles();
//    }
//    @Then("^User selects the Vacancy$")
//    public void JobVacancy() throws InterruptedException {
//        obj.getRecruitpage().JobVacancy();
//    }
//    @Then("User selects the {string} and {string} in YYYY-MM-DD form")
//    public void CalenderDates(String datefrom, String dateto) throws InterruptedException {
//        obj.getRecruitpage().CalenderDates(datefrom,dateto);
//    }
//    @And("^User clicks on Search button$")
//    public void Search(){
//        obj.getRecruitpage().Search();
//    }
//}
