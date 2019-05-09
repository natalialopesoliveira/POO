
public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int anoEdicao;
	
	//construtores sobrecarregados
	public Livro() {
		this("","",0,0);
	}
	
	public Livro(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao) {
		this.setTitulo(_titulo);
		this.setAutor(_autor);
		this.setNumeroPaginas(_numeroPaginas);
		this.setAnoEdicao(_anoEdicao);
	}
	
	//interface get e set
	void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}

	void setAutor(String _autor) {
		this.autor = _autor;
	}
	
	void setNumeroPaginas(int _numeroPaginas) {
		this.numeroPaginas = _numeroPaginas;
	}
	
	void setAnoEdicao(int _anoEdicao) {
		this.anoEdicao = _anoEdicao;
	}
	
	String getTitulo() {
		return this.titulo;
	}
	
	String getAutor() {
		return this.autor;
	}
	
	int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	
	int getAnoEdicao() {
		return this.anoEdicao;
	}
	
	public String ToString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Título: ");
		dados.append(this.getTitulo());
		dados.append("\nAutor: ");
		dados.append(this.getAutor());
		dados.append("\nNúmero de páginas: ");
		dados.append(this.getNumeroPaginas());
		dados.append("\nAno de Edição: ");
		dados.append(this.getAnoEdicao());
		return dados.toString();
	}
}
