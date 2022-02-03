import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ParallelExecuteMethods {
    WebDriver driver,driver1;
    @Test
    void launch_chrome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
    @Test
    void launch_firefox() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver1=new FirefoxDriver();
        driver1.manage().window().maximize();
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.findElement(By.id("txtUsername")).sendKeys("admin");
        driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver1.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);
        driver1.findElement(By.xpath("//a[@id='welcome']")).click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver1.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }

//    @Test(groups = {"log","launch"})
//    public void login(){
//        driver.findElement(By.id("txtUsername")).sendKeys();
//        driver.findElement(By.id("txtPassword")).sendKeys();
//        driver.findElement(By.id("btnLogin")).click();
//    }
//    @Test(groups = {"log","launch"})
//    public void verify(){
//        String title=driver.getTitle();
//        Assert.assertEquals("OrangeHRM",title,"Correct page");
//    }
//    @AfterTest(groups = {"log","launch"})
//    public void logout() throws InterruptedException {
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//a[@id='welcome']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
//        Thread.sleep(2000);
//    }
}
