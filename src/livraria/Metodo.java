package livraria;

public class Metodo {
	public static void main(String[] args) {
		Pessoa pessoa[] = new Pessoa[3];
		pessoa[0] = new Pessoa("Gabriel Santana", 21, "Masculino");
		pessoa[1] = new Pessoa("Nathalia Severo", 20, "Feminino");
		pessoa[2] = new Pessoa("Neymar Jr", 30, "Masculino");
		
		Livro livro[] = new Livro[3];
		livro[0] = new Livro("Batman - A corte das corujas", "Scott Snyder", 296, 10, true, pessoa[0]);
		livro[1] = new Livro("After: 1", "Anna Todd", 528, 150, true, pessoa[1]);
		livro[2] = new Livro("Batman - O longo dias das bruxas", "Jeph Loap", 420, 263, false, pessoa[2]);
		
		System.out.println(livro[0].detalhes());
		
		System.out.println("---------------------");
		
		livro[0].avancarPag();
		livro[0].folhear(100);
		livro[0].fechar();
		
		System.out.println(livro[0].detalhes());
	}
}
