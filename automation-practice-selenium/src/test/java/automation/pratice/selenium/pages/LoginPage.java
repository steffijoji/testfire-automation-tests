package automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    //Locators:
    private By usernameLocator = By.id("uid");
    private By passwordLocator = By.id("passw");
    private By loginButtonLocator = By.name("btnSubmit");
    private By tagHelloLocator = By.tagName("h1");

    public void signIn() {
        if(super.isDisplayed(usernameLocator)) {
            super.type("admin", usernameLocator);
            super.type("admin", passwordLocator);
            super.click(loginButtonLocator);
        } else {
            System.out.println("Campo 'username' não apareceu.");
        }
    }

    public String getHelloMessage() {
        return super.getText(tagHelloLocator);
    }
}
