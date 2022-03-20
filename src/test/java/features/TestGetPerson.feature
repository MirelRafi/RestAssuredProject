Feature:
  Verify different GET operations using REST Assured


  Scenario: Verify persons list retrieved in response
    Given I perform GET operation for persons list
    When I perform GET for all persons
    Then I should see the first name as "List"
