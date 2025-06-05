package listasJavaBasico.Lista_5;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] a= new int[15];
		int[] b= new int[15];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("digite os valores: ");
			a[i]=in.nextInt();
			b[i]=a[i]*a[i];
		}
		System.out.println("Vetor A: ");
		for(int aa: a) {
			System.out.print(aa+", ");
		}
		System.out.println('\n'+"Vetor B:");
		for(int bb: b) {
			System.out.print(bb+", ");
		}
		
	}

}
