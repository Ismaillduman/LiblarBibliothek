package com.liblar_bibliothek.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.liblar_bibliothek.utility.BrowserUtil;
import com.liblar_bibliothek.utility.ConfigurationReader;
import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "userid")
    public WebElement userBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "(//*[@value='Anmelden'])[2]")
    public WebElement anmelden;

    public void login(String userNumber, String password){

        userBox.sendKeys(userNumber);
        passwordBox.sendKeys(password);
        anmelden.sendKeys(Keys.ENTER);
        BrowserUtil.waitFor(3);



    }
}
