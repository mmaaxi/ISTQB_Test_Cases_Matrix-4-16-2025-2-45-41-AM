Feature: Perfil de Usuario
  Como usuario
  Quiero actualizar mi perfil
  Para asegurar que mi información esté actualizada

  Scenario: Validar actualización de perfil de usuario
    Given que el usuario ha iniciado sesión y navega a la sección de perfil
    When el usuario modifica sus datos personales en el formulario de perfil
    And hace clic en el botón 'Guardar'
    Then se muestra un mensaje 'Perfil actualizado' y los cambios se reflejan