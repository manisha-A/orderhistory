package com.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationPage extends PageObject{
    final static Logger logger = LoggerFactory.getLogger(AuthenticationPage.class);

    @FindBy(id = "email")
    private WebElementFacade email;

    @FindBy(id = "passwd")
    private WebElementFacade password;

    @FindBy(id = "SubmitLogin")
    private WebElementFacade signInButton;

    public void signin(String username) {
        switch (username){
            case "cucumberjvm":
                email.sendKeys("cucumberjvm@gmail.com");
                password.sendKeys("Framework1!");
                signInButton.click();
                logger.info("Logged in user is : " + username);
                Serenity.getCurrentSession().put("currentpassw","Framework1!");
                break;
        }

    }
}
