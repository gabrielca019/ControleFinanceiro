package exception;

public class TextoNuloException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public TextoNuloException(String texto) {
		super(texto);
	}

}