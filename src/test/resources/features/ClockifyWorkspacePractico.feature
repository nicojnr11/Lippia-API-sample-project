Feature: Practico
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados


  Scenario Outline: 4-1 - Consulta Project resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<workspace>'
    And se obtuvo el status code <status>
    Then el project con el nombre '<nombre>' se encuentra en la lista
    @PracticaN4
    Examples:
      | operation | entity  | jsonName   | status | nombre          | workspace                   |
      | GET       | PROJECT | project/rq | 200    | Project Example | id:628ceff638bc332cb91e6582 |


  Scenario Outline: 4-2 No autorizado (Status Code 401)
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<keyErronea>'
    And se obtuvo el status code <status>
    @PracticaN4
    Examples:
      | operation | entity  | jsonName       | status | keyErronea                                                         |
      | GET       | PROJECT | project/rq_401 | 401    | keyError:ZWFhNDM1NzgtOTAxYy00NWE2LThjZDgtMmEzZjBiNmUxYzk4dasdadasd |


  Scenario Outline: 4-3 Proyecto no encontrado (Status code 404)
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    @PracticaN4
    Examples:
      | operation | entity  | jsonName       | status |
      | GET       | PROJECT | project/rq_404 | 404    |


  Scenario Outline: 5.1. Consultar un proyecto por su identificador.
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<projectid>'
    And se obtuvo el status code <status>
    @PracticaN4
    Examples:
      | operation | entity      | jsonName               | status | projectid                   |
      | GET       | PROJECTBYID | project/rq_projectbyid | 200    | id:628cf77a95bd22481946fccb |

  Scenario Outline: 5.2 Editar el valor de algún campo del proyecto y validar el cambio realizado
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<projectParams>'
    And se obtuvo el status code <status>
    And se valida el cambio de nombre 'Project_Example_Academy_Update' en el project
    And I perform a 'GET' to 'PROJECT' endpoint with the 'project/rq' and 'id:628ceff638bc332cb91e6582'
    And se obtuvo el status code 200
    And el project con el nombre '<nombre>' se encuentra en la lista
    #Se vuelve los valores por defecto
    And I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and 'id:628cf77a95bd22481946fccb,nameUpdate:Project Example'
    Then se obtuvo el status code <status>
    @PracticaN4
    Examples:
      | operation | entity            | jsonName                     | status | projectParams                                                         | nombre                         |
      | PUT       | UPDATEPROJECTBYID | project/rq_updateprojectbyid | 200    | id:628cf77a95bd22481946fccb,nameUpdate:Project_Example_Academy_Update | Project_Example_Academy_Update |
