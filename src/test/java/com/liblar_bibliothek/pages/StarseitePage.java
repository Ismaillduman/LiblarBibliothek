package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LMSCloudPage {
    public LMSCloudPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//table[@id='checkoutst']//tbody//tr/td[7])")
    public List<WebElement> verlängernList;

    @FindBy(xpath = "//a[@href='/cgi-bin/koha/opac-entrypages.pl?interestGroup=T&page=Childfrom9']")
    public WebElement Jugendbibliothek;
}
