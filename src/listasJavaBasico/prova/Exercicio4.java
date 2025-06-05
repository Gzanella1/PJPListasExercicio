package listasJavaBasico.prova;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in=  new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome=in.next();
		
		System.out.println("Digite a idade: ");
		int idd=in.nextInt();

		int dias=idd*365;
		
		System.out.println("viveu "+dias+ " dias");
	}

}
