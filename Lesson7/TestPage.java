package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPage {
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
    private WebElement Cvc;

    @FindBy(xpath = "//div[@class=\"content ng-tns-c46-3\"]//label[contains(text(),\"Имя держателя (как на карте)\")]")
    private WebElement Namecard;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]//img[1]")
    private WebElement ImgMasterCard;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]//img[2]")
    private WebElement ImgVisa;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands__container ng-tns-c61-0 ng-trigger ng-trigger-brandsState ng-star-inserted\"]//img[3]")
    private WebElement ImgBelcart;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted\"]//img[1]")
    private WebElement Imgmir;

    @FindBy(xpath = "//div[@class=\"cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted\"]//img[2]")
    private WebElement Imgmaestro;

    @FindBy(xpath = "//button[@type=\"submit\"][contains(text(), \" BYN \")]")
    private WebElement ButtonwithPrice;

    public TestPage(WebDriver driver) {
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
        return Cvc;
    }

    public WebElement getNamecard() {
        return Namecard;
    }

    public WebElement getImgMasterCard() {
        return ImgMasterCard;
    }

    public WebElement getImgVisa() {
        return ImgVisa;
    }

    public WebElement getImgBelcart() {
        return ImgBelcart;
    }

    public WebElement getImgmir() {
        return Imgmir;
    }

    public WebElement getImgMaestro() {
        return Imgmaestro;
    }

    public WebElement getButtontextPrice() {
        return ButtonwithPrice;
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