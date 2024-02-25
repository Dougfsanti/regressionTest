package sauceregrassao.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import sauceregrassao.driver.Driver;

public class Executa extends Driver{
	
	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
	
	}
}
