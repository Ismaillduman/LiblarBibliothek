package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VormerkenPage {
    public VormerkenPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".btn.btn-primary.placehold")
    public WebElement confirm;
    @FindBy(xpath = "//table[@id='holdst']//a/span[@class='biblio-title']")
    public WebElement actualBookTitle;

    @FindBy(xpath = "//table[@id='holdst']//a/span[@class='subtitle']")
    public WebElement actualBookSubtitle;
}
