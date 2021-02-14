import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    @Test
    public void GirisYap()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/uye-girisi");
        driver.findElement(By.id("L-UserNameField")).sendKeys("ozkbraa@gmail.com");
        driver.findElement(By.id("L-PasswordField")).sendKeys("ozkubra54");
        driver.findElement(By.id("gg-login-enter")).click();


    }


}
