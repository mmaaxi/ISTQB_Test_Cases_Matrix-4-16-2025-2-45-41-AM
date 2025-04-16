package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By errorMessage = By.id("errorMessage");
    By accountLockMessage = By.id("accountLockMessage");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://www.example.com/login");
    }

    public void loginWithInvalidCredentials() {
        driver.findElement(usernameField).sendKeys("invalid_user");
        driver.findElement(passwordField).sendKeys("incorrect_password");
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    public String getAccountLockMessage() {
        return driver.findElement(accountLockMessage).getText();
    }
}