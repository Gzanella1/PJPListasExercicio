package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// uma receita -> 48
		double acucar = 1.5;
		double manteiga = 1;
		double farina = 2.75;

		System.out.println("Quantos coockies deseja fazer: ");
		int qtdCokies = in.nextInt();

		double receita = qtdCokies / 48;
		System.out.println("RECEITA");
		System.out.println("xicara de açucar: " + acucar * receita);
		System.out.println("xicara de manteiga: " + manteiga * receita);
		System.out.println("xicara de farinha: " + farina * receita);

	}

}
