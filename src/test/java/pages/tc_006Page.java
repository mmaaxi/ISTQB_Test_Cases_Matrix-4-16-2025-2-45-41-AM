package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_006Page {
    WebDriver driver;

    @FindBy(id = "login_button")
    WebElement loginButton;

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "logout_button")
    WebElement logoutButton;

    @FindBy(id = "confirm_logout")
    WebElement confirmLogoutButton;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void clickLogout() {
        logoutButton.click();
    }

    public void checkLogoutPrompt() {
        if (confirmLogoutButton.isDisplayed()) {
            System.out.println("Logout confirmation is prompted.");
        } else {
            System.out.println("Logged out immediately.");
        }
    }

    public void confirmLogout() {
        if (confirmLogoutButton.isDisplayed()) {
            confirmLogoutButton.click();
        }
    }

    public void verifyUserIsLoggedOut() {
        // Implement verification that the user is logged out and redirected to the home page
    }
}