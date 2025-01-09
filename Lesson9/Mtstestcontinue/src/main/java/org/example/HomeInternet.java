package org.example;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomeInternet {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='internet-phone']")
    private WebElement isNumber2Placeholder;

    @FindBy(xpath = "//input[@id='internet-sum']")
    private WebElement isSumm2Placeholder;

    @FindBy(xpath = "//input[@id='internet-email']")
    private WebElement isEmail2Placeholder;

    public HomeInternet(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getNumber2Placeholder() {
        return isNumber2Placeholder;
    }

    public WebElement getSumm2Placeholder() {
        return isSumm2Placeholder;
    }

    public WebElement getEmail2Placeholder() {
        return isEmail2Placeholder;
    }

    public void handleCookie() {
        try {
            WebElement cookie = driver.findElement(By.xpath("//button[contains(@class,'cookie__cancel')]"));
            cookie.click();
        } catch (Exception e) {
        }
    }

    public void clickChoose() {
        WebElement button1 = driver.findElement(By.xpath("//span[@class='select__arrow']//*[name()='svg']"));
        WebElement element2 = driver.findElement(By.xpath("//p[contains(text(),'Домашний интернет')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='select__arrow']//*[name()='svg']")));
        button1.click();
        element2.click();
    }

    public void enterDataAndContinue1() {
        handleCookie();
        clickChoose();
    }

}
