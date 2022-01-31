import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class Assign{
    void launch(String fname,String pass,String email) throws InterruptedException {
        WebDriver a= new ChromeDriver();
        a.manage().window().maximize();
        a.get("https://www.facebook.com/");
        a.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        a.findElement(By.xpath("//div[@class='_1lch']/child::button[@type='submit'])")).click();
        a.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']/parent::div[@class='_1lch']/preceding-sibling::div[@id='fullname_field']//child::input[@name='firstname']")).sendKeys(fname);
        a.findElement(By.xpath("//input[@name='reg_email__']//following-sibling::input[@name='reg_passwd__']")).sendKeys(pass);
        a.findElement(By.xpath("//input[@name='reg_passwd__']//preceding-sibling::input[@name='reg_email__']")).sendKeys(email);
    }
}

public class FacebookAssign extends Assign {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter first name");
        Scanner obj=new Scanner(System.in);
        String fname=obj.nextLine();
        System.out.println("Enter password");
        String pass=obj.nextLine();
        System.out.println("Enter email");
        String email=obj.nextLine();
        WebDriverManager.chromedriver().setup();
        Assign a=new Assign();
        a.launch(fname, pass,email);
        obj.close();
    }
}
