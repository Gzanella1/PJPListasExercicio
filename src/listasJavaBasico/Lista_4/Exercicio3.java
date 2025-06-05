package listasJavaBasico.Lista_4;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite o numero que vc deseja a tabuada: ");
		int n=in.nextInt();
		
		for(int i=1;i<= 10;i++) {
			System.out.println(n+" x "+i+" = "+n*i);
		}

	}
}
