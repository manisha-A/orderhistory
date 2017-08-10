package com.stepdefinitions;

import com.steps.EnduserSteps;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

public class SearchResultStepdefs implements En {
    @Steps
    EnduserSteps user;

    public SearchResultStepdefs() {
        And("^user adds the first item to cart and checkout$", () -> {
            user.viewsFirstSearchResult();
            user.proceedsToCheckout();
        });
    }
}
