package sauceregrassao.steps;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import sauceregrassao.metodos.Metodos;
import sauceregrassao.runner.Executa;

public class LoginTest {
	
	By nome = By.xpath("//*[@id='user-name']");
	By senha = By.xpath("//*[@id='password']");
	By btnLogin = By.xpath("//*[@id='login-button']");
	
	@Test
	public void loginComSucesso() {
		Executa.iniciarTeste();
		Metodos.escrever(nome, "standard_user");
		Metodos.escrever(senha, "secret_sauce");
		Metodos.clicar(btnLogin);
			
	}

}
