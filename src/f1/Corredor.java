package f1;

public class Corredor {
	private String nome;
	private String nacionalidade;
	private int idade;
	private String equipe;
	private String carro;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Corredor(String nome, String nacionalidade, int idade, String equipe, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.setEquipe(equipe);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public void apresentar() {
		System.out.println("Dados do lutador");
		System.out.println("Nome: " + getNome());
		System.out.println("Nacionalidade: " + getNacionalidade());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Equipe: " + getEquipe());
		System.out.println("Carro: " + getCarro());
	}
	
	public void ganharCorrida() {
		this.setVitorias(getVitorias() + 1);
	}
	
	public void perderCorrida() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarCorrida() {
		this.setEmpates(getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
		this.setCarro();
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro() {
		if(getEquipe() == "Alfa Romeo F1 Team Orlen") {
			this.carro = "C42";
		} else if(getEquipe() == "Scuderia AlphaTauri") {
			this.carro = "Monoposoto 2022";
		} else if(getEquipe() == "BWT Alpine F1 Team"){
			this.carro = "A522";
		} else if(getEquipe() == "Aston Martin Aramco Cognizant Formula One Team") {
			this.carro = "AMR21";
		} else if(getEquipe() == "Scuderia Ferrari") {
			this.carro = "F1-75";
		} else if(getEquipe() == "Haas F1 Team") {
			this.carro = " Uralkali Haas F1";
		} else if (getEquipe() == "McLaren F1 Team") {
			this.carro = "MCL36";
		} else if(getEquipe() == "Mercedes-AMG Petronas Formula One Team") {
			this.carro = "Mercedes-AMG F1 W13";
		} else if(getEquipe() == "Oracle Red Bull Racing") {
			this.carro = "RB18";
		} else if(getEquipe() == "Williams Racing") {
			this.carro = "FW44";
		} else {
			System.out.println("Equipe nao existe - Carro invalido");
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	
	
	

}