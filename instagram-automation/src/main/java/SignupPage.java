import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage extends BasePage{
    private final By loginWithFacebookButtonLocator = By.cssSelector("span._9zlu ");
    private final By userEmailLocator = By.cssSelector("input[aria-label='Mobile Number or Email']");
    private final By userFullNameLocator = By.cssSelector("input[aria-label='Full Name']");
    private final By userNameLocator = By.cssSelector("input[aria-label='Username']");
    private final By userPasswordLocator = By.cssSelector("input[aria-label='Password']");
    private final By signupSubmitLocator = By.cssSelector("button[type='submit']");


    public SignupPage(WebDriver driver){
        super(driver);
        driver.get(baseUrl.concat("accounts/emailsignup/"));
    }

    public void loginWithFacebookButtonClick(){
        click(loginWithFacebookButtonLocator);
    }

    public void setUserEmail(String email){
        find(userEmailLocator).sendKeys(email);
    }

    public String getUserEmail(){
        return findElement(userEmailLocator).getAttribute("value");
    }

    public void setFullName(String fullname){
        find(userFullNameLocator).sendKeys(fullname);
    }

    public String getFullName(){
        return findElement(userFullNameLocator).getAttribute("value");
    }

    public void setUserName(String username){
        find(userNameLocator).sendKeys(username);
    }

    public String getUserName(){
        return findElement(userNameLocator).getAttribute("value");
    }

    public void setUserPassword(String password){
        find(userPasswordLocator).sendKeys(password);
    }

    public String getUserPassword(){
        return findElement(userPasswordLocator).getAttribute("value");
    }

    public void submitButton(){
        click(signupSubmitLocator);
    }

    public void navigateBack(){
        driver.navigate().back();
    }



}
