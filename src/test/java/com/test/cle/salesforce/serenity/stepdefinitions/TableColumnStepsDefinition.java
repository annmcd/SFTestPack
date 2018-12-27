package com.test.cle.salesforce.serenity.stepdefinitions;

import com.test.cle.salesforce.serenity.steps.TableEvaluationSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TableColumnStepsDefinition {


    @Steps
    TableEvaluationSteps tableEvaluationSteps;
    String column;

    @Given("^I have a valid connections to \"(.*?)\" and \"(.*?)\"$")
    public void i_have_a_valid_connections_to_and(String warehouse, String staging) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tableEvaluationSteps.getDatabaseConnections( warehouse, staging);

    }

    @When("^I get all values for column \"(.*?)\" in table \"(.*?)\" in both$")
    public void i_get_all_values_for_column_in_table_in_both(String colName, String table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tableEvaluationSteps.queryTables(colName, table);
        column=colName;
    }

    @Then("^they should both be equal$")
    public void they_should_both_be_equal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tableEvaluationSteps.compareColumnResults(column);
        tableEvaluationSteps.verifyColumnResult(column);
    }

    @When("^I get all results for table \"(.*?)\" in each$")
    public void i_get_all_results_for_table_in_each(String table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tableEvaluationSteps.compareTableRowCount(table);

    }

    @Then("^The total cout should both be equal$")
    public void the_total_cout_should_both_be_equal() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tableEvaluationSteps.verifyRowCountResult();

    }


}
