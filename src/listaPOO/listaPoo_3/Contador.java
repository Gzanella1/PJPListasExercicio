package listaPOO.listaPoo_3;

public class Contador {
	private static int INCREMENTAR;

	public Contador() {
		INCREMENTAR++;
	}

	public void incrementar() {
		INCREMENTAR++;
	}

	public void zerar() {
		INCREMENTAR = 0 ;
	}
	
	public static int getINCREMENTAR() {
		return INCREMENTAR;
	}

	public static void main(String[] args) {
		Contador c= new Contador();
		
		c.incrementar();
		System.out.println("c: "+ c.getINCREMENTAR());
		c.zerar();
		System.out.println("c: "+ c.getINCREMENTAR());
	}

}
