package celular;

public class Celular implements Controlador{

	private int volume;
	private boolean ligado;
	private boolean senha;
	private int bateria;
	
	public Celular() {
		this.volume = 50;
		this.ligado = false;
		this.senha = false;
		this.bateria = 50;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getSenha() {
		return senha;
	}

	private void setSenha(boolean senha) {
		this.senha = senha;
	}
	
	private int getBateria() {
		return bateria;
	}
	
	private void setBateria(int bateria) {
		this.bateria = bateria;
	}
	
	

	@Override
	public void ligar() {
		if(this.getLigado() == false && this.getBateria() > 10) {
			System.out.println("Ligando Celular");
			this.setLigado(true);
		} else {
			System.out.println("Bateria descarregada, coloque para carregar!");
		}
		
	}

	@Override
	public void desligar() {
		if(this.getLigado() == true || this.getBateria() <= 0) {
			System.out.println("Desligando");
			this.setLigado(false);
		}
		
	}

	@Override
	public void colocarSenha() {
		this.setSenha(true);
		System.out.println("Senha correta");
	}

	@Override
	public void abrirMenu() {
		if(this.getLigado() == true || this.getSenha() == true) {
			System.out.println("Bem-vindo, ao menu do celular");
			System.out.println("Bateria: " + getBateria() + "%" );
			System.out.println("Volume: " + getVolume());
			
			for(int i = 0; i <= this.getVolume(); i++) {
				System.out.print("|");
			}
		} else {
			System.out.println("Celular desligado");
		}
	}

	@Override
	public void fecharMenu() {
		if(this.getLigado() == true) {
			System.out.println("Fechando menu");
		}
		
	}

	@Override
	public void aumentarVolume() {
		if(this.getLigado() == true && this.getVolume() < 100) {
			this.setVolume(getVolume() + 5);
			System.out.println("Volume: " + getVolume());
			
			for(int i = 0; i <= this.getVolume(); i++) {
				System.out.println("|");
			}
		}
	}

	@Override
	public void diminuirVolume() {
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(getVolume() - 5); 
			System.out.println("Volume: " + getVolume());
			
			for(int i = 0; i <= this.getVolume(); i++) {
				System.out.println("|");
			}
		}
	}
	
	
	
	
}
