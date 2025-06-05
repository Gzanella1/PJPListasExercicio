package listasJavaBasico.prova;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner in=  new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura=in.nextDouble();
		
		double peso=(72.7*altura)-58;
		
		System.out.println("O peso ideal é : "+ peso);

	}

}

