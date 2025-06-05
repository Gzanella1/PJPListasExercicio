package listasJavaBasico.Lista_1;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		exercicio06();
	}
	
	public static void exercicio06() {
		Scanner in = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = in.nextLine();
		System.out.println("telefone: ");
		int telefone=in.nextInt();

		System.out.println("Endereço: ");
		String endereco= in.nextLine();
		System.out.println("cpf: ");
		String cpf= in.nextLine();
		System.out.println("Data nascimento: ");
		String dataNasc= in.nextLine(); 
		System.out.println("Escolaridade: ");
		String escolaridade= in.nextLine();
		System.out.println("Curso: ");
		String curso= in.nextLine();
		

		System.out.println("Nome: "+nome);
		System.out.println("Endereço: "+endereco);
		System.out.println("cpf: "+cpf);
		System.out.println("Data nascimento: "+dataNasc);
		System.out.println("Escolaridade: "+escolaridade);
		System.out.println("Curso: "+curso);
		
	}
	
	public static void exercicio07() {
		
		Scanner in = new Scanner(System.in);

		
		System.out.println("Digite o nome do cliente: ");
		String nome = in.nextLine();
		System.out.println("Qtd de hot dog (1,00): ");
		int hotDog=in.nextInt();
		System.out.println("Qtd de Hamburguer(1,30):");
		int hamburguer=in.nextInt();
		System.out.println("Qtd e chessburguer (1.00): ");
		int chess=in.nextInt();
		System.out.println("Qtd de refrigerante(1,00): ");
		int refri= in.nextInt();
		System.out.println("Qtd de batatas fritas(0,80): ");
		int batatas=in.nextInt();
		
		
		System.out.println("--- MENU ---");

		System.out.println("Cliente:"+nome);
		System.out.println("hot dog: "+hotDog);
		System.out.println("hamburguer:"+hamburguer);
		System.out.println("Chessburguer:"+chess);
		System.out.println("refi: "+refri);
		System.out.println("batata frita: "+batatas);

	
	}
	
}








