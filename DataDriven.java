/*Assignment 3: Fetching data from the Excel sheet Login.xlsx using Data-Driven Framework
and Writing status in the Excel sheet which shows if the value has been
passed or not.*/
package Assignment3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDriven {
    void launch() throws IOException, InterruptedException {
        String uname,pass;
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String path=System.getProperty("user.dir")+"//Test/Login.xlsx";
        System.out.println(path);
        FileInputStream fis=new FileInputStream(path);
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        XSSFSheet sheet= wb.getSheet("Login_details");
        System.out.println(sheet.getLastRowNum());
        for(int i=1;i<=sheet.getLastRowNum();i++) {
            uname=sheet.getRow(i).getCell(0).getStringCellValue();
            driver.findElement(By.name("txtUsername")).sendKeys(uname);
            pass=sheet.getRow(i).getCell(1).getStringCellValue();
            driver.findElement(By.id("txtPassword")).sendKeys(pass);
            driver.findElement(By.id("btnLogin")).click();
            String expected="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
            FileOutputStream o = new FileOutputStream(path);
            XSSFCell cell = sheet.getRow(i).createCell(2);
            String actualname = driver.getCurrentUrl();
            if(expected.equals(actualname)){
                cell.getRow().createCell(2).setCellValue("pass");
            }else{
                cell.getRow().createCell(2).setCellValue("fail");
            }
            wb.write(o);

        }
        wb.close();
        driver.quit();
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        DataDriven a=new DataDriven();
        a.launch();
    }
}