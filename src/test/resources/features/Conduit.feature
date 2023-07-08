Feature: Loguearse a Conduit

  Scenario: Iniciar Sesion con credenciales
    Given El usuario se encuentra en la pagina Home de Conduit
    When Hace click sobre Sign In
    Then Debe de ingresar sus credenciales
    And Hace click en el boton Sign In
    And nos redireccionara al Global Feed

  Scenario: Crear un usuario
    Given El usuario se encuentra en la pagina
