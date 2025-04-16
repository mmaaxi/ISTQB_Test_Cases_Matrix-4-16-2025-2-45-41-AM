package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {
    WebDriver driver;

    By forgotPasswordLink = By.linkText("Olvidé mi contraseña");
    By emailField = By.id("email");
    By sendButton = By.id("send_button");
    By confirmationMessage = By.id("confirmation_message");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public boolean isEmailFieldNotEmpty() {
        return !driver.findElement(emailField).getAttribute("value").isEmpty();
    }

    public void clickSendButton() {
        driver.findElement(sendButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}