package Pages;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Login extends Base {
    @FindBy (id="txtUsername")
    WebElement username;
    @FindBy (id="txtPassword")
    WebElement password;
    @FindBy (id="btnLogin")
    WebElement submit;


    public Login() {
        PageFactory.initElements(driver, this);
    }

    public void userlogin() throws IOException {
        String path = System.getProperty("user.dir") + "/TestData/Login.xlsx";
        System.out.println(path);
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook bk = new XSSFWorkbook(file);
        XSSFSheet sh = bk.getSheetAt(0);
        int i = sh.getLastRowNum();
        for (int a = 1; a <= i; a++) {
            String uname = sh.getRow(a).getCell(0).getStringCellValue();
            String pass = sh.getRow(a).getCell(1).getStringCellValue();
            username.sendKeys(uname);
            password.sendKeys(pass);
        }
    }
    public void loginbutton(){
        submit.click();
    }
    public void Verify(){
        String actual = driver.getCurrentUrl();
        String expected = prop.getProperty("expected");
        Assert.assertEquals(actual, expected);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

}