import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3Sprint1 {

    @Test
    //Home Page: Verify the discount message is presented on the page
    public void Test_TC_003_03() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Assert.assertEquals(driver.getTitle(), "AskOmDch – Become a Selenium automation expert!");

        String discountCheck = driver.findElement(By.xpath("//h3[@class=\"has-text-align-center has-white-color has-text-color has-medium-font-size\"]")).getText();
        Assert.assertEquals(discountCheck, "25% OFF On all products");
        Thread.sleep(3000);

        driver.quit();


    }


}
