package org.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Installmentplan {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id='score-instalment']")
    private WebElement isNumberofScore;

    @FindBy(xpath = "//input[@id='instalment-sum']")
    private WebElement isSumm3Placeholder;

    @FindBy(xpath = "//input[@id='instalment-email']")
    private WebElement isEmail3Placeholder;

    public Installmentplan(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getNumberofScore() {
        return isNumberofScore;
    }

    public WebElement getSumm3Placeholder() {
        return isSumm3Placeholder;
    }

    public WebElement getEmail3Placeholder() {
        return isEmail3Placeholder;
    }

    public void handleCookie1() {
        try {
            WebElement cookie = driver.findElement(By.xpath("//button[contains(@class,'cookie__cancel')]"));
            cookie.click();
        } catch (Exception e) {
        }
    }

    public void clickChoose1() {
        WebElement button2 = driver.findElement(By.xpath("//span[@class='select__arrow']//*[name()='svg']"));
        WebElement element3 = driver.findElement(By.xpath("//p[@class='select__option'][contains(text(),'Рассрочка')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='select__arrow']//*[name()='svg']")));
        button2.click();
        element3.click();
    }

    public void enterDataAndContinue2() {
        handleCookie1();
        clickChoose1();
    }
}
