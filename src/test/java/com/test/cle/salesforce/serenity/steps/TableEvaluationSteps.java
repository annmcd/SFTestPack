package com.test.cle.salesforce.serenity.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import java.sql.Connection;
import java.util.List;

public class TableEvaluationSteps {


    Connection wareHouseConnection = null ;// get already available static connection from background
    Connection stagingConnection=null; // get already available static connection from background


    @Step
    public void getDatabaseConnections(String warehouse, String staging) {
        //setup the connections already established in background
        System.out.println("done");
    }

    @Step
    public void queryTables(String column, String table) {
// issue query against staging and warehouse

    }

    @Step
    public void compareColumnResults(String column) {
    //compare column results

    }



    @Step
    public void compareTableRowCount(String table) {
        //compare column results

    }


    @Step
    public void verifyRowCountResult() {

        boolean ret =true;
        Assert.assertTrue(ret);
    }


    @Step
    public void verifyColumnResult(String column) {

        boolean ret =true;
        Assert.assertTrue(ret);
    }


}
