Feature:List

  Scenario Outline: get from feature a list
    When the get <"dataTable">
    Examples:
      | dataTable |
      | Salamanca |
      | Madrid    |
      | Sevilla   |
      | Barcelona |
      | Maalaga   |

  Scenario: get from feature a list
    When the gets <dataTable>

      | Salamanca |
      | Madrid    |
      | Sevilla   |
      | Barcelona |
      | Maalaga   |