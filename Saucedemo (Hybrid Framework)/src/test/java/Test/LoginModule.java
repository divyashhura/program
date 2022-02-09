package Test;

import Pages.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginModule extends Base {

    @Test
    public void TestLog2() throws IOException {
        pageFactory.getLoginPage().LoginModule();
    }

    @Test (dependsOnMethods = "TestLog2")
    public void Test2() throws InterruptedException {
        pageFactory.getLoginPage().LoginStdUser();
        pageFactory.getHomePage().setLogout();
    }


}
