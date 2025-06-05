package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("infome o valor A:");
		double a=in.nextDouble();
		
		
		System.out.println("infome o valor B:");
		double b=in.nextDouble();
		System.out.println("infome o valor C:");
		double c=in.nextDouble();
		
		
		double soma=a+b;
		double mult=b+c;
		
		double prod=soma*mult;
		System.out.println("O produto é "+ prod);
		

	}

}
