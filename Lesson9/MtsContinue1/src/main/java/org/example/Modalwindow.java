package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Modalwindow {
    private WebDriver driver;

    @FindBy(xpath = "(//input[@id='connection-phone'])[1]")
    private WebElement phoneInput;

    @FindBy(xpath = "(//input[@id='connection-sum'])[1]")
    private WebElement sumInput;

    @FindBy(xpath = "(//input[@id='connection-email'])[1]")
    private WebElement emailInput;

    @FindBy(xpath = "(//button[@type='submit'][contains(text(),'Продолжить')])[1]")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class=\"pay-description__cost\"]//span[contains(text(),\"BYN\")]")
    private WebElement costNumber;

    @FindBy(xpath = "//div[@class=\"pay-description__text\"]//span[contains(text(),\"Оплата: Услуги связи\")]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//div[@class=\"content ng-tns-c46-1\"]//label[contains(text(),\"Номер карты\")]")
    private WebElement cardNumber;

    @FindBy(xpath = "//div[@class=\"content ng-tns-c46-4\"]//label[contains(text(),\"Срок действия\")]")
    private WebElement validity;

    @FindBy(xpath = "//div[@class=\"content ng-tns-c46-5\"]//label[contains(text(),\"CVC\")]")
    private WebElement cvc;

    @FindBy(xpath = "//div[@class=\"content ng-tns-c46-3\"]//label[contains(text(),\"Имя держателя (как на карте)\")]")
    private WebElement nameCard;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]//img[1]")
    private WebElement imgMasterCard;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]//img[2]")
    private WebElement imgVisa;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]//img[3]")
    private WebElement imgBelcart;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted\"]//img[1]")
    private WebElement imgMir;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted\"]//img[2]")
    private WebElement imgMaestro;

    @FindBy(xpath = "//button[@type=\"submit\"][contains(text(),\"BYN\")]")
    private WebElement buttonWithprice;

    public Modalwindow(WebDriver driver) {
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

    static void waitForWindowToOpen() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterPhoneNumber(String phoneNumber) {
        phoneInput.sendKeys(phoneNumber);
    }

    public void enterSum(String sum) {
        sumInput.sendKeys(sum);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public WebElement getCostNumber() {
        return costNumber;
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public WebElement getCardNumberPlaceholder() {
        return cardNumber;
    }

    public WebElement getValidityPlaceholder() {
        return validity;
    }

    public WebElement getCvc() {
        return cvc;
    }

    public WebElement getNamecard() {
        return nameCard;
    }

    public WebElement getImgMasterCard() {
        return imgMasterCard;
    }

    public WebElement getImgVisa() {
        return imgVisa;
    }

    public WebElement getImgBelcart() {
        return imgBelcart;
    }

    public WebElement getImgmir() {
        return imgMir;
    }

    public WebElement getImgMaestro() {
        return imgMaestro;
    }

    public WebElement getButtontextPrice() {
        return buttonWithprice;
    }

    public void enterDataAndContinue(String phoneNumber, String sum, String email) {
        handleCookie();
        enterPhoneNumber(phoneNumber);
        enterSum(sum);
        enterEmail(email);
        clickContinueButton();
        waitForWindowToOpen();
    }

}
