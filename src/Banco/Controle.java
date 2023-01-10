package Banco;

public interface Controle {
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	public abstract void transferir(double valor, Conta destino);
}
