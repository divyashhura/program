/*Assignment 5: Performed Groups of group method */
package DemoTestng1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchNew {
    public static WebDriver driver;
    @BeforeSuite(groups = {"log","access"})
    public  void launch_browser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @AfterSuite(groups = {"log","access"})
    public void exit(){
        driver.quit();
    }
}
