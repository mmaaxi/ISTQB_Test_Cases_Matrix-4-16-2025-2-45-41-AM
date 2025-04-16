package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page recoverPasswordPage;

    @Given("^El usuario está en la página de login$")
    public void navigateToLoginPage() {
        // código para navegar a la página de login
        driver.get("http://website.com/login");
    }

    @When("^El usuario hace clic en 'Olvidé mi contraseña'$")
    public void clickForgotPassword() {
        recoverPasswordPage = new tc_005Page(driver);
        recoverPasswordPage.clickForgotPasswordLink();
    }

    @Then("^El sistema debería redirigir a la página de recuperación de contraseña$")
    public void verifyPasswordRecoveryPage() {
        Assert.assertTrue(recoverPasswordPage.isRecoveryPage());
    }

    @When("^El usuario ingresa un email no registrado$")
    public void enterUnregisteredEmail() {
        recoverPasswordPage.enterEmail("nonregistered@example.com");
    }

    @Then("^El campo de email debería aceptar la entrada$")
    public void emailFieldShouldAcceptInput() {
        Assert.assertTrue(recoverPasswordPage.isEmailFieldAcceptingInput());
    }

    @When("^El usuario presiona el botón 'Enviar'$")
    public void clickSubmitButton() {
        recoverPasswordPage.clickSubmitButton();
    }

    @Then("^Se debería mostrar un mensaje 'Email no encontrado'$")
    public void verifyEmailNotFoundMessage() {
        Assert.assertTrue(recoverPasswordPage.isEmailNotFoundMessageDisplayed());
    }
}