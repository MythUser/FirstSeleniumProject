import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4Sprint1 {

    @Test
    //Home Page: Verify the Login page is opened after clicking on the "Account" button
    public void Test_TC_004_04() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://askomdch.com/");

        driver.findElement(By.xpath("//li[@id=\"menu-item-1237\"]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://askomdch.com/account/");
        Thread.sleep(2000);

        driver.quit();


    }


}
