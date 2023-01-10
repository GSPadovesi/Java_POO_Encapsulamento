package encapsulamento;

public class Metodo {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		controle.ligar();
		controle.maisVolume();
		//controle.ligarMudo();
		controle.abrirMenu();
		controle.fecharMenu();
	}
}
