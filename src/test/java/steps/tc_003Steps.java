package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_003Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc_003Steps {

    WebDriver driver;
    WebDriverWait wait;
    tc_003Page loginPage;

    @Given("^el usuario navega a la página de login$")
    public void navigateToLoginPage() {
        loginPage = new tc_003Page(driver);
        loginPage.goToLoginPage();
        Assert.assertTrue("No se muestra la página de login", loginPage.isLoginPageDisplayed());
    }

    @When("^el usuario deja los campos de usuario y contraseña vacíos$")
    public void leaveFieldsEmpty() {
        Assert.assertTrue("Los campos no están vacíos", loginPage.areFieldsEmpty());
    }

    @When("^presiona el botón 'Iniciar sesión'$")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("^se muestra un mensaje de 'Campos obligatorios' en ambos campos$")
    public void verifyEmptyFieldErrorMessage() {
        Assert.assertTrue("No se muestra mensaje de error 'Campos obligatorios'", 
                          loginPage.isEmptyFieldsErrorMessageDisplayed());
    }
}