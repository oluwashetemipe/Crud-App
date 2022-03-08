Feature: Crud App
  Background:
    * url 'http://localhost:8080/api'
    * header Accept = 'application/json'

  Scenario: Post
    #no slash
   Given path 'staff'
    And request {"dateOfBirth": "5th May 2005","gender": "female","name": "Damilare","phoneNumber": "0906677777"}
    When method Post
    Then status 201
  Scenario: Get
    Given path 'staff', 6
    When method Get
    Then status 200
    And match response == {"id": 6,"name": "Damilare","phoneNumber": "0906677777","gender": "male","dateOfBirth": "5th May 2004"}
    And print response

  Scenario: Get all staff
    Given path 'staff'
    When method Get
    Then status 200
    And print response

  Scenario: Update staff details
    Given path 'staff', 6
    And request {"name": "Damilare","phoneNumber": "0906677777","gender": "female","dateOfBirth": "5th May 2005"}
    When method Put
    Then status 200
    And print response
    And print responseStatus

  Scenario: Delete
    Given path 'staff, 8
    When method Delete
    Then status 204
    And print response



