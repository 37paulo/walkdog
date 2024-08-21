package br.com.automation.web.page;

import org.junit.jupiter.api.Assertions;
import br.com.automation.web.configuration.BaseTest;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static dev.failsafe.internal.util.Assert.*;

public class RegisterPage extends BaseTest {

    public void acessPage(String url){
        driver.get(url);
    }

    public void sendName(String element, String value){
        driver.findElement(By.xpath(element)).sendKeys(value);
    }

    public void sendEmail(String element, String value){
        driver.findElement(By.xpath(element)).sendKeys(value);
    }

    public void sendCpf(String element, String value){
        driver.findElement(By.xpath(element)).sendKeys(value);
    }

    public void sendCep(String element, String value){
        driver.findElement(By.xpath(element)).sendKeys(value);
    }
    public void clickButton(String element){
        driver.findElement(By.xpath(element)).click();
    }
    public void sendNumber(String element, String value){
        driver.findElement(By.xpath(element)).sendKeys(value);
    }
    public void sendcomplement(String element, String value){
        driver.findElement(By.xpath(element)).sendKeys(value);
    }

    public void uploadFile(String element, String file){
        WebElement upload = driver.findElement(By.xpath(element));
        upload.sendKeys(file);
    }

    public  void assertMessage(String element, String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement elementText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
        String expectedText = elementText.getText();
        String actualText = message;
        Assertions.assertEquals(expectedText, actualText);

    }





}
