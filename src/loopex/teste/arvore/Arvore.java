package loopex.teste.arvore;

public class Arvore {
	private Elemento raiz;

    public Arvore() {
        raiz = null;
    }

    public void inserir(Integer v){
        Elemento novo = new Elemento(v);
        novo.valor = v;
        if(raiz == null) {
        	raiz = novo;
        }else {
        	Elemento atual = raiz;
        	Elemento anterior;
        	while(true) {
        		anterior = atual;
        		if(v <= atual.valor) {
        			atual = atual.esquerdo;
        			if(atual == null) {
        				anterior.esquerdo = novo;
        				return;
        			}
        		}else {
        			atual = atual.direito;
        			if(atual == null) {
        				anterior.direito = novo;
        				return;
        			}
        		}
        	}
        }      
    }
}
