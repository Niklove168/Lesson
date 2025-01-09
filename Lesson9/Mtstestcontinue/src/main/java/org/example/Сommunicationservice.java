package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Сommunicationservice {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement isNumber1Placeholder;

    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement isSumm1Placeholder;

    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement isEmail1Placeholder;

    public Сommunicationservice(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getNumber1Placeholder() {
        return isNumber1Placeholder;
    }
    public WebElement getSumm1Placeholder() {
        return isSumm1Placeholder;
    }
    public WebElement getEmail1Placeholder() {
        return isEmail1Placeholder;
    }
}
