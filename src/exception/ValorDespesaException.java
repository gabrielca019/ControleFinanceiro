package exception;

public class ValorDespesaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ValorDespesaException(String texto) {
		super(texto);
	}

}