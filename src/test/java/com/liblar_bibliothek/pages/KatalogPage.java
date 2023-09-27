package com.liblar_bibliothek.pages;

import com.liblar_bibliothek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KatalogPage {
    public KatalogPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "[id='translControl1']")
    public WebElement search;

    @FindBy(xpath = "//table[@id='checkoutst']/tbody//td/input[@type='checkbox']")
    public List<WebElement> checkBoxExtend;

    @FindBy(xpath = "//*[@Value='Markierte verlängern']")
    public WebElement extendButton;

    @FindBy(xpath = "(//table[@id='checkoutst']//td[contains(text(), \"Keine Verlängerung vor\")])[1]")
    public WebElement noExtend;
}
