Feature: Pruebas para Certificarcde en Java 17

  Scenario: Login con usuario y contraseña correctos
    Given que el usuario se encuentra en la página de login
    When el usuario ingresa el usuario "admin" y la contraseña "admin"
    Then el usuario se loguea correctamente