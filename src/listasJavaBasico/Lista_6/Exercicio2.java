package listasJavaBasico.Lista_6;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int[][] matriz=new int[4][4];
		Random numR=new Random();
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=numR.nextInt(0,9);
			}
		}
		
		int maior=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > maior) {
					maior=matriz[i][j];
				}
			}
		}
		
		System.out.println("maior: "+ maior);
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println(); 
		}
	}

}
