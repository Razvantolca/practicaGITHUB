package Exercisi;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int a,b,c;
		System.out.println("Introdueix el 1r  numero ");
		a=sc.nextInt();
		
		System.out.println("Introdueix el 2r  numero ");
		b=sc.nextInt();
		
		System.out.println("Introdueix el 3r  numero ");
		c=sc.nextInt();
		
		int sum;
		sum=a+b+c;
		
		if (sum % 2 == 0) {
			System.out.println(sum +" es parell");	
		} else {
			System.out.println(sum + "es imparell");
		}

	}

}
