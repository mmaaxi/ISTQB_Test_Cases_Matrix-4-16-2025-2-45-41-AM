package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    // Identificadores
    By navbarPerfil = By.id("perfilNav");
    By nombreInput = By.id("nombre");
    By apellidoInput = By.id("apellido");
    By emailInput = By.id("email");
    By guardarButton = By.id("guardar");
    By mensajeExito = By.id("mensajeExito");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion(String usuario, String contrasena) {
        // Lógica de inicio de sesión
    }

    public void navegarASeccionPerfil() {
        driver.findElement(navbarPerfil).click();
    }

    public void modificarDatosPersonales(String nombre, String apellido, String email) {
        driver.findElement(nombreInput).clear();
        driver.findElement(nombreInput).sendKeys(nombre);
        driver.findElement(apellidoInput).clear();
        driver.findElement(apellidoInput).sendKeys(apellido);
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void hacerClicEnGuardar() {
        driver.findElement(guardarButton).click();
    }

    public void verificarMensajeExito() {
        assert(driver.findElement(mensajeExito).isDisplayed());
    }
}