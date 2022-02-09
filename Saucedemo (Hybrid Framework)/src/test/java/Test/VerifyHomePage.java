package Test;

import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyHomePage extends Base {

    @Test
    public void TestLog() throws IOException {
        pageFactory.getLoginPage().LoginStdUser();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkBagPackPic(){
        pageFactory.getHomePage().setBagPackPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkBikeLightPic(){
        pageFactory.getHomePage().setBikeLightPic();
        driver.navigate().back();
    }
    @Test (dependsOnMethods = "TestLog")
    public void checkJacketPic(){
        pageFactory.getHomePage().setJacketPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkOneSiePic(){
        pageFactory.getHomePage().setOnesiePic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkTshirtPic(){
        pageFactory.getHomePage().settShirtPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkBagPackLink(){
        pageFactory.getHomePage().setBagPack();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkBikeLightLink(){
        pageFactory.getHomePage().setBikeLight();
        driver.navigate().back();
    }
    @Test (dependsOnMethods = "TestLog")
    public void checkJacketLink(){
        pageFactory.getHomePage().setJacket();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkOnesieLink(){
        pageFactory.getHomePage().setOnesie();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkTshirtLink(){
        pageFactory.getHomePage().settShirt();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "TestLog")
    public void checkTRedLink(){
        pageFactory.getHomePage().settRed();
        driver.navigate().back();
    }

}
