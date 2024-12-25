package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2 {
    private WebDriver driver;

    @FindBy(xpath = "(//img[@alt='Visa'])[1]")
    private WebElement VisaLogo;

    @FindBy(xpath = "(//img[@alt='Verified By Visa'])[1]")
    private WebElement VerifiedByVisaLogo;

    @FindBy(xpath = "(//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg'])[1]")
    private WebElement MasterCardLogo;

    @FindBy(xpath = "(//img[@alt='MasterCard Secure Code'])[1]")
    private WebElement MasterCardSecureCodeLogo;

    @FindBy(xpath = "(//img[@src='/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg'])[1]")
    private WebElement belkartLogo;

    public Test2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getVisaLogo() {
        return VisaLogo;
    }

    public WebElement getVerifiedByVisaLogo() {
        return VerifiedByVisaLogo;
    }

    public WebElement getMasterCardLogo() {
        return MasterCardLogo;
    }

    public WebElement getMasterCardSecureCodeLogo() {
        return MasterCardSecureCodeLogo;
    }

    public WebElement getBelkartLogo() {
        return belkartLogo;
    }
}