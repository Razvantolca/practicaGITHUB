package Exercisi;

import java.util.Scanner;

public class frase {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Escriu una frase  ");
	        String frase = sc.nextLine();
	        
	        System.out.println("Escriu la lletra  ");
	        String caracter = sc.next();
	        
	        int cantidad = 0;
	        for (int i = 1; i < frase.length(); i++) {
	            if (frase.substring(i) == caracter) {
	               cantidad++; 
	            }
	        } 
	        
	        
	        			if(caracter.length() <1) {
	        				System.out.println("La longitud del caracter  ha de ser 1");
	        				
	        			}
	        			if(cantidad>1) {
	        				System.out.println("La lletra que has introduit es:  " + caracter + " aparix  " + cantidad + " vegades en la frase");
	        			} else{
	        				System.out.println("La lletra:" + caracter+ " no apareix en la frase");
	        			}
	        		
	}
}
	