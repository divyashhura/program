package Pages;

import Resources.Xls_Reader;
import Test.Base;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage {
    WebDriver driver;

    @FindBy (id="user-name")
    private WebElement username;
    @FindBy (id="password")
    private
    WebElement password;
    @FindBy (id="login-button")
    private
    WebElement submit;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    public void LoginModule() throws IOException {
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
            submit.click();
            String actual = driver.getCurrentUrl();
            String expected = "https://www.saucedemo.com/inventory.html";
            Assert.assertEquals(actual, expected);
            driver.navigate().back();
        }
    }
    public void LoginStdUser(){
            username.sendKeys("standard_user");
            password.sendKeys("secret_sauce");
            submit.click();
            String actual = driver.getCurrentUrl();
            String expected = "https://www.saucedemo.com/inventory.html";
            Assert.assertEquals(actual,expected);
    }

}
