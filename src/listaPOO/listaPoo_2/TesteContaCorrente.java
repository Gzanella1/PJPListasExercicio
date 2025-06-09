package listaPOO.listaPoo_2;

import java.util.Scanner;

public class TesteContaCorrente {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();

		ContaCorrente cc = new ContaCorrente(12, 1, 100, 1000, false);

		cc.consultar();
		cc.depositar(100);
		cc.saque(10);
		cc.consultar();

		ContaCorrente c1 = new ContaCorrente(12, 1, 100, 1000, true);

		c1.consultar();
		c1.depositar(100);
		c1.saque(10);
		c1.consultar();

	}

	// atributo com static, o atibuto é da classe e não do objeto !
	// Usando static: se eu criar um aluno com o nome giovani, quando eu criar outro
	// aluno ele tambem tera o nome giovani
	// se eu não usar static toda vez que e criar um obj ele vai ter um nome do
	// aluno diferente
}
