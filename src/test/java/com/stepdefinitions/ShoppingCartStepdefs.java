package com.stepdefinitions;

import com.steps.EnduserSteps;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ShoppingCartStepdefs implements En {
    @Steps
    EnduserSteps user;
    public ShoppingCartStepdefs() {
        And("^user confirms the address$", () -> {
            user.confirmsSummary();
            user.confirmsAddress();
        });

        And("^user confirms shipping option$", () -> {
            user.choosesShippingOption();
        });

        When("^user confirms the payment by check$", () -> {
            user.confirmsPaymentByCheck();
            user.confirmsOrder();
        });

        Then("^the order should complete$", () -> {
            user.verifiesOrderCompleted();
        });
    }
}
