package loopex.teste.arvore;

public class Main {

	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.inserir(10);
		arvore.inserir(8);
		arvore.inserir(5);
		arvore.inserir(9);
		arvore.inserir(7);
		arvore.inserir(18);
		arvore.inserir(13);
		arvore.inserir(20);
		
		System.out.println("\n\nEm ordem");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("\n\nPre ordem");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("\n\nPos ordem");
		arvore.posOrdem(arvore.getRaiz());
	}

}
