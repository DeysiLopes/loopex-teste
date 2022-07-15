package loopex.teste.arvore;

public class Arvore<T extends Comparable> {
	private Elemento<T> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void inserir(T v){
        	Elemento<T> novo = new Elemento<T>(v);
        	if(raiz == null) {
        		this.raiz = novo;
        	}else {
        		Elemento<T> atual = this.raiz;
        		while(true) {
        			if(novo.getValor().compareTo(atual.getValor()) == -1) {
        				if(atual.getEsquerdo() != null) {
        					atual = atual.getEsquerdo();
        				}else {
        					atual.setEsquerdo(novo);
        					break;
        				}//insere a esquerda
        			}else {
        				if(atual.getDireito() != null) {
        					atual = atual.getDireito();
        				}else {
        					atual.setDireito(novo);
        					break;
        				}//insere a direta
        			}
        		}
        	}
        }//termina inserir elemento 
    
    
    public Elemento<T> getRaiz() {
		return raiz;
	}
    
    
    public void emOrdem(Elemento<T> atual) {
    	if(atual != null) {
	    	emOrdem(atual.getEsquerdo());
	    	System.out.println(atual.getValor());
	    	emOrdem(atual.getDireito());
    	}
    }
    public void preOrdem(Elemento<T> atual) {
    	if(atual != null) {
    		System.out.println(atual.getValor());
	    	preOrdem(atual.getEsquerdo());
	    	preOrdem(atual.getDireito());
    	}
    }

    public void posOrdem(Elemento<T> atual) {
    	if(atual != null) {
    		posOrdem(atual.getEsquerdo());
	    	posOrdem(atual.getDireito());
	    	System.out.println(atual.getValor());
    	}
    }

    
}
