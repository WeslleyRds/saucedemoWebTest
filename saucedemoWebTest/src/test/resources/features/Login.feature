#Author: weslleyrds20@gmail.com
#language : en

@Login
Feature: Acessar o site
  Eu como usuario queo validar o site Saucedemo.com
  
  Background: Site
 	Given que eu esteja no "https://www.saucedemo.com/"


@CT01 
 Scenario Outline: CT01 - Validar checkout do produto
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
	When  realizo o login com usuario problem_user
	Then 	realizo o checkout do produto
	
	@CT04
  Scenario: CT04 - Validar layout da pagina
	When  	realizo o login com usuario visual_user
	Then 		valido o layout da pagina
	
	@CT05
  Scenario: CT05 - Validar performace da pagina
	When  	realizo o login com usuario performance_glitch_user
	Then 		valido a performace da pagina
	
	@CT06
  Scenario: CT06 - Validar erros da pagina
	When  	realizo o login com usuario error_user
	Then 		valido se contém erro na pagina

