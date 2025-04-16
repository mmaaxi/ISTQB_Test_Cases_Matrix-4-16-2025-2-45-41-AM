Feature: Validar inicio de sesión con credenciales válidas

  Scenario: Usuario inicia sesión con éxito
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa un nombre de usuario válido
    And el usuario ingresa una contraseña válida
    And el usuario presiona el botón 'Iniciar sesión'
    Then el usuario debería ser redirigido a la página principal de usuario