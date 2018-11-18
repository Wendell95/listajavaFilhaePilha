
package Exercicio1;

import java.util.EmptyStackException;

   public class DD {
	
	    private String g = "";
	    private LL um;
	    private int m;
	
	    public DD() {
	        this.um = null;
	        this.m = 0;
	    }
	
	    public DD(DD c) {
	        um = c.getUm();
	        m = c.getM();
	    }
	
	    public LL getUm() {
	        return um;
	    }
	
	    public int getM() {
	        return m;
	    }
	
	    public boolean listagem() {
	        if (getM() == 0) {
	            return true;
	        }
	        return false;
	    }
	
	    public void ImprimirC() {
	        LL pp = um;
	        while (pp != null) {
	            g += Integer.toString(pp.primeiro) + "-";
	            
	            pp = pp.perto;
	        }
	               System.out.println(g);
	    }
	
	    public void Imprimir2() {
	        for (LL pp = um; pp != null; pp = pp.perto) {
	            g += Integer.toString(pp.primeiro) + "-";
	        }
	               System.out.println(g);
	
	    }
	
	    public int VE(int primeiro) {
	        int TT = 0;
	        LL pp;
	        for (pp = um; pp != null && pp.primeiro != primeiro; pp = pp.perto) {
	            TT++;
	        }
	        if (pp == null) {
	           TT = -1;
	        }
	        return TT;
	    }
	
	    public void novo(int primeiro) { 
	        um = new LL(primeiro, um);
	        m++;
	        g += Integer.toString(primeiro) + "-";
	    }
	
	    public void novo(int primeiro, int TT) { 
	        if (TT == 0) {
	            um = new LL(primeiro, um);
	        } else {
	            LL pp = um;
	            for (int x = 0; x < TT - 1; x++) {
	                pp = pp.perto;
	            }
	            pp.perto = new LL(primeiro, um.perto);
	        }
	        m++;
	    }
	
	    public void Ex() { 
	        um = um.perto;
	        m--;
	    }
	
	    public void Exe2(int TT) throws EmptyStackException {
	        if (listagem()) {
	            throw new EmptyStackException();
	        }
	        if (TT == 0) {
	            um = um.perto;
	        } else {
	            LL pp= um;
	            for (int x = 0; x < TT - 1; x++) {
	                pp = pp.perto;
	            }
	            pp.perto = pp.perto.perto;
	        }
	        m--;
	    }
	
	    public int returne (int TT) {
	        LL pp = um;
	        for (int x = 0; x < TT - 1; x++) {
	            pp = pp.perto;
	        }
	        return pp.primeiro;
	    }
	
	    public void olhar() {
	               System.out.println(g);
	
	    }
	
	}
	
	

