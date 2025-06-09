package c;

public class ConversaoUnidadeTempo {

	public class ConversaoDeUnidadesDeTempo {

		// RETORNA SEGUNDOS
		public static int minutosParaSegundos(int minutos) {
			return minutos * 60;
		}

		// RETORNA MINUTOS
		public static int horasParaMinutos(int horas) {
			return horas * 60;
		}

		// RETORNA HORAS
		public static int diasParaHoras(int dias) {
			return dias * 24;
		}

		// RETORNA DIAS
		public static int semanasParaDias(int semanas) {
			return semanas * 7;
		}

		// RETORNA DIAS
		public static int mesesParaDias(int meses) {
	        return meses * 30; 
	    }
		
		// RETORNA DIAS 
		public static double anosParaDias(double anos) {
			return anos * 365.25;
		}
	}
}