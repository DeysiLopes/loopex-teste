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

    public boolean remover(T valor){
        Elemento<T> atual = this.raiz;
        Elemento<T> paiAtual = null;
        while(atual != null){
            if (atual.getValor().equals(valor)){
                break;                
            }else if (valor.compareTo(atual.getValor()) == -1){ 
                paiAtual = atual;
                atual = atual.getEsquerdo();
            }else{
                paiAtual = atual;
                atual = atual.getDireito();
            }
        }
        
        if (atual != null){
            
            
            if (atual.getDireito() != null){
                
                Elemento<T> substituto = atual.getDireito();
                Elemento<T> paiSubstituto = atual;
                while(substituto.getEsquerdo() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getEsquerdo();
                }
                substituto.setEsquerdo(atual.getEsquerdo());
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ //atual < paiAtual
                        paiAtual.setEsquerdo(substituto);
                    }else{
                        paiAtual.setDireito(substituto);
                    }
                }else{ 
                    this.raiz = substituto;
                    paiSubstituto.setEsquerdo(null);
                    this.raiz.setDireito(paiSubstituto);
                    this.raiz.setEsquerdo(atual.getEsquerdo());
                }
                
              
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ //substituto < paiSubstituto
                    paiSubstituto.setEsquerdo(null);
                }else{
                    paiSubstituto.setDireito(null);
                }
                
            }else if (atual.getEsquerdo() != null){ 
                Elemento<T> substituto = atual.getEsquerdo();
                Elemento<T> paiSubstituto = atual;
                while(substituto.getDireito() != null){
                    paiSubstituto = substituto;
                    substituto = substituto.getDireito();
                }
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){
                        paiAtual.setEsquerdo(substituto);
                    }else{
                        paiAtual.setDireito(substituto);
                    }
                }else{ 
                    this.raiz = substituto;
                }
                
               
                if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1){ 
                    paiSubstituto.setEsquerdo(null);
                }else{
                    paiSubstituto.setDireito(null);
                }
            }else{
                if (paiAtual != null){
                    if (atual.getValor().compareTo(paiAtual.getValor()) == -1){ 
                        paiAtual.setEsquerdo(null);
                    }else{
                        paiAtual.setDireito(null);
                    }
                }else{ 
                    this.raiz = null;
                }
            }
            
            return true;
        }else{
            return false;
        }        
    }
    
}
