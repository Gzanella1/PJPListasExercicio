package listasJavaBasico.Lista_5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] a = new int[3];
		int soma = 0;

		System.out.println("Digite valores do vetor A:");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
			if (a[i] % 5 == 0) {
				soma+=a[i];
			}
		}
		System.out.println("Vetor A: ");
		for(int aa: a) {
			System.out.print(aa+", ");
		}
		System.out.println("\nSoma: "+soma);
		

	}

}
