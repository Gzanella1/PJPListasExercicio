package listasJavaBasico.Lista_2;

import java.util.Scanner;

public class Exercicio1 {
	static Scanner in=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		exercicio1Qestao2();
	}
	
	
	public static void exercicio1Qestao1() {
		int valor1, valor2;
		System.out.println("valor 1: ");
		valor1=in.nextInt();
		System.out.println("valor 1: ");
		valor2=in.nextInt();
		
		int dif=valor1-valor2;
		System.out.println("diferença:"+dif);
		
	}
	
	public static void exercicio1Qestao2() {
		double saldo, reajuste;
		reajuste =0.1;
		System.out.println("saldo");
		saldo=in.nextDouble();
		saldo += (saldo * reajuste);
		System.out.println("o valor reajustado é :"+ saldo);
	
	}
	
	public static void exercicio1Qestao3() {
		double media1= (8 + 9 + 7) / 3;
		double media2= (4 + 5 + 6) / 3;
		
		double mediaF=(media1+media2)/2;
		
		System.out.println("Média 1: "+media1);
		System.out.println("Média 2: "+ media2);
		System.out.println("Média Final: "+ mediaF);
		
	}
	
	
	public static void exercicio1Qestao4() {
		System.out.println("valor 1:");
		double valor1=in.nextInt();
		System.out.println("valor 2:");
		double valor2=in.nextInt();
		
		double soma= valor1=valor2;
		double dobroSoma= soma*2;
		System.out.println(soma);	
		System.out.println(dobroSoma);
		
	}





}





















