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

    public void sendName(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void sendEmail(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void sendCpf(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void sendCep(By element, String value){
        driver.findElement(element).sendKeys(value);
    }
    public void clickButton(By element){
        driver.findElement(element).click();
    }
    public void sendNumber(By element, String value){
        driver.findElement(element).sendKeys(value);
    }
    public void sendcomplement(By element, String value){
        driver.findElement(element).sendKeys(value);
    }

    public void uploadFile(By element, String file){
        WebElement upload = driver.findElement(element);
        upload.sendKeys(file);
    }
    public  void assertMessage(By element, String message){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement elementText = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        String expectedText = elementText.getText();
        String actualText = message;
        Assertions.assertEquals(expectedText, actualText);

    }





}
