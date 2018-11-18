package Exercicio1;

	import java.util.EmptyStackException;
	import javax.swing.*;
	
	class LL {
	
	    int primeiro;
	    LL perto;
	
	    public LL(int primeiro, LL perto) {
	        this.primeiro = primeiro;
	        this.perto = null;
	    }
	
	    public int getPrimeiro() {
	        return primeiro;
	    }
	
	    public void setPrimeiro(int valor) {
	        this.primeiro = primeiro;
	    }
	
	    public LL getPerto() {
	        return perto;
	    }
	
	    public void setPerto(LL perto) {
	        this.perto = perto;
	    }
	
	}
	
	