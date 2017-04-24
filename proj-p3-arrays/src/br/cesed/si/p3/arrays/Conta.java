package br.cesed.si.p3.arrays;

public class Conta {

	private int agencia;
	private int conta;
	
	public Conta(int agencia, int conta) {
		super();
		this.agencia = agencia;
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + "]";
	}
	
	
}
