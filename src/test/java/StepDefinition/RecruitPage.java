package StepDefinition;

import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import static StepDefinition.LoginPage.driver;

public class RecruitPage {
    Select drag;
    @When("^User clicks on Recruitment tag$")
    public void RecruitPage() {
        driver.findElement(By.linkText("Recruitment")).click();
    }
    @When("^User clicks on Candidates tag$")
    public void CandidatePage() {
        driver.findElement(By.linkText("Candidates")).click();
    }
    @Then("^User selects the Job Title$")
    public void JobTitles() throws InterruptedException {
        drag = new Select(driver.findElement(By.id("candidateSearch_jobTitle")));
        drag.selectByValue("7");
        Thread.sleep(3000);
    }
    @Then("^User selects the Vacancy$")
    public void JobVacancy() throws InterruptedException {
        drag = new Select(driver.findElement(By.id("candidateSearch_jobVacancy")));
        drag.selectByValue("1");
        Thread.sleep(3000);
    }
    @Then("User selects the {string} and {string} in YYYY-MM-DD form")
    public void CalenderDates(String datefrom, String dateto) throws InterruptedException {
        driver.findElement(By.id("candidateSearch_fromDate")).clear();
        driver.findElement(By.id("candidateSearch_fromDate")).sendKeys(datefrom);
        driver.findElement(By.id("candidateSearch_toDate")).clear();
        driver.findElement(By.id("candidateSearch_toDate")).sendKeys(dateto);
        Thread.sleep(2000);
    }
    @And("^User clicks on Search button$")
    public void Search(){
        driver.findElement(By.id("btnSrch")).click();
    }
}
