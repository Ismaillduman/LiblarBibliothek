package com.liblar_bibliothek.steps;

import com.liblar_bibliothek.pages.KatalogPage;
import com.liblar_bibliothek.utility.BrowserUtil;
import com.liblar_bibliothek.utility.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class KatalogPageSteps {
    KatalogPage katalogPage = new KatalogPage();

    @When("user click the verlängern checkbox on the data table")
    public void user_click_the_verlängern_checkbox_on_the_data_table() {

        try {
            for (WebElement eachCheckBox : katalogPage.checkBoxExtend) {
                eachCheckBox.click();

            }
        }catch (NoSuchElementException e) {

            System.err.println("There is no suitable book to extend the book rental period.");

        }


    }

    @When("user click the Markierte verlängern button")
    public void user_click_the_markierte_verlängern_button() {

        try {
            katalogPage.extendButton.click();
        }catch (NoSuchElementException e) {

            System.err.println("There is no suitable book to extend the book rental period.");
            Driver.getDriver().close();
        }


    }
}
