package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import java.util.Iterator;
import java.util.Set;

import static java.time.Duration.*;

public class HomePageStdUser {

    public static WebDriver driver;
    static SoftAssert soft = new SoftAssert();

    @FindBy(partialLinkText="Sauce Labs Backpack")
    public WebElement bagPack;
    @FindBy(partialLinkText="Sauce Labs Bike Light")
    public WebElement bikeLight;
    @FindBy(partialLinkText="Sauce Labs Bolt T-Shirt")
    public WebElement tShirt;
    @FindBy(partialLinkText="Sauce Labs Fleece Jacket")
    public WebElement jacket;
    @FindBy(partialLinkText="Sauce Labs Onesie")
    public WebElement onesie;
    @FindBy(partialLinkText="Test.allTheThings() T-Shirt (Red)")
    public WebElement tRed;
    @FindBy(className = "shopping_cart_link")
    public WebElement cart;
    @FindBy(id="react-burger-menu-btn")
    public WebElement menu;
    @FindBy(id="logout_sidebar_link")
    public WebElement allItem;
    @FindBy(id="logout_sidebar_link")
    public WebElement logout;
    @FindBy(partialLinkText = "Reset App State")
    public WebElement resetApp;
    @FindBy(id="item_4_img_link")
    public WebElement bagPackPic;
    @FindBy(id="item_0_img_link")
    public WebElement bikeLightPic;
    @FindBy(id="item_1_img_link")
    public WebElement tShirtPic;
    @FindBy(id="item_5_img_link")
    public WebElement jacketPic;
    @FindBy(id="item_2_img_link")
    public WebElement onesiePic;

    public HomePageStdUser(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void setBagPack(){
        bagPack.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }
    public void setBikeLight(){
        bikeLight.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirt(){
        tShirt.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacket(){
        jacket.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }
    public void settRed(){
        tRed.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=3";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesie(){
        onesie.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }
    public void setLogout(){
        menu.click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        logout.click();
    }

    public void setBagPackPic(){
        bagPackPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=4";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setBikeLightPic(){
        bikeLightPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=0";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void settShirtPic(){
        tShirtPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=1";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setJacketPic(){
        jacketPic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=5";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }

    public void setOnesiePic(){
        onesiePic.click();
        String exp = "https://www.saucedemo.com/inventory-item.html?id=2";
        String act = driver.getCurrentUrl();
        soft.assertEquals(act,exp);
        soft.assertAll();
    }
}
