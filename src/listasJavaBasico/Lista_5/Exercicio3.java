package listasJavaBasico.Lista_5;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[2];
		int[] b = new int[2];
		int[] c = new int[2];

		System.out.println("informe o vetor A: ");
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		System.out.println("informe o vetor B: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = in.nextInt();
		}

		// Ajuste vetor C
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println("Soma da posição " + i + ":" + c[i]);
			c[i] = a[i] - b[i];
			System.out.println("Subtração da posição " + i + ":" + c[i]);
			c[i] = a[i] * b[i];
			System.out.println("Multiplicação da posição " + i + ":" + c[i]);
			c[i] = a[i] / b[i];
			System.out.println("Divisão da posição " + i + ":" + c[i]);
		}

		System.out.print("Vetor A: ");
		for (int i : a) {
			System.out.print(i+", ");
		}

		for (int i : b) {
			System.out.print(i+", ");
		}

	}
}
