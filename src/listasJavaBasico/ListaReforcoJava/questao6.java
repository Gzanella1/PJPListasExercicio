package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double total = 0;	
		double imposto = 0.06;	
		
		for(int i=0;i<5;i++) {
			System.out.println("digite o valor do produto "+i);
			total+=in.nextDouble();
		}
		System.out.println("o valor total da compra é :"+ total+imposto);

	}

}
