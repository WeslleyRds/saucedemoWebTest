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

	@When("realizo o login com outro usuário")
	public void realizado_o_login() {
		met.escrever("problem_user", el.getUsername());
		met.escrever("secret_sauce", el.getPassword());
		met.esperar(1000);
		met.captureScreenshot("Evidencia 13 - Login realizado - ");
		met.clicar(el.getBtn());
		
		
	}

	@Then("cada imagem deve ser exibida de acordo com o seu nome")
	public void cada_imagem_deve_ser_exibida_de_acordo_com_o_seu_nome() {
		met.captureScreenshot("Evidencia 14 - Imagem não de acordo com o nome do produto ");
		met.fecharNavegador();
		
	}

}
