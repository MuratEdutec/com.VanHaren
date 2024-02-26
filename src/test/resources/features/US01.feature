Feature: US_01 I can easily choose the sale items correctly


  Scenario: US_01 --> TC01 Go to the website and choose the sale items with the desired shoe number

    Given go to van Haren
    Then  close pop up
    Then  click Heren
    Then  click Sale Alles
    Then  click filter
    Then  click maat and select maat 42
    Then  click toepassen
    Then  click resultaten tonen
    And   terminate test


  Scenario: US_01 --> TC02 Go to the website and choose FILA in the sale items

    Given go to van Haren
    Then  close pop up
    Then  click Heren
    Then  click Sale Alles
    Then  click filter
    Then  click merk and select FILA
    Then  click resultaten tonen
    Then  click resultaten tonen_
    And   terminate test


