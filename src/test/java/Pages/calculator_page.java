package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class calculator_page {

    WebDriver driver;
    WebDriverWait wait;

    public calculator_page(WebDriver driver1, WebDriverWait wait)
    {
        driver = driver1;
        this.wait = wait;

    }

    public void enterAge() throws InterruptedException {
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/img[1]")).click();
        Thread.sleep(1000);
        WebElement e1= driver.findElement(By.id("cage"));
        Thread.sleep(1000);
        e1.sendKeys("20");
    }

    public void selectGender()
    {
        WebElement radio1=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/label[1]"));
        radio1.click();


    }

    public void enterHeight()
    {
        WebElement h1= driver.findElement(By.id("cheightmeter"));
        h1.sendKeys("180");

    }

    public void enterWeight() throws InterruptedException {
        WebElement kg1= driver.findElement(By.id("ckg"));
        kg1.sendKeys("60");
        Thread.sleep(1000);

    }

    public void clickCalculateButton()
    {
        WebElement res=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[2]"));
        res.click();

    }
    public void getResult()
    {
        WebElement actual= driver.findElement(By.tagName("b"));
        String s1= actual.getText();
        Assert.assertEquals("BMI = 18.5 kg/m2",s1);
        //driver.close();

    }


}
