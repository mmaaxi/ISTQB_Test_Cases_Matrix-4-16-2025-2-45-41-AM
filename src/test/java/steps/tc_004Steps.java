package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.cucumber.java.en.*;

import pages.tc_004Page;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page passwordRecoveryPage;
    WebDriverWait wait;

    @Given("que el usuario está en la página de login")
    public void usuarioEstaEnPaginaDeLogin() {
        passwordRecoveryPage = new tc_004Page(driver);
        driver.get("http://example.com/login");
    }

    @When("el usuario hace clic en {string}")
    public void usuarioHaceClicEnOlvideMiContrasena(String linkText) {
        passwordRecoveryPage.clickForgotPassword();
    }

    @Then("el sistema redirige a la página de recuperación de contraseña")
    public void redirigeAPaginaDeRecuperacion() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertEquals("http://example.com/password-recovery", driver.getCurrentUrl());
    }

    @When("el usuario ingresa un email registrado {string}")
    public void usuarioIngresaEmailRegistrado(String email) {
        passwordRecoveryPage.enterEmail(email);
    }

    @Then("el campo de email acepta la entrada")
    public void campoDeEmailAceptaEntrada() {
        Assert.assertTrue(passwordRecoveryPage.isEmailFieldNotEmpty());
    }

    @When("el usuario presiona el botón {string}")
    public void usuarioPresionaBotonEnviar(String button) {
        passwordRecoveryPage.clickSendButton();
    }

    @Then("se muestra un mensaje {string}")
    public void seMuestraMensaje(String expectedMessage) {
        Assert.assertEquals(expectedMessage, passwordRecoveryPage.getConfirmationMessage());
    }
}