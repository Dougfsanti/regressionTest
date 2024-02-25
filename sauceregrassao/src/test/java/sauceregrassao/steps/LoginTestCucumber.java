package sauceregrassao.steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauceregrassao.metodos.Metodos;
import sauceregrassao.runner.Executa;

public class LoginTestCucumber {
	
	By nome = By.xpath("//*[@id='user-name']");
	By senha = By.xpath("//*[@id='password']");
	By btnLogin = By.xpath("//*[@id='login-button']");
	
	@Given("que nao esteja logado")
	public void que_nao_esteja_logado() {
		Executa.iniciarTeste();
	   
	}

	@When("preencher o campo nome")
	public void preencher_o_campo_nome() {
		Metodos.escrever(nome, "standard_user");
	    
	}

	@When("preencher o campo senha")
	public void preencher_o_campo_senha() {
		Metodos.escrever(senha, "secret_sauce");
	    
	}

	@When("clicar no botao login")
	public void clicar_no_botao_login() {
		Metodos.clicar(btnLogin);
	    
	}

	@Then("usuario acessa a pagina usuario logado")
	public void usuario_acessa_a_pagina_usuario_logado() {
		//implementar assert
	    
	}
	
	@When("preencher o campo senha com dados errados")
	public void preencher_o_campo_senha_com_dados_errados() {
		Metodos.escrever(senha, "secret_sauceR");
	  
	}
	
	@Then("usuario recebe mensagem de senha errada")
	public void usuario_recebe_mensagem_de_senha_errada() {
		//implementar assert
	  	    
	}

}
