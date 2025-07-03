Feature: TutorialPointTable

  Scenario: Overenie dat tabulky
    Given Uzivate sa nachadza na stranke "https://www.tutorialspoint.com/selenium/practice/webtables.php"
    Then meno na druhom riadku tabulky bude "Alden"
    And priezvisko na druhom riadku tabulky bude "Cantrell"

