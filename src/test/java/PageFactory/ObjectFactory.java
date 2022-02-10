package PageFactory;
import Pages.HomePage;
import Pages.Login;
//import Pages.RecruitPage;

public class ObjectFactory {

    private Login logObj;
    private HomePage homeObj;
//    private RecruitPage recruitObj;
    public Login getlogin()
    {
        if (logObj == null)
        {
            logObj = new Login();
        }
        return logObj;
    }
    public HomePage gethomepage()
    {
        if (homeObj == null)
        {
            homeObj = new HomePage();
        }
        return homeObj;
    }
//    public RecruitPage getRecruitpage()
//    {
//        if (recruitObj == null)
//        {
//            recruitObj = new RecruitPage();
//        }
//        return recruitObj;
//    }
}