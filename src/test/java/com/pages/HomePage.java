package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject{

    @FindBy(id = "header")
    private WebElementFacade header;

    @FindBy(id = "search_query_top")
    private WebElementFacade searchQuery;

    @FindBy(id = "searchbox")
    private WebElementFacade searchBox;

    public void goToHome() {
        getDriver().get("http://automationpractice.com/");
    }

    public void verifyNameIsUpdated(String updatedName) {
        assert header.then(By.className("header_user_info")).getText().contains(updatedName);
    }

    public void goToAuthentication() {
        header.then(By.className("header_user_info")).then(By.linkText("Sign in")).click();
    }

    public void submitSearch() {
        WebElement searchBtn = searchBox.then(By.tagName("button"));
        searchBtn.click();
    }

    public void searchFor(String searchTerm) {
        searchQuery.sendKeys(searchTerm);
    }

    public void goToMyOrders() {
        getDriver().findElement(By.linkText("My orders")).click();
    }
}
