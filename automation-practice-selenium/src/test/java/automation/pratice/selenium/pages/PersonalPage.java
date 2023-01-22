package automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class PersonalPage extends BasePage {

    //Locators
    private By menuPersonalLocator = By.cssSelector("#LinkHeader2");
    private By titlePersonalLocator = By.cssSelector("body > table > tbody > tr:nth-child(2) > td:nth-child(2) > div.fl > h1");

    public void viewPersonalPage() {
        if(super.isDisplayed(menuPersonalLocator)) {
            super.click(menuPersonalLocator);
        } else {
            System.out.println("Página não encontrada");
        }
    }

    public String getTitlePage() {
        return super.getText(titlePersonalLocator);
    }
}
