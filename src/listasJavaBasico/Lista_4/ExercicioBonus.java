package listasJavaBasico.Lista_4;

import java.util.Scanner;

public class ExercicioBonus {

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
		
		int soma=0;
		for(int i=n1;i <= n2;i++) {
			soma+=i;
		}
		System.out.println(soma);

		int[]  a= new int[0];
		
		
		
	}

}
