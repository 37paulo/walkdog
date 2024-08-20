package br.com.automation.web.page;

import br.com.automation.web.configuration.BaseTest;
import org.openqa.selenium.By;

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



}
