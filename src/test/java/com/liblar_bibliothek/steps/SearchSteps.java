package com.liblar_bibliothek.steps;

import com.liblar_bibliothek.pages.ErgebnissederSuchePage;
import com.liblar_bibliothek.pages.KatalogPage;
import com.liblar_bibliothek.pages.StarseitePage;
import com.liblar_bibliothek.pages.VormerkenPage;
import com.liblar_bibliothek.utility.ConfigurationReader;
import com.liblar_bibliothek.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;


public class SearchSteps {

    StarseitePage starseite = new StarseitePage();
    KatalogPage katalog = new KatalogPage();

    ErgebnissederSuchePage ergebnisse = new ErgebnissederSuchePage();
    VormerkenPage vormerken = new VormerkenPage();

    @When("user click the Jugendbibliothek")
    public void user_click_the_jugendbibliothek() {
        starseite.Jugendbibliothek.click();
    }

    @When("user navigate to the Katalog page")
    public void user_navigate_to_the_katalog_page() {
        Assert.assertEquals("Stadtbuecherei Erftstadt - Katalog durchstöbern", Driver.getDriver().getTitle());
    }

    @When("user enter the {string} in the search box")
    public void user_enter_the_in_the_search_box(String bookName) {
        bookName = ConfigurationReader.getProperty("book_name");
        katalog.search.sendKeys(bookName);
        katalog.search.sendKeys(Keys.ENTER);
    }


    @Then("user should be able to see the search result")
    public void user_should_be_able_to_see_the_search_result() {


        try {

            ergebnisse.vormerken.click();
        } catch (NoSuchElementException e) {

            System.err.println(ergebnisse.notFoundMessage.getText());

        }



    }


    @When("user click the vormerkung bestätigung button")
    public void userClickTheVormerkungBestatigungButton() {
        try {

            vormerken.confirm.click();
        } catch (NoSuchElementException e) {



        }

    }

    @And("user should be able to see the {string} on the reservation table")
    public void userShouldBeAbleToSeeTheOnTheReservationTable(String book) {

        try {

            System.out.println("vormerken.actualBookName.getText() = " + vormerken.actualBookTitle.getText());
            Assert.assertTrue(ConfigurationReader.getProperty("book_name").contains(vormerken.actualBookTitle.getText().substring(5)));

        } catch (NoSuchElementException e) {



        }



    }
}
