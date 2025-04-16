Feature: Validar recuperación de contraseña con email no registrado

  Scenario: Intentar recuperar contraseña con email no registrado
    Given El usuario está en la página de login
    When El usuario hace clic en 'Olvidé mi contraseña'
    Then El sistema debería redirigir a la página de recuperación de contraseña
    When El usuario ingresa un email no registrado
    Then El campo de email debería aceptar la entrada
    When El usuario presiona el botón 'Enviar'
    Then Se debería mostrar un mensaje 'Email no encontrado'