Feature: API Test
#asdfalskjdfkla
  #asdlfkasldkfjasdf
  #alsdkjfalskdf
  Scenario: Verify get method
    When I send a "GET" request with "/Users/1" endpoint
    Then I verify the response contains following information:
      | id | email                  | first_name | last_name |
      | 1  | george.bluth@reqres.in | George     | Bluth     |
