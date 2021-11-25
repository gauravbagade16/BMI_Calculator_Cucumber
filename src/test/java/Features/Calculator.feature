# new feature
# Tags: optional


Feature: BMI Calculator operations





    Scenario: verify bmi operation
        Given I am on BMI_Calculator page
        When I enter <age> in calculator
        And I select <gender> in calculator
        And I enter <Height>
        And I Press <Calculate> in calculator
        Then I see the result is <Expected_result>
