# new feature
# Tags: optional

@web

Feature: BMI Calculator operations

#    Background: Login to BMI_Calculator
#        Given I am on BMI_calculator page

    Scenario: verify bmi operation
       Given I am on BMI_Calculator page
        When I enter <age> in calculator
        And I select <gender> in calculator
        And I enter <HeightAndWeight>
        And I Press <Calculate> in calculator
        Then I see the result is <Expected_result>
