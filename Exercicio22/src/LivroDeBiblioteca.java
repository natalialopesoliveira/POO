
public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
	private StatusEmprestimo statusEmprestimo;
	private String localizacao;
	private String descricao;

	// construtores sobrecarregados
	public LivroDeBiblioteca() {
		this("", "", 0, 0, StatusEmprestimo.DEVOLVIDO, "", "");
	}

	public LivroDeBiblioteca(String _titulo, String _autor, int _numeroPaginas, int _anoEdicao,
			StatusEmprestimo statusEmprestimo, String localizacao, String descricao) {
		super(_titulo, _autor, _numeroPaginas, _anoEdicao);
		this.statusEmprestimo = statusEmprestimo;
		this.localizacao = localizacao;
		this.descricao = descricao;
	}

	// métodos interface set e get
	public void setStatusEmprestimo(StatusEmprestimo _statusEmprestimo) {
		this.statusEmprestimo = _statusEmprestimo;
	}

	public void setLocalizacao(String _localizacao) {
		this.localizacao = _localizacao;
	}

	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	public StatusEmprestimo getStatusEmprestimo() {
		return this.statusEmprestimo;
	}

	public String getLocalizacao() {
		return this.localizacao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	// métodos
	public boolean isEmprestado() {
		if (this.statusEmprestimo == StatusEmprestimo.EMPRESTADO)
			return true;
		else
			return false;
	}

	public void empresta() {
		this.statusEmprestimo = StatusEmprestimo.EMPRESTADO;
	}

	public void devolve() {
		this.statusEmprestimo = StatusEmprestimo.DEVOLVIDO;
	}

	public String localiza() {
		if (this.statusEmprestimo == StatusEmprestimo.EMPRESTADO)
			return "Emprestado";
		return this.localizacao;
	}

	public String apresentaDescricao() {
		return this.getDescricao();
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nStatus do Empréstimo: ");
		dados.append(this.getStatusEmprestimo());
		dados.append("\nLocalização: ");
		dados.append(this.getLocalizacao());
		dados.append("\nDescrição: ");
		dados.append(this.getLocalizacao());
		return dados.toString();
	}
}
