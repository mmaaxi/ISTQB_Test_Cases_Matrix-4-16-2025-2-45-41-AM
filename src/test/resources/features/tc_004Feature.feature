Feature: Validar recuperación de contraseña con email registrado

  Scenario: Usuario intenta recuperar contraseña con un email registrado
    Given que el usuario está en la página de login
    When el usuario hace clic en "Olvidé mi contraseña"
    Then el sistema redirige a la página de recuperación de contraseña
    When el usuario ingresa un email registrado "usuario@ejemplo.com"
    Then el campo de email acepta la entrada
    When el usuario presiona el botón "Enviar"
    Then se muestra un mensaje "Email de recuperación enviado"