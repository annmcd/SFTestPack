
@ETL:Import

Feature:Compare Table Column value entries between Staging and Warehouse for a given column name in a table

  Scenario Outline: Table Compare Column values
    Given I have a valid connections to "warehouse" and "staging"
    When I get all values for column "columnA" in table "tableA" in both
      Then they should both be equal

 Examples:
     | warehouse | staging | columnA | tableA |
     | warehouseURL | stagingURL | AccountName | Account |
     | warehouseURL | stagingURL | AccountOwner | Account |
     | warehouseURL | stagingURL | Amount | Transaction |
     | warehouseURL | stagingURL | UserName | User |
