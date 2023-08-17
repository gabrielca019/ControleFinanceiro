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
		this.loja = loja;
	}

	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	
}