Feature: Validar mensaje de error al dejar campos vacíos

  Scenario: Mostrar mensaje de error al dejar los campos vacíos en el login
    Given el usuario navega a la página de login
    When el usuario deja los campos de usuario y contraseña vacíos
    And presiona el botón 'Iniciar sesión'
    Then se muestra un mensaje de 'Campos obligatorios' en ambos campos