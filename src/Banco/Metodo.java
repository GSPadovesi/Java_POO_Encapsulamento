package Banco;

public class Metodo {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		
		Cliente junior = new Cliente();
		
		conta.depositar(1000);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		System.out.println("-----------------");
		
		//conta.sacar(2000);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		System.out.println("-----------------");
		
		conta2.depositar(500);
		System.out.println("Saldo da conta2: " + conta2.getSaldo());
		
		System.out.println("-----------------");
		
		conta.transferir(300, conta2);
		System.out.println("Saldo da conta: " + conta.getSaldo());
		System.out.println("Saldo da conta2: " + conta2.getSaldo());
		
		
		junior.setPessoa("junior Souza Santana");
		
		System.out.println(junior.getPessoa());
		
		conta2.setTitular(junior);
		
		conta2.sacar(200);
		System.out.println("Saldo da conta2: " + conta2.getSaldo());
		
		System.out.println(conta2.getTitular());
				
	}
}
