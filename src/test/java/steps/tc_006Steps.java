package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page logoutPage;

    public tc_006Steps() {
        driver = Hooks.getDriver();
        logoutPage = PageFactory.initElements(driver, tc_006Page.class);
    }

    @Given("El usuario ha iniciado sesión correctamente con credenciales válidas")
    public void el_usuario_ha_iniciado_sesion_correctamente_con_credenciales_validas() {
        logoutPage.login("usuario", "contraseña");
    }

    @When("El usuario hace clic en la opción 'Cerrar sesión'")
    public void el_usuario_hace_clic_en_la_opcion_cerrar_sesion() {
        logoutPage.clickLogout();
    }

    @Then("El sistema debe solicitar confirmación o cerrar sesión de inmediato")
    public void el_sistema_debe_solicitar_confirmacion_o_cerrar_sesion_de_inmediato() {
        logoutPage.checkLogoutPrompt();
    }

    @When("El usuario confirma el cierre de sesión si es solicitado")
    public void el_usuario_confirma_el_cierre_de_sesion_si_es_solicitado() {
        logoutPage.confirmLogout();
    }

    @Then("El usuario debe ser redirigido a la página de inicio y la sesión debe cerrarse")
    public void el_usuario_debe_ser_redirigido_a_la_pagina_de_inicio_y_la_sesion_debe_cerrarse() {
        logoutPage.verifyUserIsLoggedOut();
    }
}