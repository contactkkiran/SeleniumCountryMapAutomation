import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SeleniumBasics {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();
    }
    @Test
    public void testDoubleClick(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("doubleClickBtn"))).doubleClick().build().perform();
        String actualRes = driver.findElement(By.id("doubleClickMessage")).getText();
        Assert.assertEquals(actualRes," have done a double click" );

    }

    @Test
    public void testRightClick(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("rightClickBtn"))).contextClick().build().perform();
        String actualRes = driver.findElement(By.id("rightClickMessage")).getText();
        Assert.assertEquals(actualRes,"You have done a right click" );
    }



}
