package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import exception.TextoNuloException;
import exception.ValorDespesaException;
import model.Despesa;

@DisplayName("Classe de teste: Despesa")
class DespesaTest {
	
	Despesa despesa;
	
	@BeforeEach
	void inicializar() {
		despesa = new Despesa();
	}
	
	@Test
	@DisplayName("Exception: campo loja vazio")
	void testSetLojaVazio() {
		assertThrows(TextoNuloException.class, () -> despesa.setLoja(""));
	}

	@Test
	@DisplayName("Setando Loja para String de apenas uma letra")
	void testSetLojaComApenasUmaLetra() {
		despesa.setLoja("L");
		
		assertEquals("L", despesa.getLoja());
	}
	
	@Test
	@DisplayName("Setando Loja para String de várias letras")
	void testSetLojaComVariasLetras() {
		despesa.setLoja("Loja");
		
		assertEquals("Loja", despesa.getLoja());
	}

	@Test
	@DisplayName("Exception: campo produto vazio")
	void testSetProdutoVazio() {
		assertThrows(TextoNuloException.class, () -> despesa.setProduto(""));
	}
	
	@Test
	@DisplayName("Setando Produto para String de apenas uma letra")
	void testSetProdutoComApenasUmaLetra() {
		despesa.setProduto("P");
		
		assertEquals("P", despesa.getProduto());
	}
	
	@Test
	@DisplayName("Setando Produto para String de várias letras")
	void testSetProdutoComVariasLetras() {
		despesa.setProduto("Produto");
		
		assertEquals("Produto", despesa.getProduto());
	}
	
	@Test
	@DisplayName("Exception: ValorMensal igual a zero")
	void testSetValorMensalVazio() {

		assertThrows(ValorDespesaException.class, () -> despesa.setValorMensal(0));
	}
	
	@Test
	@DisplayName("Exception: ValorMensal é negativo")
	void testSetValorMensalNegativo() {
		assertThrows(ValorDespesaException.class, () -> despesa.setValorMensal(-2));
	}
	
	@Test
	@DisplayName("Setando ValorMensal para o valor mínimo de R$ 0,01")
	void testSetValorMensalMinimo() {
		despesa.setValorMensal(0.01);
		
		assertEquals(0.01, despesa.getValorMensal(), 1);
	}
	
	@Test
	@DisplayName("Setando ValorMensal para um valor baixo")
	void testSetValorMensalBaixo() {
		despesa.setValorMensal(21.12);
		
		assertEquals(21.12, despesa.getValorMensal(), 1);
	}
	
	@Test
	@DisplayName("Setando ValorMensal para um valor alto")
	void testSetValorMensalAlto() {
		despesa.setValorMensal(2100.12);
		
		assertEquals(2100.12, despesa.getValorMensal(), 1);
	}
}