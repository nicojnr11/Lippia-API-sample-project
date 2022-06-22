Feature: Trabajo Final Api Practico
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados

  @TrabajoFinalApi
  Scenario Outline: Consultar las horas registradas.
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<parameters>'
    And se obtuvo el status code <status>
    Then se valida la descripcion '<descripcion>' en el get time entry

    Examples:
      | operation | entity         | jsonName                  | status | descripcion     | parameters                                                           |
      | GET       | GET_TIME_ENTRY | timeEntry/rq_getTimeEntry | 200    | TrabajoFinalAPI | workspaceId:62b228bf10ada949843cc79b,userId:628ceff538bc332cb91e6576 |

  @TrabajoFinalApi
  Scenario Outline: Agregar horas a un proyecto.
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<parameters>'
    And se obtuvo el status code <status>
    Then se valida la descripcion '<description>' en el add time entry

    Examples:
      | operation | entity         | jsonName                  | status | description        | parameters                                                                                                |
      | POST      | ADD_TIME_ENTRY | timeEntry/rq_addTimeEntry | 201    | TrabajoFinalApiAdd | workspaceId:62b228bf10ada949843cc79b,descriptionAdd:TrabajoFinalApiAdd,projectId:62b228f304cf142e40f9a74d |

  @TrabajoFinalApi
  Scenario Outline: Editar un campo de algún registro de hora.
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When obtengo el time entry id y paso los parametros projectId <projectId> workspaceId <workspaceId> description <description>
    And I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se valida la descripcion '<UpdateDescription>' en el update time entry

    Examples:
      | operation | entity            | jsonName                     | status | workspaceId              | description        | projectId                | UpdateDescription        |
      | PUT       | UPDATE_TIME_ENTRY | timeEntry/rq_updateTimeEntry | 200    | 62b228bf10ada949843cc79b | TrabajoFinalApiAdd | 62b228f304cf142e40f9a74d | TrabajoFinalApiAddUpdate |

  @TrabajoFinalApi
  Scenario Outline: Eliminar hora registrada.
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When obtengo el time entry id y paso los parametros workspaceId <workspaceId>
    And I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then no se obtuvo ningun response

    Examples:
      | operation | entity            | jsonName                     | status | workspaceId              |
      | DELETE    | DELETE_TIME_ENTRY | timeEntry/rq_deleteTimeEntry | 204    | 62b228bf10ada949843cc79b |


