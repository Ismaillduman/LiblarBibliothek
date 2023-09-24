package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "userid")
    public WebElement user;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//*[@value='Anmelden'])[2]")
    public WebElement anmelden;
}
