package Banco;

public class Conta implements Controle{
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	@Override
	public void depositar(double valor) {
		if(valor <= 1000) {
		this.setSaldo(valor);
		} else {
			System.out.println("Valor para deposito ultrapassou o limite diario");
		}
	}
	@Override
	public void sacar(double valor) {
		if(this.getSaldo() >= valor) {
		this.setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Saldo insuficente");
		}
	}
	@Override
	public void transferir(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.setSaldo(getSaldo() - valor);
			destino.depositar(valor);
		}
	}
	
	
}
