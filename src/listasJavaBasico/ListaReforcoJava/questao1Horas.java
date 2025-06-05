package listasJavaBasico.ListaReforcoJava;

import java.util.Scanner;

public class questao1Horas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite a hora");
		int entrada=in.nextInt();
		double h =entrada;
		double m= (entrada % 3600)*60;
		double s= (entrada % 3600)*60*60;
		
		System.out.println(h +" horas, são : "+m+" minutos, e : "+s+ " segundos");
	}

}
