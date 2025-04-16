package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_009Page;
import io.cucumber.java.en.*;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    public tc_009Steps() {
        this.driver = Hooks.getDriver();
        page = new tc_009Page(driver);
    }

    @Given("I am logged in with valid credentials")
    public void iAmLoggedInWithValidCredentials() {
        page.loginWithValidCredentials();
        Assert.assertTrue(page.isLoggedIn());
    }

    @When("I navigate to the 'Account Settings' section")
    public void iNavigateToTheAccountSettingsSection() {
        page.navigateToAccountSettings();
        Assert.assertTrue(page.isInAccountSettings());
    }

    @When("I enter the current password and a new password")
    public void iEnterTheCurrentPasswordAndANewPassword() {
        page.enterCurrentPassword();
        page.enterNewPassword();
        Assert.assertTrue(page.arePasswordsEntered());
    }

    @When("I press the 'Save Changes' button")
    public void iPressTheSaveChangesButton() {
        page.pressSaveChangesButton();
    }

    @Then("I should see a message 'Password updated successfully'")
    public void iShouldSeeAMessagePasswordUpdatedSuccessfully() {
        Assert.assertTrue(page.isPasswordUpdatedMessageDisplayed());
    }
}