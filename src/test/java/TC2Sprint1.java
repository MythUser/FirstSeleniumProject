import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2Sprint1 {

    @Test
    //Home Page | Featured Products: Validate "$" sign is present under all displayed products
    public void Test_TC_002_02() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Assert.assertEquals(driver.getTitle(), "AskOmDch – Become a Selenium automation expert!");

        String currencyValidation = driver.findElement(By.xpath("//span[@class=\"woocommerce-Price-currencySymbol\"]")).getText();
        Assert.assertEquals(currencyValidation, "$");
        Thread.sleep(3000);
        driver.quit();

    }


}
