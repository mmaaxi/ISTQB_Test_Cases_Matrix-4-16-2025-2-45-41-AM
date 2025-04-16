Feature: Validar límites de intentos de inicio de sesión

  Scenario: Intentos fallidos de inicio de sesión bloquean la cuenta temporalmente
    Given el usuario navega a la página de inicio de sesión
    When el usuario intenta iniciar sesión con credenciales incorrectas tres veces
    Then un mensaje de error debe ser mostrado por cada intento
    When el usuario intenta iniciar sesión una cuarta vez
    Then el sistema bloquea temporalmente la cuenta y muestra "Cuenta bloqueada temporalmente"