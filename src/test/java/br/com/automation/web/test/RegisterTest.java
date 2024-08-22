package br.com.automation.web.test;

import br.com.automation.web.faker.Fakers;
import br.com.automation.web.page.RegisterPage;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends RegisterPage {

    By nameC = By.xpath("//input[@placeholder=\"Nome completo\"]");
    By email = By.xpath("//input[@placeholder=\"E-mail\"]");
    By cpf = By.xpath("//input[@placeholder=\"CPF somente números\"]");
    By cep = By.xpath("//input[@placeholder=\"CEP\"]");
    By number = By.xpath("//input[@name=\"addressNumber\"]");
    By complement = By.xpath("//input[@name=\"addressDetails\"]");
    By searchCep = By.xpath("//input[@value=\"Buscar CEP\"]");
    By buttonCuidar = By.xpath("//li[span=\"Cuidar\"]");
    By buttonRegister = By.xpath("//button[@class=\"button-register\"]");
    By uploadImage = By.xpath("//input[@accept=\"image/*\"]");
    By messageSucess= By.xpath("//input[@accept=\"image/*\"]");

    Fakers fakers = new Fakers();

    @Before
    public void acessPage(){
        super.acessPage("https://walkdog.vercel.app/signup");
        fakers.fakerTest();
    }

    @Test
    public void registerSucess(){
        super.sendName(nameC, fakers.getNome());
        super.sendEmail(email, fakers.getEmail());
       super.sendCpf(cpf, fakers.getCpf());
       super.sendCep(cep,"11013-030");
       super.clickButton(searchCep);
       super.sendNumber(number, fakers.getNumber());
       super.sendcomplement(complement, fakers.getComplement());
       super.clickButton(buttonCuidar);
       super.uploadFile(uploadImage,"C:\\image\\testeIMG.jpg");
       super.clickButton(buttonRegister);
       super.assertMessage(messageSucess, "Recebemos o seu cadastro e em breve retornaremos o contato.");
    }

    @After
    public void closeDriver(){
        driver.quit();
    }



}
