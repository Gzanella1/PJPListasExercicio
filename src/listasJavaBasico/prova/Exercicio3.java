package listasJavaBasico.prova;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in=  new Scanner(System.in);
		
		System.out.println("Digite a receita: ");
		double receita=in.nextDouble();
		
		System.out.println("Digite as despesas: ");
		double despesas=in.nextDouble();
		
		double lucro=receita-despesas;
		double percentual=(despesas/receita)*100;
		
		System.out.println("lucro: "+lucro);
		System.out.println("Percentual: "+percentual);

	}

}

