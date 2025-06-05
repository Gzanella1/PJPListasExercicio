package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class questao1Idd {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Informe sua idade:");
		int anos=in.nextInt();
		double dias= (anos*365.25);
		
		System.out.println("Dias vividos: "+ dias);
	}

}
