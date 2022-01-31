import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Bbc {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.bbc.com/");
        List<WebElement> l=d.findElements(By.tagName("a"));
        for(int i=0;i<l.size();i++) {
            System.out.println(l.get(i).getAttribute("href"));
        }
    }
}
