package ParallelExecution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.time.Duration;

public class ParallelFirefox {
    WebDriver driver1;
    @Test
    void launch_firefox(){
        WebDriverManager.firefoxdriver().setup();
        driver1=new FirefoxDriver();
        driver1.get("https://opensource-demo.orangehrmlive.com/");
    }
    @Test
    public void login(){
        driver1.findElement(By.id("txtUsername")).sendKeys("admin");
        driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver1.findElement(By.id("btnLogin")).click();
    }
    @Test
    public void logout() throws InterruptedException {
        Thread.sleep(5000);
        driver1.findElement(By.xpath("//a[@id='welcome']")).click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver1.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    }
}
