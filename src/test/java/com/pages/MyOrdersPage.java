package com.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.yecht.Data;

import java.util.List;

public class MyOrdersPage extends PageObject {
    @FindBy(id = "order-list")
    private WebElementFacade orders;

    private String getOrderReference(){
        WebElement firstItem = orders.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).get(0);
        return firstItem.findElement(By.className("history_link")).getText();

    }

    public void assertOrderExists() {
        String orderInformation = (String) Serenity.getCurrentSession().get("orderinfo");
        assert orderInformation.contains(getOrderReference());
    }
}
