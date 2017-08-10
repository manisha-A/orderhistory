package com.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonalInformationPage extends BasePage {
    protected final String SUCCESS_MSG = "Your personal information has been successfully updated.";

    @FindBy(id = "firstname")
    private WebElementFacade firstName;

    @FindBy(id = "old_passwd")
    private WebElementFacade oldPassword;

    @FindBy(id = "center_column")
    private WebElementFacade accountform;

    public void saveInfo() {
        accountform.then(By.tagName("button")).click();
    }

    public void updatesData(Map<String, String> infoToBeUpdtaed) {
      Set<String> fieldSet = infoToBeUpdtaed.keySet();
      for(String field:fieldSet){
          switch (field){
              case "First name":
                  firstName.clear();
                  firstName.sendKeys(infoToBeUpdtaed.get(field));
                  break;
          }
      }
    }

    public void entersCurrentPassword() {
        String currentpassword = (String) Serenity.getCurrentSession().get("currentpassw");
        oldPassword.sendKeys(currentpassword);
    }

    public void verifySuccessMessage() {
        assert alertSuccess.getText().contains(SUCCESS_MSG);
    }
}
