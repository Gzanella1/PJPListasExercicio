package listasJavaBasico.Lista_4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=1000;
		int i=0;
			
		while(i< 5) {
			n++; 
			if(n%11 == 5) {
				System.out.println(n);
				i++; 
			}		
		}
	}
}
