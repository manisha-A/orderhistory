package com.stepdefinitions;

import com.steps.EnduserSteps;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

public class HomeStepdefs implements En {

    @Steps
    EnduserSteps user;

    public HomeStepdefs() {
        And("^user is on home page$", () -> {
            user.navigateToAppHome();
        });

        When("^user wants to buy \"([^\"]*)\"$", (String searchTerm) -> {
            user.searchsFor(searchTerm);
        });
    }
}
