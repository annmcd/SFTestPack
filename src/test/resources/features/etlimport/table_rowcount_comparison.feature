@ETL:Import
Feature:Compare Table Row Count for a given table name in the staging and warehouse databases
   Scenario Outline:Compare Table Row Count values
   Given I have a valid connections to "warehouse" and "staging"
    When I get all results for table "tableA" in each
    And I get all results for table "tableA" in each
    Then The total cout should both be equal

 Examples:
     | warehouse | staging | TableName |
     | warehouseURL | stagingURL | Account |
     | warehouseURL | stagingURL | Transaction |
     | warehouseURL | stagingURL | User |