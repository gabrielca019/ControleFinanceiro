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
	void testSetLojaVazio() {
		despesa.setLoja("");
		
		assertEquals("", "");
	}

	@Test
	void testSetLojaComApenasUmaLetra() {
		despesa.setLoja("L");
		
		assertEquals("L", despesa.getLoja());
	}
	
	@Test
	void testSetLojaComVariasLetras() {
		despesa.setLoja("Loja");
		
		assertEquals("Loja", despesa.getLoja());
	}

	@Test
	void testSetProdutoVazio() {
		despesa.setProduto("");
		
		assertEquals("", "");
	}
	
	@Test
	void testSetProdutoComApenasUmaLetra() {
		despesa.setProduto("P");
		
		assertEquals("P", despesa.getLoja());
	}
	
	@Test
	void testSetProdutoComVariasLetras() {
		despesa.setProduto("Produto");
		
		assertEquals("Produto", despesa.getLoja());
	}
}