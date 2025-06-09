package listaPOO.listaPoo_2;

public class Lampada {
	private int voltagem;
	private	String cor;
	private String marca;
	private String modelo;
	
	private boolean ligada;
	public Lampada(int voltagem, String cor, String marca, String modelo) {
		this.voltagem = voltagem;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.ligada = false;
	}

	public void ligar() {
		ligada=true;
	}

	public void desligar() {
		ligada=false;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
}
