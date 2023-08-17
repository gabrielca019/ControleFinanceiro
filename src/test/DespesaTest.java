package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exception.TextoNuloException;
import exception.ValorDespesaException;
import model.Despesa;

class DespesaTest {
	
	Despesa despesa;
	
	@BeforeEach
	void inicializar() {
		despesa = new Despesa();
	}
	
	@Test
	void testSetLojaVazio() {
		assertThrows(TextoNuloException.class, () -> despesa.setLoja(""));
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
		assertThrows(TextoNuloException.class, () -> despesa.setProduto(""));
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

		assertThrows(ValorDespesaException.class, () -> despesa.setValorMensal(0));
	}
	
	@Test
	void testSetValorMensalNegativo() {
		assertThrows(ValorDespesaException.class, () -> despesa.setValorMensal(-2));
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