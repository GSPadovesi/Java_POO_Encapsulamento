package encapsulamento;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false; 
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	//Métodos abstratos

	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado()) {
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta com volume? " + this.getTocando());
		System.out.println("Volume: " + getVolume());
		
		for(int i = 0; i <= this.getVolume(); i+=10) {
			System.out.println("[]");
		}
	 } else {
		 System.out.println("A tv não esta ligada, impossivel abrir menu");
	 }
	}

	@Override
	public void fecharMenu() {
		if(this.getLigado())
		System.out.println("Fechando menu");
	}

	@Override
	public void maisVolume() {
		if(this.getLigado()) {
			this.setVolume(getVolume() + 1);
		}
	}

	@Override
	public void menosVolume() {
		if(this.getLigado()) {
			this.setVolume(getVolume() - 1);
		}
	}

	@Override
	public void ligarMudo() {
		if(this.getLigado() && this.getVolume() > 0) {
			setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if(this.getLigado() && this.getVolume() == 0) {
			setVolume(50);
		}
	}

	@Override
	public void play() {
		if(this.getLigado() && !(this.getTocando())) {
			setTocando(true);
		}
	}

	@Override
	public void pause() {
		if(this.getLigado() && this.getTocando()) {
			setTocando(false);
		}
	}
	
	
	
}
