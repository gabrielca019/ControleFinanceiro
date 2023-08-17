package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Despesa;

class DespesaTest {
	
	Despesa despesa;
	
	@BeforeEach
	void inicializar() {
		despesa = new Despesa();
	}
	
	@Test
	void testSetAtributoLojaVazio() {
		despesa.setLoja("");
		
		assertEquals("", "");
	}

	@Test
	void testSetAtributoLojaComApenasUmaLetra() {
		despesa.setLoja("L");
		
		assertEquals("L", despesa.getLoja());
	}
	
	@Test
	void testSetAtributoLojaComVariasLetras() {
		despesa.setLoja("Loja");
		
		assertEquals("Loja", despesa.getLoja());
	}
	
	

}