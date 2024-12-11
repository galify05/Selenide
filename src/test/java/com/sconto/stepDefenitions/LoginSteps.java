package com.sconto.stepDefenitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);
    HomePage home;
    LoginPage login;


    @And("User enters valid data")
    public void enters_valid_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData("Cheburek@gmail.com", "Cheb123!!");
    }

    @And("User clicks on Anmelden button")
    public void clicks_on_Anmelden() {
        login.clickOnAnmelden();
    }

    /// /////////////////////////////////////////////////////////////
    @And("User enters wrong Login and valid password")
    public void enters_wrong_Login(DataTable table) {
        login = Selenide.page(LoginPage.class);
        login.enterWrongEmail(table);
    }

    @Then("User verifies his wrong email")
    public void verifies_message() {
        login.verifyMessage("Benutzername nicht gefunden oder Passwort falsch.", "Bitte geben Sie eine gültige E-Mail-Adresse ein");

/// /////////////////////////////////////////////////////////////
//    @And("User clicks on User icon")
//    public void click_on_User_icon() {
//        home = Selenide.page(HomePage.class);
//        home.clicOnUserIcon;
//    }
//
//    @Then("User verifies his name")
//    public void verifies_User_name() {
//        login.verifyName("Cheburek Juciy");
//   // }
    }
}
