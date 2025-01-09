package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Arrear {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement isNumber1ofScore;

    @FindBy(xpath = "//input[@id='arrears-sum']")
    private WebElement isSumm4Placeholder;

    @FindBy(xpath = "//input[@id='arrears-email']")
    private WebElement isEmail4Placeholder;

    public Arrear(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getNumber1ofScore() {
        return isNumber1ofScore;
    }

    public WebElement getSumm4Placeholder() {
        return isSumm4Placeholder;
    }

    public WebElement getEmail4Placeholder() {
        return isEmail4Placeholder;
    }

    public void handleCookie2() {
        try {
            WebElement cookie = driver.findElement(By.xpath("//button[contains(@class,'cookie__cancel')]"));
            cookie.click();
        } catch (Exception e) {
        }
    }

    public void clickChoose2() {
        WebElement button3 = driver.findElement(By.xpath("//span[@class='select__arrow']//*[name()='svg']"));
        WebElement element4 = driver.findElement(By.xpath("//p[contains(text(),'Задолженность')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='select__arrow']//*[name()='svg']")));
        button3.click();
        element4.click();
    }

    public void enterDataAndContinue3() {
        handleCookie2();
        clickChoose2();
    }
}
