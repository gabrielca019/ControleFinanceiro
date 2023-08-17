package model;

import exception.TextoNuloException;
import exception.ValorDespesaException;

public class Despesa {
	
	private String loja;
	private String produto;
	private double valorMensal;
	
	public Despesa() {}
	
	public Despesa(String loja, String produto, double valorMensal) {
		super();
		this.loja = loja;
		this.produto = produto;
		this.valorMensal = valorMensal;
	}

	public String getLoja() {
		return loja;
	}
	public void setLoja(String loja) {
		if(loja.equals("") || loja.equals(null))
			throw new TextoNuloException("Erro! O nome da loja está vazio!");
		
		this.loja = loja;
	}

	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		if(produto.equals("") || produto.equals(null))
			throw new TextoNuloException("Erro! O nome do produto está vazio!");
		
		this.produto = produto;
	}

	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		if(valorMensal <= 0)
			throw new ValorDespesaException("Erro! A despesa deve ter um valor maior que zero!");
		
		this.valorMensal = valorMensal;
	}
	
}