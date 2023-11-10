package steps;

import elementos.Elementos;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import navegador.Navegador;

public class LoginCadastroTeste {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@After
	public void encerrarTeste () {
		Navegador.fecharNavegador();
	}
	
	@Given("que esteja no site saucedemo")
	public void queEstejaNoSiteSaucedemo() {
		Navegador.abrirNavegador();
	}

	@When("preencher dados validos")
	public void preencherDadosValidos() {
		metodos.escrever(el.username, "standard_user");
		metodos.escrever(el.password, "secret_sauce");
		metodos.clicar(el.login);
	}

	@Then("valido login com sucesso")
	public void validoLoginComSucesso() {
		metodos.validarTitle("Swag Labs");
	}

	@When("preencher dados invalidos")
	public void preencherDadosInvalidos() {
		metodos.escrever(el.username, "123");
		metodos.escrever(el.password, "123");
		metodos.clicar(el.login);
	}

	@Then("valido retorno da mensagem dados invalidos")
	public void validoRetornoDaMensagemDadosInvalidos() {
		metodos.validarTexto(el.msgInvalida,
				"Epic sadface: Username and password do not match any user in this service");
	}

	@When("deixar dados em branco")
	public void deixarDadosEmBranco() {
		metodos.clicar(el.login);
	}

	@Then("valido retorno da mensagem preecher campos")
	public void validoRetornoDaMensagemPreecherCampos() {
		metodos.validarTexto(el.msgInvalida, "Epic sadface: Username is required");
	}

	@When("preencher username errado")
	public void preencherUsernameErrado() {
		metodos.escrever(el.username, "123");
		metodos.escrever(el.password, "secret_sauce");
		metodos.clicar(el.login);
	}

	@When("preencher senha errada")
	public void preencherSenhaErrada() {
		metodos.escrever(el.username, "standard_user");
		metodos.escrever(el.password, "123");
		metodos.clicar(el.login);
	}

	@When("deixar username em branco")
	public void deixarUsernameEmBranco() {
		metodos.escrever(el.password, "123");
		metodos.clicar(el.login);
	}

	@Then("valido retorno da mensagem preencher campos")
	public void validoRetornoDaMensagemPreencherCampos() {
		metodos.validarTexto(el.msgInvalida, "Epic sadface: Username is required");
	}

	@When("deixar senha em branco")
	public void deixarSenhaEmBranco() {
		metodos.escrever(el.username, "standard_user");
		metodos.clicar(el.login);
	}

	@Then("valido retorno da mensagem preencher senha")
	public void validoRetornoDaMensagemPreencherSenha() {
		metodos.validarTexto(el.msgInvalida, "Epic sadface: Password is required");
	}


}
