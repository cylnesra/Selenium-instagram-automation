import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

   WebDriver driver;

    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
    }

    @BeforeEach
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
