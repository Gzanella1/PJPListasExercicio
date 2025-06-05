package listasJavaBasico.Lista_6;

public class Exercicio1 {

	public static void main(String[] args) {
		double[][] a = { { -1, -2, -3 }, { 1, 2, 3 }, { 0, 0, 0 }, { 0, 0, 0 } };

		double positivo = 0;
		double negativo = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] >= 0) {
					positivo += a[i][j];
				} else {
					negativo += a[i][j];
				}
			}
		}

		System.out.println("Soma dos positivos: " + positivo);
		System.out.println("Soma dos negativos: " + negativo);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t"); // "\t" para tabulação
			}
			System.out.println(); // quebra de linha ao fim de cada linha
		}
	}

}
