import cc.robotdreams.automation.Session;
import cc.robotdreams.automation.utils.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class xPath {
    @Test()
    public void firstTest() {

        Session.get().webdriver().get("https://demoqa.com/buttons");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
        WebElement text = Session.get().webdriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p"));
        String s = text.getText();
        System.out.println("Text content is : " + s);
        Sleep.sleep(5000);
    }


    @Test()
    public void secondTest()  {

        Session.get().webdriver().get("https://demoqa.com/webtables");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/button")).click();
        Session.get().webdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //fill in user data and save
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Kate");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Johns");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("kate.johns@gmail.com");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("30");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("100000");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("Sales");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"submit\"]")).click();

        Session.get().webdriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //verify the user is created
        Session.get().webdriver().findElement(By.xpath("//*[contains(text(),'Kate')]"));
        Session.get().webdriver().findElements(By.xpath("//*[contains(text(),'Johns')]"));
        Session.get().webdriver().findElements(By.xpath("//*[contains(text(),'kate.johns@gmail.com')]"));
        Session.get().webdriver().findElements(By.xpath("//*[contains(text(),'30')]"));
        Session.get().webdriver().findElements(By.xpath("//*[contains(text(),'100000')]"));
        Session.get().webdriver().findElements(By.xpath("//*[contains(text(),'Sales')]"));

        Session.get().webdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //update user data
        Session.get().webdriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[3]/div/div[7]/div/span[1]")).click();

        Session.get().webdriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        Session.get().webdriver().findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Black");
        Session.get().webdriver().findElement(By.xpath("//*[@id=\"submit\"]")).click();

        //verify data is updated
        Session.get().webdriver().findElement(By.xpath("//*[contains(text(),'Black')]"));

        Sleep.sleep(5000);
    }
}

