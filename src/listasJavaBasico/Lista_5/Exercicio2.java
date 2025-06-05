package listasJavaBasico.Lista_5;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i]*i;
			c[i]=a[i]%2;
		}
		
		System.out.println("Vetor A:");
		for (int i : a) {
			System.out.println(i+ ", ");
		}
		
		System.out.println("Vetor B:");
		for (int i : b) {
			System.out.println(i+ ", ");
		}
		
		System.out.println("Vetor C:");
		for (int i : c) {
			System.out.println(i+ ", ");
		}
		
	}

}
