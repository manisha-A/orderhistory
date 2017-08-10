package com.stepdefinitions;

import com.steps.EnduserSteps;
import cucumber.api.DataTable;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class MyAccountStepdefs implements En {

    @Steps
    EnduserSteps user;

    public MyAccountStepdefs() {

        When("^the user views her personal information$", () -> {
            user.viewsPersonalInformation();
        });

        And("^user updates below information:$", (DataTable updateData) -> {
            Map<String,String> infoToBeUpdtaed = updateData.asMap(String.class,String.class);
            user.updatesInformation(infoToBeUpdtaed);
            user.savesInformation();
            user.isSuccessMessageReceived();
        });

        Then("^user's first name is updated as \"([^\"]*)\"$", (String updatedName) -> {
            user.verifyNameIsUpdated(updatedName);
        });
    }
}
