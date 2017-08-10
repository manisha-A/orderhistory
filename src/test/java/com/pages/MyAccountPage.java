package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends PageObject{

    public void viewPersonalInformation() {
        WebElement link = getDriver().findElement(By.linkText("My personal info"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", link);
        link.click();
    }
}
