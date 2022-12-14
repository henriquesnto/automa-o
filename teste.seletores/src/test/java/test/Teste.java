package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import runner.Execulta;

public class Teste {
	
	Elementos ele = new Elementos();
	

	@Before
	public void iniciarTest() throws InterruptedException{
		Execulta.abrirNavegador();
		Thread.sleep(5000);

	}
	
	@After
	public void fechartest() {
		Execulta.fecharNavegador();
	}

	@Test
	public void validacao1() {
		Execulta.clicar(ele.getBaz());
		Execulta.clicar(ele.getBar());
		Execulta.clicar(ele.getFoo());
		Execulta.evidencia("Validação1");
	}

	@Test
	public void validacao2() {
		Execulta.clicar(ele.getphaedrum0Edit());
		Execulta.clicar(ele.getphaedrum0Delete());
		Execulta.clicar(ele.getphaedrum1Edit());
		Execulta.clicar(ele.getphaedrum1Delete());
		Execulta.clicar(ele.getphaedrum2Edit());
		Execulta.clicar(ele.getphaedrum2Delete());
		Execulta.clicar(ele.getphaedrum3Edit());
		Execulta.clicar(ele.getphaedrum3Delete());
		Execulta.clicar(ele.getphaedrum4Edit());
		Execulta.clicar(ele.getphaedrum4Delete());
		Execulta.clicar(ele.getphaedrum5Edit());
		Execulta.clicar(ele.getphaedrum5Delete());
		Execulta.clicar(ele.getphaedrum6Edit());
		Execulta.clicar(ele.getphaedrum6Delete());
		Execulta.clicar(ele.getphaedrum7Edit());
		Execulta.clicar(ele.getphaedrum7Delete());
		Execulta.clicar(ele.getphaedrum8Edit());
		Execulta.clicar(ele.getphaedrum8Delete());
		Execulta.clicar(ele.getphaedrum9Edit());
		Execulta.clicar(ele.getphaedrum9Delete());
		Execulta.evidencia("Validação2");

	}
	
}
