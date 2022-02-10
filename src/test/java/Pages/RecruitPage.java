//package Pages;
//
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//
//public class RecruitPage extends Base {
//    @FindBy(linkText="Recruitment")
//    WebElement recruit;
//    @FindBy(linkText = "Candidates")
//    WebElement candidates;
//    @FindBy(id="candidateSearch_jobTitle")
//    WebElement jobtitle;
//    @FindBy(id="candidateSearch_jobVacancy")
//    WebElement jobvacancy;
//    @FindBy(id="candidateSearch_fromDate")
//    WebElement searchfrom;
//    @FindBy(id="candidateSearch_toDate")
//    WebElement searchto;
//    @FindBy(id="btnSrch")
//    WebElement searchbutton;
//
//    Select drag;
//
//    public RecruitPage(){
//        PageFactory.initElements(driver,this);
//    }
//    public void RecruitmentTag() {
//        recruit.click();
//    }
//    public void CandidateTag() {
//        candidates.click();
//    }
//    public void JobTitles() throws InterruptedException {
//        drag = new Select(jobtitle);
//        drag.selectByValue("7");
//        Thread.sleep(3000);
//    }
//    public void JobVacancy() throws InterruptedException {
//        drag = new Select(jobvacancy);
//        drag.selectByValue("1");
//        Thread.sleep(3000);
//    }
//
//    public void CalenderDates(String datefrom, String dateto) throws InterruptedException {
//        searchfrom.clear();
//        searchfrom.sendKeys(datefrom);
//        searchto.clear();
//        searchto.sendKeys(dateto);
//        Thread.sleep(2000);
//    }
//
//    public void Search(){
//        searchbutton.click();
//    }
//}
