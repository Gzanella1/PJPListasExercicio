package listasJavaBasico.Lista_6;

import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {

		int[][] matriz=new int[10][10];
		Random numR=new Random();
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=numR.nextInt(1,9);
			}
		}
		
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t"); 
			}
			System.out.println(); 
		}
		
		
		// eu fiz porem perdi pois não salvou 

		
	}

}
