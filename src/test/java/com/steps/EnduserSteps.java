package com.steps;

import com.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.Map;

public class EnduserSteps extends ScenarioSteps {

    MyAccountPage myaccountpage;
    PersonalInformationPage personalinfopage;
    HomePage homepage;
    AuthenticationPage authpage;
    SearchResultsPage searchresultspage;
    ItemDetail itemdetailpage;
    ShoppingCartPage shoppingcartpage;
    PaymentPage paymentpage;
    MyOrdersPage myorderspage;

    @Step
    public void viewsPersonalInformation() {
        myaccountpage.viewPersonalInformation();
    }

    @Step
    public void savesInformation() {
        personalinfopage.saveInfo();
    }

    @Step
    public void verifyNameIsUpdated(String updatedName) {
        homepage.verifyNameIsUpdated(updatedName);
    }

    @Step
    public void navigateToAppHome() {
        homepage.goToHome();
    }

    @Step
    public void goToAuthentication() {
        homepage.goToAuthentication();
    }

    @Step
    public void signIn(String username) {
        authpage.signin(username);
    }

    @Step
    public void updatesInformation(Map<String, String> infoToBeUpdtaed) {
        personalinfopage.updatesData(infoToBeUpdtaed);
        personalinfopage.entersCurrentPassword();
    }

    @Step
    public void isSuccessMessageReceived() {
        personalinfopage.verifySuccessMessage();
    }

    @Step
    public void searchsFor(String searchTerm) {
        homepage.searchFor(searchTerm);
        homepage.submitSearch();
    }

    @Step
    public void viewsFirstSearchResult() {
        searchresultspage.viewFirstResult();
    }

    @Step
    public void addsItemToCart() {
        itemdetailpage.addItemToCart();
    }

    @Step
    public void proceedsToCheckout() {
        itemdetailpage.proceedToCheckout();
    }

    @Step
    public void confirmsAddress() {
        shoppingcartpage.processAddress();
    }

    @Step
    public void confirmsSummary() {
        shoppingcartpage.proceedToCheckout();
    }

    @Step
    public void choosesShippingOption() {
        shoppingcartpage.selectShippingOption();
        shoppingcartpage.processCarrier();
    }

    @Step
    public void confirmsPaymentByCheck() {
        paymentpage.payByCheck();
    }

    @Step
    public void confirmsOrder() {
        shoppingcartpage.confirmOrder();
    }

    @Step
    public void verifiesOrderCompleted() {
        shoppingcartpage.assertOrderCompleted();
        shoppingcartpage.getOrderDetails();
    }

    @Step
    public void goToOrders() {
        homepage.goToMyOrders();
    }

    @Step
    public void verifyOrderIsPlaced() {
        myorderspage.assertOrderExists();
    }
}
