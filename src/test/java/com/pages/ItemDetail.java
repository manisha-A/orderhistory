package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ItemDetail extends PageObject {

    @FindBy(id = "add_to_cart")
    private WebElementFacade addToCart;

    @FindBy(id = "layer_cart")
    private WebElementFacade confirmCart;

    public void addItemToCart() {
        addToCart.click();
    }

    public void proceedToCheckout() {
        confirmCart.then(By.linkText("Proceed to checkout")).click();
    }
}
