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
    String cpf = faker.idNumber().valid();


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
    }


    public void closeDriver(){
        driver.quit();
    }



}
