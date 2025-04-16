Feature: Validar inicio de sesión con credenciales inválidas

  Scenario: Intentar iniciar sesión con una contraseña incorrecta
    Given el usuario está en la página de inicio de sesión
    When ingresa un nombre de usuario válido
    And ingresa una contraseña incorrecta
    And presiona el botón "Iniciar sesión"
    Then se muestra un mensaje de error: "Credenciales incorrectas"