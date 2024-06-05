import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver_125.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        System.out.println(driver.getTitle());
        System.out.println("Vežbamo Selenium");


        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("[name='q']")).sendKeys("Torte i kolači");
        driver.findElement(By.cssSelector("[name='btnK']")).click();

        driver.findElement(By.)
        Thread.sleep(5000);



        driver.quit();
    }
}
