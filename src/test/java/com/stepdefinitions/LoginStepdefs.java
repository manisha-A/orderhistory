package com.stepdefinitions;

import com.steps.EnduserSteps;
import cucumber.api.java8.En;
import net.thucydides.core.annotations.Steps;

public class LoginStepdefs implements En {
    @Steps
    EnduserSteps user;

    public LoginStepdefs() {

        Given("^the registered user \"([^\"]*)\" is logged in$", (String username) -> {
            user.navigateToAppHome();
            user.goToAuthentication();
            user.signIn(username);
        });
    }
}
