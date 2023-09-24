package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vormerken {
    public Vormerken(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".btn.btn-primary.placehold")
    public WebElement confirm;
    @FindBy(xpath = "(//table[@id='holdst']/tbody/tr/td)[1]")
    public WebElement actualBookName;
}
