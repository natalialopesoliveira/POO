
public class TarefaHorarioDuracao extends TarefaHorario {
	// campos encapsulados de forma privada
	private int duracao;

	// construtores sobrecarregados
	public TarefaHorarioDuracao() throws Exception {
		super();
		this.setDuracao(0);
	}

	public TarefaHorarioDuracao(int _horas, int _minutos, String _descricao, int _duracao) throws Exception {
		super(_horas, _minutos, _descricao);
		this.setDuracao(_duracao);
	}

	// métodos get e set
	public void setDuracao(int _duracao) throws Exception {
		this.duracao = _duracao;
	}

	public int getDuracao() {
		return this.duracao;
	}

	// método sobreposto toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" (");
		dados.append(this.getDuracao());
		dados.append(" min)");
		return dados.toString();
	}
}
