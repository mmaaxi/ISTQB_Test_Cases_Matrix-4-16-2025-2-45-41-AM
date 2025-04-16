package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {

    private WebDriver driver;
    private By campoUsuario = By.id("usuario");
    private By campoContraseña = By.id("contraseña");
    private By botonIniciarSesion = By.id("botonIniciarSesion");
    private By mensajeError = By.id("mensajeError");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarALoginPage() {
        driver.get("https://www.ejemplo.com/login");
    }

    public void ingresarNombreUsuario(String usuario) {
        driver.findElement(campoUsuario).sendKeys(usuario);
    }

    public void ingresarContraseña(String contraseña) {
        driver.findElement(campoContraseña).sendKeys(contraseña);
    }

    public void presionarBotonIniciarSesion() {
        driver.findElement(botonIniciarSesion).click();
    }

    public String obtenerMensajeDeError() {
        return driver.findElement(mensajeError).getText();
    }
}