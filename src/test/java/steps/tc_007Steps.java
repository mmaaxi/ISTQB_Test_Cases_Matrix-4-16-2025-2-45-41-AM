package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_007Page;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page protectedPage;

    @Given("I am a user who has not logged in")
    public void i_am_a_user_who_has_not_logged_in() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        protectedPage = new tc_007Page(driver);
    }

    @When("I try to navigate to the protected page URL")
    public void i_try_to_navigate_to_the_protected_page_url() {
        driver.get("http://example.com/protected-resource");
    }

    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() {
        assertTrue(protectedPage.isOnLoginPage());
        driver.quit();
    }
}