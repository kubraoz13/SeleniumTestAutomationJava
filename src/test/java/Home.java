import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Home extends Login{

    @Test
    public void Anasayfa() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        //üye girişi
        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.findElement(By.id("L-UserNameField")).sendKeys("ozkbraa@gmail.com");
        driver.findElement(By.id("L-PasswordField")).sendKeys("ozkubra54");
        driver.findElement(By.id("gg-login-enter")).click();

        //arama
        driver.findElement(By.cssSelector("input[name=k]")).sendKeys("bilgisayar");
        driver.findElement(By.className("hKfdXF")).click();

        //ikinci sayfaya geçiş rastgeleürün

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,8950)");

        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[text()='2']")).click();
        js.executeScript("window.scrollBy(0,350);");
        Thread.sleep(5000);


        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[3]/div[2]/ul/li[2]/a/div/div/div[1]/div[1]/h3/span")).click();
        js.executeScript("window.scrollBy(0,150);");

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[3]/div[2]/section/div/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[3]/div/a")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div[2]/div[6]/div[2]/div[2]/div[4]/div/div[2]/select/option[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div/div[2]/div[2]/div/div[2]/div[6]/div[2]/div[2]/div[3]/div/div[2]/div/a")).click();

        Thread.sleep(2000);

    }



}
