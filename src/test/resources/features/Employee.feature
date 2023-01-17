#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: registro de un nuevo usuario

  @AddUser
  Scenario Outline: usuario nuevo agregado en base datos
    Given abrir el navegador
    And fill out user <user> password <password>
    And the user acesses to the add employee
    When the user fill out <name> last name <lastName> middle <middle>

    Examples:
      | user  | password | name     | lastName | middle |
      | Admin | admin123 | jhonatan | medina   | tatan  |