package com.sconto.stepDefenitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class HomePageSteps {

    HomePage home;
    LoginPage login;

    @Given("User is on HomePage")
    public void is_on_HomePage() {
        home = open("https://www.sconto.de/", HomePage.class);
        getWebDriver().manage().window().maximize();
        home.acceptCookies();
    }


    @When("User clicks on Login icon")
    public void clicks_on_Login_icon() {
        home.clickOnLoginIcon();
    }


    @Then("User verifies Login form is displayed")
    public void verifies_Login_form_is_displayed() {
        login = Selenide.page(LoginPage.class);
        login.verifyLoginTittle();
    }
}