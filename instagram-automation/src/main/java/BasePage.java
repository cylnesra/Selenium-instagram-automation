import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    String baseUrl = "https://www.instagram.com/";
    WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public WebElement find(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

   public void click(By locator){
       wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
   }
    public void JsExecutorClick(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",locator);
    }
}
