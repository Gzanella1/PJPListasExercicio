package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("infome o valor A:");
		double a=in.nextDouble();
		System.out.println("infome o valor B:");
		double b=in.nextDouble();
		
		double soma= a+b;
		System.out.println("A soma é:" + soma);

	}

}
