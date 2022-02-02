package DemoTestng1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccessPage extends LaunchNew {
    @Test(groups = {"log"})
    public void login(){
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
    @Test(groups = {"log","access"})
    public void verify(){
        String title=driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Correct page");
    }

    @Test(groups = {"access"})
    public void forgetpass(){
        driver.findElement(By.linkText("Forgot your password?")).click();
    }
    @Test(groups = {"log"})
    public void logout(){
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
}