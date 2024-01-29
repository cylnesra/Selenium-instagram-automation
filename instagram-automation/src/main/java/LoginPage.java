import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By userNameLocator = By.cssSelector("input[aria-label='Phone number, username, or email']");
    private final By userPasswordLocator = By.cssSelector("input[aria-label='Password']");
    private final By loginButtonLocator = new By.ByCssSelector("button[type='submit']");
    private final By loginInfoCookieCloseLocator = By.xpath("//div[contains(text(),'Not now')]");
    private final By loginNotificationsButtonLocator = By.xpath("//button[@class=\"_a9-- _ap36 _a9_1\"]");
    private final By signUpLocator = By.cssSelector("a[href='/accounts/password/reset/']");
    private final By createNewAccountLocator = By.xpath("//*[text()='Create new account']");

    public LoginPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl);
    }

    public void setUserName(String username){
       find(userNameLocator).sendKeys(username);
    }

    public void setPassword(String password){
       find(userPasswordLocator).sendKeys(password);
    }
    public String getUserName(){
       return find(userNameLocator).getAttribute("value");
    }

    public String getPassword(){
       return find(userPasswordLocator).getAttribute("value");
    }

    public void loginButtonClick(){
        WebElement loginButton = findElement(loginButtonLocator);
        JsExecutorClick(loginButton);
    }

    public void loginInfoCookie(){
        click(loginInfoCookieCloseLocator);
    }

    public void loginNotificationsButton(){
        click(loginNotificationsButtonLocator);
    }

    public void signupLinkLocator(){
        click(signUpLocator);
    }

    public void createNewAccount(){
        click(createNewAccountLocator);
    }




}
