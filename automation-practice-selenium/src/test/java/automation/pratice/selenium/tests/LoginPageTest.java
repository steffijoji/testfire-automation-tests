package automation.pratice.selenium.tests;

import automation.pratice.selenium.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest {

    private LoginPage loginPage;
    private final String URL = "http://demo.testfire.net/login.jsp";

    @BeforeEach
    public void setUp() throws Exception {
        loginPage = new LoginPage();
        loginPage.visit(this.URL);
    }

    @AfterEach
    public void tearDown() throws Exception {
        loginPage.quitWebDriver();
    }

    @Test
    public void successfullyLogin() {
        //when
        loginPage.signIn();
        //then
        Assertions.assertTrue(this.loginPage.getHelloMessage().equals("Hello Admin User"));
        Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(URL));
    }
}
