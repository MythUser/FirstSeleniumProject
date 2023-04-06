import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TC6Sprint1 {


    @Test
    //Home Page | Featured Products: Verify number of products displayed
    public void Test_TC_006_06() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://askomdch.com/");
        Assert.assertEquals(driver.getTitle(), "AskOmDch – Become a Selenium automation expert!");

        WebElement allProducts = driver.findElement(By.xpath("//ul[@class=\"products columns-5\"]"));
        List<WebElement> products = allProducts.findElements(By.tagName("li"));
        Assert.assertEquals(products.size(), 5);

        driver.quit();


    }

}
