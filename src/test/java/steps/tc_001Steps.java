package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import pages.tc_001Page;
import static org.junit.Assert.*;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page loginPage;

    public tc_001Steps() {
        this.driver = Hooks.driver;
        loginPage = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        loginPage.navigateToLoginPage();
        assertTrue(loginPage.isLoginPageDisplayed());
    }

    @When("el usuario ingresa un nombre de usuario válido")
    public void el_usuario_ingresa_un_nombre_de_usuario_válido() {
        loginPage.enterUsername("usuarioValido");
        assertTrue(loginPage.isUsernameAccepted());
    }

    @And("el usuario ingresa una contraseña válida")
    public void el_usuario_ingresa_una_contraseña_válida() {
        loginPage.enterPassword("contraseñaValida");
        assertTrue(loginPage.isPasswordAccepted());
    }

    @And("el usuario presiona el botón 'Iniciar sesión'")
    public void el_usuario_presiona_el_botón_iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("el usuario debería ser redirigido a la página principal de usuario")
    public void el_usuario_debería_ser_redirigido_a_la_página_principal_de_usuario() {
        assertTrue(loginPage.isUserHomePageDisplayed());
    }
}