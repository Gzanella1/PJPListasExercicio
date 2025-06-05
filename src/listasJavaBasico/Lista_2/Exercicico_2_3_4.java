package listasJavaBasico.Lista_2;

import java.util.Scanner;

public class Exercicico_2_3_4 {
	static Scanner in = new Scanner(System.in);
	
	private void psvm() {
		// TODO Auto-generated method stub

	}
	
	public static void exercicio2() {
		System.out.println("ano atual");
		int anoAtual=in.nextInt();
		System.out.println("Data do seu nasciment: ");
		int anoNascimento=in.nextInt();
		
		int idd=anoAtual-anoNascimento;
		
		System.out.println("A sua idade é : "+ idd + "anos");
	}
	
	
	public static void exercicio3() {
		System.out.println("Digite em minutos o total usado pelo cli : ");
		int totalMinclien=in.nextInt();
		
		double horas=totalMinclien/60;
		double valor= horas* 2.30;
		
		System.out.println("O valor a ser pago é: R$ "+ valor);
		
	}
	
	public static void exercicio4() {
		double vcopia=0.08*2;
		System.out.println("Digite a quantidade de folhas de um livro: ");
		int numFolha=in.nextInt();
		
		double total=numFolha*vcopia;
		System.out.println("O valor total é : "+ total);
		
	}

}















