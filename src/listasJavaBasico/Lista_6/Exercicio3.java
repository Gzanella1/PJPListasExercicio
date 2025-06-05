package listasJavaBasico.Lista_6;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("digite o valor da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = in.nextInt();
			}
		}

		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println(); 
		}

		int qtdPar = 0;
		int qtdImpar = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					qtdPar++;
				} else {
					qtdImpar++;
				}
			}
		}
		
		System.out.println("quantidade par: "+qtdPar);
		System.out.println("quantidade impar: "+qtdImpar);

		
		
		
	}

}
