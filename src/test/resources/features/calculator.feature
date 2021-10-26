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
#
#  Scenario: reverse number
#    Given An input value -56 and operator rvs
#    When I reverse the value
#    Then I expect the result -0.0178571428571
#
#  Scenario Outline: reverse number
#    Given An input value <value> and operator <op>
#    When I reverse the value
#    Then I expect the result <result>
#    Examples:
#    |value|op|result|
#    |1    |rvs|1    |
#    |-10  |rvs|-0.1 |
#    |0    |rvs|Double.NaN|
#    |5    |rvs|0.2       |
#

