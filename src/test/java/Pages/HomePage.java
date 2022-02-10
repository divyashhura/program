package Pages;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class HomePage extends Base {
    @FindBy(linkText="PIM")
    WebElement pim;
    @FindBy(id="menu_pim_addEmployee")
    WebElement addemployee;
    @FindBy(id="firstname")
    WebElement fname;
    @FindBy(id="lastname")
    WebElement lname;
    @FindBy(id="chkLogin")
    WebElement checklogin;
    @FindBy(id="user_name")
    WebElement uname;
    @FindBy(id="user_password")
    WebElement pass;
    @FindBy(id="re_password")
    WebElement repass;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void UserClickPIM(){
        pim.click();
    }
    public void AddEmployee(){
        addemployee.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
    public void UserDetail() throws IOException {
        String path = System.getProperty("user.dir") + "/TestData/AddUser_Data.xlsx";
        System.out.println(path);
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook bk = new XSSFWorkbook(file);
        XSSFSheet sh = bk.getSheetAt(0);
        int i = sh.getLastRowNum();
        for (int a = 1; a <= i; a++) {
            String firstname = sh.getRow(a).getCell(0).getStringCellValue();
            String lastname = sh.getRow(a).getCell(1).getStringCellValue();
            fname.sendKeys(firstname);
            lname.sendKeys(lastname);
            checklogin.click();
        }
    }
    public void UserDetails() throws IOException {
        String path = System.getProperty("user.dir") + "/TestData/AddUser_Data.xlsx";
        System.out.println(path);
        FileInputStream file = new FileInputStream(path);
        XSSFWorkbook bk = new XSSFWorkbook(file);
        XSSFSheet sh = bk.getSheetAt(0);
        int i = sh.getLastRowNum();
        for (int a = 1; a <= i; a++) {
            String username = sh.getRow(a).getCell(2).getStringCellValue();
            String password = sh.getRow(a).getCell(3).getStringCellValue();
            uname.sendKeys(username);
            pass.sendKeys(password);
            repass.sendKeys(password);
        }
    }
    public void UserSave(){
        driver.findElement(By.id("btnSave")).click();
    }
}
