package listasJavaBasico.Lista_4;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite o num 1:");
		int n1=in.nextInt();
		System.out.println("digite o num 2");
		int n2=in.nextInt();
		
		while(n2 < n1) {
			System.out.println("digite o num 2");
			n2=in.nextInt();
		}
		
		for(int i=n1;i <= n2;i++) {
			System.out.println(i);
		}
	}
}
