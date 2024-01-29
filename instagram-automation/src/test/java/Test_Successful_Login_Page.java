import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test_Successful_Login_Page extends BaseTest{

    @Test
    @Order(1)
    public void TestLoginCase1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("newUser1");
        Assertions.assertEquals("newUser1",loginPage.getUserName(),"Username value is not correct!");
        loginPage.setPassword("12345");
        Assertions.assertEquals("12345",loginPage.getPassword(),"Password value is not correct!");
        loginPage.loginButtonClick();
    }

    @Test
    @Order(2)
    public void TestLoginCookieCase2(){
        LoginPage loginPage = new LoginPage(driver);
        TestLoginCase1();
        loginPage.loginButtonClick();
        loginPage.loginInfoCookie();
        loginPage.loginNotificationsButton();
    }

    @Test
    public void TestSignupCase3(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signupLinkLocator();
        loginPage.createNewAccount();
    }
}
