package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {

    private WebDriver driver;
    private tc_002Page loginPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        loginPage = new tc_002Page(driver);
    }

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        loginPage.navegarALoginPage();
    }

    @When("ingresa un nombre de usuario válido")
    public void ingresa_un_nombre_de_usuario_válido() {
        loginPage.ingresarNombreUsuario("usuarioValido");
    }

    @When("ingresa una contraseña incorrecta")
    public void ingresa_una_contraseña_incorrecta() {
        loginPage.ingresarContraseña("contraseñaIncorrecta");
    }

    @When("presiona el botón {string}")
    public void presiona_el_botón(String string) {
        loginPage.presionarBotonIniciarSesion();
    }

    @Then("se muestra un mensaje de error: {string}")
    public void se_muestra_un_mensaje_de_error(String mensajeEsperado) {
        String mensajeActual = loginPage.obtenerMensajeDeError();
        Assert.assertEquals(mensajeEsperado, mensajeActual);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}