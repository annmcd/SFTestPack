package com.test.cle.salesforce.serenity.runtests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


//Run all features which have step definitions under serentity.stepdefinitions.
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" },
        glue = { "com.test.cle.salesforce.serenity.stepdefinitions" })
public class AcceptanceTests {
}
