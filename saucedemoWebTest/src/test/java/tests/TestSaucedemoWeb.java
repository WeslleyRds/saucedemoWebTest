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



	
	
}
