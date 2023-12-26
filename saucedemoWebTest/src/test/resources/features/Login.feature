#Author: weslleyrds20@gmail.com
#language : en

@CT01
Feature: Acessar o site
  Eu como usuario queo validar o site Saucedemo.com
  
  Background: Site
 	Given que eu esteja no "https://www.saucedemo.com/"


  
 	Scenario: CT01 - Validar checkout do produto
 	When  realizo o login 
	And escolho o produto  
	And faco o checkout
	Then efetuo o lougout
	


  