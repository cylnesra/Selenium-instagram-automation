import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Test_Signup_Page extends BaseTest{

    @Test
    @Order(1)
    public void testLoginWithFacebook(){
        SignupPage signupPage = new SignupPage(driver);
        signupPage.loginWithFacebookButtonClick();
        //signupPage.navigateBack();
    }

    @Test
    @Order(2)
    public void testSignup(){
        SignupPage signupPage = new SignupPage(driver);

        signupPage.setUserEmail("newuser@gmail.com");
        Assertions.assertEquals("newuser@gmail.com",signupPage.getUserEmail());

        signupPage.setFullName("New User");
        Assertions.assertEquals("New User",signupPage.getFullName());

        signupPage.setUserName("newUser1");
        Assertions.assertEquals("newUser1",signupPage.getUserName());

        signupPage.setUserPassword("12345");
        Assertions.assertEquals("12345",signupPage.getUserPassword());

        signupPage.submitButton();
    }
}
