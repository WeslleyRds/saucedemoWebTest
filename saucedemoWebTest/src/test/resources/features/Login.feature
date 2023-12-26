#Author: weslleyrds20@gmail.com
#language : en

@Login
Feature: Acessar o site
  Eu como usuario queo validar o site Saucedemo.com
  
  Background: Site
 	Given que eu esteja no "https://www.saucedemo.com/"


@CT01 
 Scenario: CT01 - Validar checkout do produto
 	When  realizo o login 
	And 	escolho o produto  
	And 	faco o checkout
	Then 	efetuo o lougout

@CT02
	Scenario: CT02 - Validar mensagem dados invalidos
	When  insiro dados invalido 
	Then 	uma mensagem de erro deve ser apresentada

  @CT03
  Scenario: CT03 - Validar imagem do produto
	When  realizo o login com outro usuário
	Then 	cada imagem deve ser exibida de acordo com o seu nome