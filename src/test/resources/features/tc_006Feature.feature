Feature: Validar cierre de sesión

  Scenario: El usuario puede cerrar su sesión exitosamente
    Given El usuario ha iniciado sesión correctamente con credenciales válidas
    When El usuario hace clic en la opción 'Cerrar sesión'
    Then El sistema debe solicitar confirmación o cerrar sesión de inmediato
    When El usuario confirma el cierre de sesión si es solicitado
    Then El usuario debe ser redirigido a la página de inicio y la sesión debe cerrarse