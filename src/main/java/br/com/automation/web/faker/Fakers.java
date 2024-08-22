package br.com.automation.web.faker;

import com.github.javafaker.Faker;

public class Fakers {
    private String nome;
    private String email;
    private String cpf;
    private String number;
    private String complement;

    public void fakerTest(){

        Faker faker = new Faker();
        this.nome = faker.name().fullName();
        this.email = faker.internet().emailAddress();
        this.cpf = "25983473409";
        this.number = faker.number().digits(5);
        this.complement = faker.address().secondaryAddress();

        System.out.println("Nome gerado: " + this.nome);
        System.out.println("Email gerado: " + this.email);
        System.out.println("CPF gerado: " + this.cpf);
        System.out.println("Número gerado: " + this.number);
        System.out.println("Complemento gerado: " + this.complement);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumber() {
        return number;
    }

    public String getComplement() {
        return complement;
    }
}
