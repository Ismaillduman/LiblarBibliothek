package com.liblar_bibliothek.steps;


import com.liblar_bibliothek.pages.LoginPage;
import com.liblar_bibliothek.utility.BrowserUtil;
import com.liblar_bibliothek.utility.ConfigurationReader;
import com.liblar_bibliothek.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageSteps {
    public WebDriverWait wait;
    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void userOnTheLoginPage() {
        //BrowserUtil.scrollToElement(loginPage.Benutzerkonto);
        wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        loginPage.cookies.click();
        BrowserUtil.waitFor(2);
        loginPage.Benutzerkonto.click();

    }

    @When("user enter valid user {string} and password {string} in the input box")
    public void userEnterValidUserAndPasswordInTheInputBox(String userNumber, String password) {
//        userNumber= ConfigurationReader.getProperty("userNum");
//        password=ConfigurationReader.getProperty("password");
        wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        loginPage.login(userNumber, password);


    }



    @Then("user on the start page")
    public void userOnTheStartPage() {
        Assert.assertEquals("Startseite Ihrer Bibliothek › Stadtbuecherei Erftstadt - Katalog", Driver.getDriver().getTitle());

    }



}
