package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {
    @FindBy(id = "HOOK_PAYMENT")
    private WebElementFacade paymenthook;

    public void payByCheck() {
        paymenthook.then(By.className("cheque")).click();
    }
}
