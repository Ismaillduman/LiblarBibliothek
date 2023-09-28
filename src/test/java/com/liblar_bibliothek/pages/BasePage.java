package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * parent class for concrete Page object classes
 * provides constructor with initElements method for re-usability
 * abstract - to prevent instantiation.
 */
public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "(//a/button[@type='button'])[2]")
    public WebElement Benutzerkonto;


}
