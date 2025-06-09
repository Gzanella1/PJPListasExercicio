package listaPOO.listaPoo_3;

public class Calculadora {
	private int n1;
	private int n2;
	private int n;
	
	public Calculadora() {
		
	}
	
	public Calculadora(int n1, int n2, int n) {
		this.n1 = n1;
		this.n2 = n2;
		this.n = n;
	}

	public int somar() {
		return this.n1 + this.n2;
	}

	public int subtrair() {
		return this.n1 - this.n2;

	}

	public int multiplicar() {
		return this.n1 * this.n2;
	}

	public double dividir() {
		return this.n1 / this.n2;

	}
	
	public double elevaPotencia() {
		double v=1;
		for (int i = 0; i < this.n; i++) {
			v*=this.n1;
		}
		return v;
	}
	
	

	public static void main(String[] args) {
		Calculadora c= new Calculadora(2,5,2);

		System.out.println(c.somar());
		System.out.println(c.subtrair());
		System.out.println(c.multiplicar());
		System.out.println(c.dividir());
		System.out.println(c.elevaPotencia());
	}
}
