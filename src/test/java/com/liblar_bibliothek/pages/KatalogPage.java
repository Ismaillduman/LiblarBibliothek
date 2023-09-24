package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryPage {
    public EntryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[id='translControl1']")
    public WebElement search;

    @FindBy(css="#numresults")
    public WebElement notFoundMessage;
    String expectedNotFoundMessage= "Keine Treffer hierfür im Katalog von Stadtbuecherei Erftstadt. ";
}
