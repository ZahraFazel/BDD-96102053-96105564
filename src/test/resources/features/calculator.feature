@tag
Feature: Calculator
  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
    Examples:
      | first | second | result |
      | 1 | 12 | 13 |
      | -1 | 6 | 5 |
      | 2 | 2 | 4 |

  Scenario: reverse number
    Given An input value -56 and operator rvs
    When I reverse the value
    Then I expect the result -0.0178571428

  Scenario Outline: reverse number
    Given An input value <value> and operator <op>
    When I reverse the value
    Then I expect the result <result>
    Examples:
    |value|op|result|
    |1    |rvs|1.0  |
    |-10  |rvs|-0.1 |
    |0    |rvs|0.0  |
    |2    |rvs|0.5  |
    |225  |rvs|0.0044444444|

  Scenario: square root number
    Given An input value -37 and operator sqrt
    When I square root the value
    Then I expect the result -1.0

  Scenario Outline: square root number
    Given An input value <value> and operator <op>
    When I square root the value
    Then I expect the result <result>
    Examples:
      |value|op|result|
      |1    |sqrt|1.0  |
      |-4  |sqrt|-1.0 |
      |0    |sqrt|0.0  |
      |169    |sqrt|13.0  |
      |52  |sqrt|7.2111025509|


