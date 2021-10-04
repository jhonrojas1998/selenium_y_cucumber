#jhonrojas
@stories
Feature: Registrar datos del asprirante jhon hader
  Como aspirante a las vacante de empleo necesito un formulario para poder registrar mis datos
  Scenario: Verificar el formulario de registro
    Given que quiero registrarme en el sistema
    When ingrese los datos del formulario y haga clic en enviar
    Then debeo poder visualizar una modal que diga usuario registrado con exito