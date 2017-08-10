package com.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShoppingCartPage extends BasePage {
    final static Logger logger = LoggerFactory.getLogger(ShoppingCartPage.class);
    private final String ORDER_COMPLETE = "Your order on My Store is complete";

    @FindBy(className = "cart_navigation")
    private WebElementFacade cartNavigation;

    @FindBy(id = "uniform-cgv")
    private WebElementFacade tandcCB;

    @FindBy(className = "order-confirmation")
    private WebElementFacade orderConfirmation;

    public void proceedToCheckout() {
        waitFor(ExpectedConditions.visibilityOf(cartNavigation));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", cartNavigation);
        getDriver().findElement(By.linkText("Proceed to checkout")).click();
    }

    public void selectShippingOption() {
        tandcCB.click();
    }

    public void confirmOrder() {
        getDriver().findElement(By.id("cart_navigation")).findElement(By.tagName("button")).click();
    }

    public void assertOrderCompleted() {
        assert alertSuccess.getText().contains(ORDER_COMPLETE);
    }

    public void getOrderDetails() {
        String Info = (String) Serenity.getCurrentSession().put("orderinfo",orderConfirmation.getText());
        logger.info("Order Confirmation Details :" + orderConfirmation.getText());
    }

    public void processAddress() {
        getDriver().findElement(By.name("processAddress")).click();
    }

    public void processCarrier() {
        getDriver().findElement(By.name("processCarrier")).click();
    }
}
