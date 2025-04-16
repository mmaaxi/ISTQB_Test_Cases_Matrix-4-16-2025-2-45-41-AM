package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc_010Page profilePage;

    @Given("^que el usuario ha iniciado sesión y navega a la sección de perfil$")
    public void navegarAPerfil() {
        profilePage = new tc_010Page(driver);
        profilePage.iniciarSesion("usuario", "contrasena");
        profilePage.navegarASeccionPerfil();
    }

    @When("^el usuario modifica sus datos personales en el formulario de perfil$")
    public void modificarDatosPersonales() {
        profilePage.modificarDatosPersonales("nuevoNombre", "nuevoApellido", "nuevoEmail@test.com");
    }

    @And("^hace clic en el botón 'Guardar'$")
    public void hacerClicEnGuardar() {
        profilePage.hacerClicEnGuardar();
    }

    @Then("^se muestra un mensaje 'Perfil actualizado' y los cambios se reflejan$")
    public void verificarActualizacionPerfil() {
        profilePage.verificarMensajeExito();
    }
}