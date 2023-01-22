package automation.pratice.selenium.tests;

import automation.pratice.selenium.pages.PersonalPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonalPageTest {

    private PersonalPage personalPage;
    private final String URL = "http://demo.testfire.net/login.jsp";

    @BeforeEach
    public void setUp() {
        this.personalPage = new PersonalPage();
        this.personalPage.visit(URL);
    }

    @AfterEach
    public void tearDown() {
        this.personalPage.quitWebDriver();
    }

    @Test
    public void accessPersonalPage() {
        //when
        this.personalPage.viewPersonalPage();
        //then
        Assertions.assertEquals("Personal", this.personalPage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(personalPage.getCurrentUrl()));
    }
}
