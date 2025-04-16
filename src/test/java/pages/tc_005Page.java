package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    WebDriver driver;

    // Locators
    By forgotPasswordLink = By.linkText("Olvidé mi contraseña");
    By emailField = By.id("email");
    By submitButton = By.id("submit");
    By emailNotFoundMessage = By.id("email-not-found-message");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isRecoveryPage() {
        // Código para verificar que el usuario está en la página de recuperación de contraseña
        return driver.getCurrentUrl().contains("recovery");
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public boolean isEmailFieldAcceptingInput() {
        // Código para verificar que el campo de email acepta la entrada
        return !driver.findElement(emailField).getAttribute("value").isEmpty();
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public boolean isEmailNotFoundMessageDisplayed() {
        return driver.findElement(emailNotFoundMessage).isDisplayed();
    }
}