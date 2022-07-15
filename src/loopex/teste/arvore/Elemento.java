package loopex.teste.arvore;

public class Elemento<T> {
	private T valor;
	private Elemento<T> direito;
	private Elemento<T> esquerdo;
	
	public Elemento(T valor) {
		this.valor = valor;
		this.direito = null;
		this.esquerdo = null;
	}
	
	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	
	
	public Elemento<T> getDireito() {
		return direito;
	}

	public void setDireito(Elemento<T> direito) {
		this.direito = direito;
	}

	public Elemento<T> getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(Elemento<T> esquerdo) {
		this.esquerdo = esquerdo;
	}

}
