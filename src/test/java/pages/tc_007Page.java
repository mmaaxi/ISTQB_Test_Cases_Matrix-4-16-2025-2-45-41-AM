package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;
    By loginForm = By.id("login-form");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOnLoginPage() {
        return driver.findElement(loginForm).isDisplayed();
    }
}