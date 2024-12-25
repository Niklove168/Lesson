package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test4 {
    private WebDriver driver;

    @FindBy(xpath = "(//input[@id='connection-phone'])[1]")
    private WebElement Phone;

    @FindBy(xpath = "(//input[@id='connection-sum'])[1]")
    private WebElement Sumforblock;

    @FindBy(xpath = "(//input[@id='connection-email'])[1]")
    private WebElement EmailforBlock;

    @FindBy(xpath = "(//button[@type='submit'][contains(text(),'Продолжить')])[1]")
    private WebElement ButtonforBlock;

    public Test4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void handleCookie() {
        try {
            WebElement cookie = driver.findElement(By.xpath("//button[contains(@class,'cookie__cancel')]"));
            cookie.click();
        } catch (Exception e) {
        }
    }

    public WebElement PhoneNumber(String phoneNumber) {
        return Phone;
    }

    public WebElement Sum(String sum) {
        return Sumforblock;
    }

    public WebElement Email(String email) {
        return EmailforBlock;
    }

    public WebElement Button() {
        return ButtonforBlock;
    }

    public void enterDataAndContinue(String phoneNumber, String sum, String email) {
        handleCookie();
        PhoneNumber(phoneNumber);
        Sum(sum);
        Email(email);
    }
}