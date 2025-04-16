package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_001Page {

    WebDriver driver;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public boolean isLoginPageDisplayed() {
        return usernameField.isDisplayed() && passwordField.isDisplayed();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public boolean isUsernameAccepted() {
        return usernameField.getAttribute("value").equals("usuarioValido");
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public boolean isPasswordAccepted() {
        return passwordField.getAttribute("value").equals("contraseñaValida");
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isUserHomePageDisplayed() {
        // Example condition to validate the redirection to user's home page
        return driver.getCurrentUrl().equals("http://example.com/user/home");
    }
}