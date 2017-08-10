package com.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SearchResultsPage extends PageObject {
    public void viewFirstResult() {
        List<WebElement> itemList = getDriver().findElement(By.className("product_list")).findElements(By.tagName("li"));
        Actions a1 = new Actions(getDriver());
        a1.moveToElement(itemList.get(0)).moveToElement(getDriver().findElement(By.className("ajax_add_to_cart_button")))
                .click()
                .build()
                .perform();
    }

}
