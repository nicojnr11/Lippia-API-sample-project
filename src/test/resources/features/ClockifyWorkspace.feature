Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados

  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |

  Scenario Outline: Consulta Workspace resultado erroneo
    Given X-Api-Key invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    @Workspace
    Examples:
      | operation | entity | jsonName     | status |
      | GET       | ERROR  | workspace/rq | 401    |

  @prueba
  Scenario Outline: Consulta Project resultado exitoso
    When I perform a 'PUT' to '<entity>' endpoint with the 'project/rq_put' and ''
    And se obtuvo el status code <status>
    Then se valida el cambio de nombre 'Academy' en el project
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida la cantidad de projects
    Then el project con el nombre '<nombre>' se encuentra en la lista
    @Workspace
    Examples:
      | operation | entity  | jsonName   | status | nombre   |
      | GET       | PROJECT | project/rq | 200    | Academy  |
      #| GET       | PROJECT | project/rq | 200    | Crowdar  |


  Scenario Outline: Consulta Project resultado: Status 401
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <response>
    @Workspace
    Examples:
      | operation | entity | jsonName       | status | response       |
      | GET       | ERROR  | project/rq_401 | 401    | project/rs_401 |