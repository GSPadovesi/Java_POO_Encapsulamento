package livraria;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;

	public String detalhes() {
		return "Livro{" + " titulo: " + getTitulo() + "\n, Autor: " + getAutor() 
		+ "\n, Total de paginas: " + getTotalPaginas() + "\n, Pagina Atual: " + getPaginaAtual()
		+ "\n, Aberto: " + getAberto() + "\n, Leitor: " + leitor.getNome() + "\n, Idade: " + leitor.getIdade()
		+ "\n, Sexo: " + leitor.getSexo(); 
	}
	
	
	public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.paginaAtual = paginaAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public int getPaginaAtual() {
		return paginaAtual;
	}

	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		System.out.println("Abrindo Livro");
		setAberto(true);
	}

	@Override
	public void fechar() {
		System.out.println("Fechando Livro");
		setAberto(false);
	}

	@Override
	public void folhear(int pagina) {
		this.paginaAtual = pagina;
		
	}

	@Override
	public void avancarPag() {
		this.setPaginaAtual(getPaginaAtual() + 1);
		
	}

	@Override
	public void voltarPag() {
		this.setPaginaAtual(getPaginaAtual() - 1);
	}
	
	
}
