package listasJavaBasico.Lista_5;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] a = new int[3];
		int par=0;
		
		System.out.println("Digite valores do vetor A:");
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
			if(a[i]%2 ==0 ){
				par++;
			}
		}
		
		System.out.println("Elementos do vetor A: ");
		for (int i : a) {
			System.out.println(i+ ", ");
		}
		System.out.println("Quantidade par: "+ par);
	}

}
