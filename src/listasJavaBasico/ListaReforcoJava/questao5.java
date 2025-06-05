package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double lucAnual=0.23;
		System.out.println("infome o valor total de vendas");
		double val=in.nextDouble();
		
		double lucro = val*lucAnual;
		System.out.println("O lucro é "+lucro);
		

	}

}
