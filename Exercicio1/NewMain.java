/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.Scanner;


/**
 *
 * @author WEndell
 */
public class NewMain {

  public static void main(String[] args) {
                Scanner s = new Scanner(System.in);
	        int TT = 1;
	        DD d = new DD();
                System.out.println("escreva o primeiro elemento");
                int ii=s.nextInt();
	      
	        d.novo(ii);
                System.out.println("escreva a quantidade de numeros que quer inserir");
                int qq=s.nextInt();
	      
	        for (int ga = 1; ga <= qq; ga++) {
                    System.out.println("escreva un numero");
	            int nnn = s.nextInt();
	            d.novo(nnn, TT);
	            ++TT;
	        }
	        d.ImprimirC();
	
	    }
        }



