#Proyecto de pruebas y cargado en Github
#27/01/2020
#Jhonatan Medina Blanco
Feature: Registro en la pagina OrangeHrm

  Scenario Outline: scenario description
    Given abrir el navegador
    When fill out user <user> password <password>

    Examples:
      | user  | password |
      | Admin | admin123 |
