import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeWebDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Software/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("tarajain2685@hotmail.com");
        Thread.sleep(000);
        driver.findElement(By.id("Password")).sendKeys("abcd789");
        Thread.sleep(2000);
        driver.findElement(By.id("RememberMe")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

    }
}
