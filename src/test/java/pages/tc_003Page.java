package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    private By userField = By.id("userName");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");
    private By errorMessage = By.id("errorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("https://example.com/login");
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean areFieldsEmpty() {
        return driver.findElement(userField).getText().isEmpty() && 
               driver.findElement(passwordField).getText().isEmpty();
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isEmptyFieldsErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed() && 
               driver.findElement(errorMessage).getText().contains("Campos obligatorios");
    }
}