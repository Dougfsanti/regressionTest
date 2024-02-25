
Feature: Login de usuario
	Como usuario da aplicacao deslogado
	Quero enviar dados validos 
	Para acessar a minha conta

Scenario: Login com sucesso
	Given que nao esteja logado
	When preencher o campo nome
	And preencher o campo senha
	And clicar no botao login
	Then usuario acessa a pagina usuario logado


Scenario: Login senha invalida
	Given que nao esteja logado
	When preencher o campo nome
	And preencher o campo senha com dados errados
	And clicar no botao login
	Then usuario recebe mensagem de senha errada
