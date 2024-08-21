package br.com.automation.web.test;

import br.com.automation.web.page.RegisterPage;
import com.github.javafaker.Faker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends RegisterPage {

    Faker faker = new Faker();
    String nome = faker.name().name();
    String email = faker.internet().emailAddress();
    String cpf = "25983473409";
    String number = faker.number().digits(5);
    String complement = faker.address().secondaryAddress();

    @Before
    public void acessPage(){
        super.acessPage("https://walkdog.vercel.app/signup");

    }

    @Test
    public void registerSucess(){
       super.sendName("//input[@placeholder=\"Nome completo\"]", nome);
       super.sendEmail("//input[@placeholder=\"E-mail\"]", email);
       super.sendCpf("//input[@placeholder=\"CPF somente números\"]",cpf);
       super.sendCep("//input[@placeholder=\"CEP\"]","11013-030");
       super.clickButton("//input[@value=\"Buscar CEP\"]");
       super.sendNumber("//input[@name=\"addressNumber\"]", number);
       super.sendcomplement("//input[@name=\"addressDetails\"]",complement);
       super.clickButton("//li[span=\"Cuidar\"]");
       super.uploadFile("//input[@accept=\"image/*\"]","C:\\image\\testeIMG.jpg");
       super.clickButton("//button[@class=\"button-register\"]");
       super.assertMessage("//div[@class='swal2-html-container']", "Recebemos o seu cadastro e em breve retornaremos o contato.");
    }

    @After
    public void closeDriver(){
        driver.quit();
    }



}
