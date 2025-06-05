package listasJavaBasico.Lista_4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean condicao=true;
		while(condicao) {
			System.out.println("infome o codigo: ");
			int codigo=in.nextInt();
			System.out.println("infome o senha: ");
			int senha=in.nextInt();
			
			if(codigo != senha) {
				System.out.println("Seu codigo é: "+codigo);
				System.out.println("Sua senha é: "+senha);
				condicao=false;
			}
			else {
				System.out.println("Codigo igual a senha!!");
			}
			
		}
	}
}
