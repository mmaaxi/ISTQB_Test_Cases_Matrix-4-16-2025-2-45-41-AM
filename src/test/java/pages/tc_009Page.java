package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;
    By loginButton = By.id("loginButton");
    By accountSettingsLink = By.id("accountSettingsLink");
    By currentPasswordInput = By.id("currentPassword");
    By newPasswordInput = By.id("newPassword");
    By saveChangesButton = By.id("saveChanges");
    By successMessage = By.id("successMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithValidCredentials() {
        // Implementation to login
    }

    public boolean isLoggedIn() {
        // Verify user is logged in successfully
        return driver.findElement(loginButton).isDisplayed();
    }

    public void navigateToAccountSettings() {
        driver.findElement(accountSettingsLink).click();
    }

    public boolean isInAccountSettings() {
        // Verify user is in account settings page
        return driver.getCurrentUrl().contains("account-settings");
    }

    public void enterCurrentPassword() {
        driver.findElement(currentPasswordInput).sendKeys("currentPassword");
    }

    public void enterNewPassword() {
        driver.findElement(newPasswordInput).sendKeys("newPassword");
    }

    public boolean arePasswordsEntered() {
        return !driver.findElement(currentPasswordInput).getAttribute("value").isEmpty() &&
               !driver.findElement(newPasswordInput).getAttribute("value").isEmpty();
    }

    public void pressSaveChangesButton() {
        driver.findElement(saveChangesButton).click();
    }

    public boolean isPasswordUpdatedMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}