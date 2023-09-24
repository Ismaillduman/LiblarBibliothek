package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ErgebnissederSuchePage {
    public ErgebnissederSuchePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='numresults']")
    public WebElement notFoundMessage;
    String expectedNotFoundMessage= "Keine Treffer bei der Suche im Bibliothekskatalog!";

    @FindBy(css = ".reserve.btn.btn-link.btn-lg")
    public WebElement vormerken;

    @FindBy(xpath = "//tr/td/div[@class='title_summary']/a")
    public List<WebElement> book_names_list;

}
