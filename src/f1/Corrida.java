package f1;

import java.util.Random;

public class Corrida {
	private Corredor corredor_um;
	private Corredor corredor_dois;
	private boolean marcada;
	
	public void marcarCorrida(Corredor c1, Corredor c2) {
		if(c1.getEquipe() != c2.getEquipe()) {
			System.out.println("Corrida Marcada");
			this.setMarcada(true);
			this.setCorredor_um(c1);
			this.setCorredor_dois(c2);
		} else {
			this.setMarcada(false);
			this.setCorredor_um(null);
			this.setCorredor_dois(null);
		}
	}
	
	public void correr(){
		if(this.marcada == true) {
			System.out.println("Corredor 1");
			corredor_um.apresentar();
			
			System.out.println("--------------");
			
			System.out.println("Corredor 2");
			corredor_dois.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			
			switch(vencedor) {
			case 0:
				System.out.println("Empatou");
				corredor_um.empatarCorrida();
				corredor_dois.empatarCorrida();
				break;
			case 1:
				System.out.println("O vencedor é: " + corredor_um.getNome());
				corredor_um.ganharCorrida();
				corredor_dois.perderCorrida();
				break;
			case 2: 
				System.out.println("O vencedor é: " + corredor_um.getNome());
				corredor_um.perderCorrida();
				corredor_dois.ganharCorrida();
			}
		} else {
			System.out.println("Luta não pode acontecer");
		}
			
	}
	
	public Corredor getCorredor_um() {
		return corredor_um;
	}
	public void setCorredor_um(Corredor corredor_um) {
		this.corredor_um = corredor_um;
	}
	public Corredor getCorredor_dois() {
		return corredor_dois;
	}
	public void setCorredor_dois(Corredor corredor_dois) {
		this.corredor_dois = corredor_dois;
	}
	
	public boolean getMarcada() {
		return marcada;
	}
	public void setMarcada(boolean marcada) {
		this.marcada = marcada;
	}
	
	
}
