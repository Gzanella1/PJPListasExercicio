package listaPOO.listaPoo_2;

public class ContaCorrente {
	private int numConta;
	private int agencia;
	private double saldo;
	private double limite;
	private boolean contaEspecial;

	public ContaCorrente(int numConta, int i, double saldoInicial, double limite, boolean contaEspecial) {
		this.numConta = numConta;
		this.agencia = i;
		this.saldo = saldoInicial;
		this.limite = limite;
		this.contaEspecial = contaEspecial;
		System.out.println("Conta " + numConta + " criada com sucesso!");
	}

	public boolean saque(double valor) {
		if (this.saldo > 0 && this.saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	public void consultar() {
		System.out.println("Número da Conta: " + this.numConta);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Saldo atual: R$" + String.format("%.2f", this.saldo));
		System.out.println("Limite: R$" + String.format("%.2f", this.limite));
		System.out.println("Conta Especial: " + (this.contaEspecial ? "Sim" : "Não"));
		// cheque especial - disponivel quando o saldo acaba
		if (usandoChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		}
	}
	
	
	public boolean usandoChequeEspecial() {
        contaEspecial = true;
		return this.saldo < 0;
        
    }

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}
	
	
	
	

}
