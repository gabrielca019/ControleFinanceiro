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
		
		assertEquals("", despesa.getProduto());
	}
	
	@Test
	void testSetProdutoComApenasUmaLetra() {
		despesa.setProduto("P");
		
		assertEquals("P", despesa.getProduto());
	}
	
	@Test
	void testSetProdutoComVariasLetras() {
		despesa.setProduto("Produto");
		
		assertEquals("Produto", despesa.getProduto());
	}
	
	@Test
	void testSetValorMensalVazio() {
		despesa.setValorMensal(0);
		
		assertEquals(0, despesa.getValorMensal(), 1);
	}
	
	@Test
	void testSetValorMensalNegativo() {
		despesa.setValorMensal(-2);
		
		assertEquals(-2, despesa.getValorMensal(), 1);
	}
	
	@Test
	void testSetValorMensalMinimo() {
		despesa.setValorMensal(2.02);
		
		assertEquals(2.02, despesa.getValorMensal(), 1);
	}
	
	@Test
	void testSetValorMensalBaixo() {
		despesa.setValorMensal(21.12);
		
		assertEquals(21.12, despesa.getValorMensal(), 1);
	}
	
	@Test
	void testSetValorMensalAlto() {
		despesa.setValorMensal(2100.12);
		
		assertEquals(2100.12, despesa.getValorMensal(), 1);
	}
}