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
    public void secondTest() {

        Session.get().webdriver().get("https://demoqa.com/webtables");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/button")).click();
        Session.get().webdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Session.get().webdriver().switchTo().frame("modal-content");


        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Kate");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[2]/div[2]/input")).sendKeys("Johns");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[3]/div[2]/input")).sendKeys("kate.johns@gmail.com");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[4]/div[2]/input")).sendKeys("30");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[5]/div[2]/input")).sendKeys("100000");
        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[6]/div[2]/input")).sendKeys("Sales");

        Session.get().webdriver().findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[7]/div/button")).click();

        Sleep.sleep(5000);
    }

}

