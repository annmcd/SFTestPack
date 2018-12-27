
@BulkData:DataUpload

Feature:UploadRecovery

Scenario Outline:Recover Failed CSV Rows to Database
    Given I have a valid connection  to a "salesforceOrg"
    And I have a connection to the "StagingDB"
    When I trigger a csv upload which has "x" rows of invalid data
    Then the "x" failed rows of csv data should be inserted into the stagingDB

 Examples:
     | salesforceOrg | stagingDB | x |
     | https://test.salesforce.com | WINST10084 | 3 |

