package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class TestSaucedemoWeb {
	
	Metodos met = new Metodos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
	  met.abrirNavegador(site);
	  met.captureScreenshot("CT01 - Tela de Login - ");
	}

	@When("realizo o login")
	public void realizo_o_login() {
	  
	}

	@When("escolho o produto")
	public void escolho_o_produto() {
	    
	}

	@When("faco o checkout")
	public void faco_o_checkout() {
	   
	}

	@Then("efetuo o lougout")
	public void efetuo_o_lougout() {
	    
	}



	
	
}
