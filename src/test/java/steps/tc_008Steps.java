package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import static org.junit.Assert.assertEquals;

public class tc_008Steps {

    WebDriver driver = new ChromeDriver();
    tc_008Page loginPage = new tc_008Page(driver);

    @Given("el usuario navega a la página de inicio de sesión")
    public void usuario_navega_a_la_pagina_de_inicio_de_sesion() {
        loginPage.navigateToLoginPage();
    }

    @When("el usuario intenta iniciar sesión con credenciales incorrectas tres veces")
    public void usuario_intenta_iniciar_sesion_con_credenciales_incorrectas_tres_veces() {
        for(int i = 0; i < 3; i++) {
            loginPage.loginWithInvalidCredentials();
            assertEquals("Mensaje de error no coincide.", "Credenciales incorrectas.", loginPage.getErrorMessage());
        }
    }

    @Then("un mensaje de error debe ser mostrado por cada intento")
    public void mensaje_de_error_por_cada_intento() {
        // La validación ya se realizó dentro del lazo de intentos.
    }

    @When("el usuario intenta iniciar sesión una cuarta vez")
    public void usuario_intenta_iniciar_sesion_una_cuarta_vez() {
        loginPage.loginWithInvalidCredentials();
    }

    @Then("el sistema bloquea temporalmente la cuenta y muestra {string}")
    public void el_sistema_bloquea_temporalmente_la_cuenta_y_muestra(String expectedMessage) {
        assertEquals("Mensaje de bloqueo temporal no coincide.", expectedMessage, loginPage.getAccountLockMessage());
        driver.quit();
    }
}