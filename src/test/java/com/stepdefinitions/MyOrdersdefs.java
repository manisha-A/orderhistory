package com.stepdefinitions;

import com.steps.EnduserSteps;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

public class MyOrdersdefs implements En {
    @Steps
    EnduserSteps user;

    public MyOrdersdefs() {
        And("^order reference should exist in My Orders$", () -> {
            user.goToOrders();
            user.verifyOrderIsPlaced();
        });
    }
}
