package tests;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class TestSaucedemoWeb {

	Metodos met = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		met.abrirNavegador(site);
		met.captureScreenshot("Evidencia 01 - Site Saucedemo - ");
	}

	@When("realizo o login")
	public void realizo_o_login() {
		met.escrever("standard_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 02 - Usuário e senha preenchido - ");
		met.clicar(el.getBtn());
		met.captureScreenshot("Evidencia 03 - Usuário logado - ");

	}

	@When("escolho o produto")
	public void escolho_o_produto() {
		met.clicar(el.getBackpack());
		met.captureScreenshot("Evidencia 04 - Produto selecionado - ");
	}

	@When("faco o checkout")
	public void faco_o_checkout() {
		met.clicar(el.getCarrinho());
		met.captureScreenshot("Evidencia 05 - Produto no carrinho - ");
		met.clicar(el.getCheckout());
		met.escrever("Weslley", el.getFirstName());
		met.escrever("Rodrigues", el.getLastName());
		met.escrever("119999999", el.getPostalCode());
		met.captureScreenshot("Evidencia 06 - Dados preenchidos - ");
		met.clicar(el.getContinue());
		met.captureScreenshot("Evidencia 07 - Tela de informação do produto - ");
		met.clicar(el.getFinish());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 08 - Tela de agradecimento - ");

	}

	@Then("efetuo o lougout")
	public void efetuo_o_lougout() {
		met.clicar(el.getMenu());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 09 - Menu - ");
		met.clicar(el.getLogout());
		met.captureScreenshot("Evidencia 10 - Usuário deslogado -");
		met.fecharNavegador();
	}

	@When("insiro dados invalido")
	public void insiro_dados_invalido() {
		met.escrever("locked_out_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.captureScreenshot("Evidencia 11 - Dados invalidos preenchidos -");
	}

	@Then("uma mensagem de erro deve ser apresentada")
	public void uma_mensagem_de_erro_deve_ser_apresentada() {
		met.clicar(el.getBtn());
		met.captureScreenshot("Evidencia 12 - Mensagem de Erro -");
		met.fecharNavegador();
	}

	@When("realizo o login com usuario problem_user")
	public void realizado_o_login() {
		met.escrever("problem_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 13 - Login realizado - ");
		met.clicar(el.getBtn());
		
		
	}

	@Then("realizo o checkout do produto")
	public void cada_imagem_deve_ser_exibida_de_acordo_com_o_seu_nome() {
		met.captureScreenshot("Evidencia 14 - Imagem não de acordo com o nome do produto ");
		met.clicar(el.getBackpack());
		met.captureScreenshot("Evidencia 15 - Produto Backpack selecionado ");
		met.clicar(el.getLabsBike());
		met.captureScreenshot("Evidencia 16 - Produto Bike Light  não foi selecionado ");
		met.clicar(el.getCarrinho());
		met.captureScreenshot("Evidencia 17 - Produtos no carrinho ");
		met.clicar(el.getCheckout());
		met.escrever("Weslley", el.getFirstName());
		met.escrever("Rodrigues", el.getLastName());
		met.escrever("119999999", el.getPostalCode());
		met.captureScreenshot("Evidencia 18 - Opção Last Name não funciona ");
		met.fecharNavegador();
		
	}
	
	

	@When("realizo o login com usuario visual_user")
	public void efetuo_o_login_com_usuario_visual_user() {
		met.escrever("visual_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 19 - Login realizado - ");
		met.clicar(el.getBtn());
	}
	
	@Then("valido o layout da pagina")
	public void valido_o_layout_da_pagina() {
		met.captureScreenshot("Evidencia 20 - Carrinho fora do padrão - ");
		met.clicar(el.getBackpack());
		met.clicar(el.getCarrinho());
		met.captureScreenshot("Evidencia 21 - Botão checkout Fora do padrão - ");
		met.clicar(el.getCheckout());
		met.esperar(1000);
		met.escrever("Weslley", el.getFirstName());
		met.escrever("Rodrigues", el.getLastName());
		met.escrever("119999999", el.getPostalCode());
		met.captureScreenshot("Evidencia 22 - Menu não centralizado - ");
		met.clicar(el.getContinue());	
		met.clicar(el.getFinish());
		met.esperar(1000);		
		met.clicar(el.getMenu());
		met.esperar(1000);
		met.clicar(el.getLogout());
		met.captureScreenshot("Evidencia 23 - Pagina Inicial - ");
		met.fecharNavegador();
	}

	@When("realizo o login com usuario performance_glitch_user")
	public void realizo_o_login_com_usuario_performance_glitch_user() {
		met.escrever("performance_glitch_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 24 - Usuário e senha preenchido - ");
		met.clicar(el.getBtn());
		met.captureScreenshot("Evidencia 25 - usuario ao clicar demora para ir a pagina invetory.html - ");
	}
	
	@Then("valido a performace da pagina")
	public void valido_a_performace_da_pagina() {
	    met.clicar(el.getBackpack());
	    met.clicar(el.getLabsBike());   
	    met.clicar(el.getBolt());
	    met.captureScreenshot("Evidencia 26 - O produto Labs Bike Light ao clicar rapido não foi selecionado - ");
	    met.clicar(el.getCarrinho());
	    met.clicar(el.getcontinueShopping());
	    met.captureScreenshot("Evidencia 27 - Ao clicar no botão Continue Shopping o mesmo demora para prosseguir - ");
	    met.clicar(el.getLabsBike());
	    met.clicar(el.getCarrinho());
	    met.captureScreenshot("Evidencia 28 - Ao selecionar o novo produto o mesmo não aparece no carrinho - ");
	    met.fecharNavegador();
	    
	}

	@When("realizo o login com usuario error_user")
	public void realizo_o_login_com_usuario_error_user() {
		met.escrever("error_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 29 - Usuário e senha preenchido - ");
		met.clicar(el.getBtn());
		met.captureScreenshot("Evidencia 30 - Usuário logado -  ");
	}
	@Then("valido se contém erro na pagina")
	public void valido_se_contém_erro_na_pagina() {
		met.clicar(el.getBackpack());
		met.captureScreenshot("Evidencia 31 - Produto adicionado no carrinho -  ");
		met.clicar(el.getCarrinho());
		met.clicar(el.getCheckout());
		met.escrever("Weslley", el.getFirstName());
		met.escrever("Rodrigues", el.getLastName());
		met.escrever("119999999", el.getPostalCode());
		met.captureScreenshot("Evidencia 32 - Campo Last Name não foi preenchido -  ");
		met.clicar(el.getContinue());
		met.captureScreenshot("Evidencia 33 - O botão continuar funcionou mesmo sem preencher o Last Name -  ");
		met.clicar(el.getFinish());
		met.clicar(el.getFinish());
		met.captureScreenshot("Evidencia 34 - O botão Finish não funciona -");
		met.fecharNavegador();
	     
	}





	

}
