
public class TarefaHorario extends Horario {
	// campos encapsulados de forma privada
	private String descricao;

	// construtores sobrecarregados
	public TarefaHorario() throws Exception {
		this(0, 0, "tarefa não cadastrada");
	}

	public TarefaHorario(int _horas, String _descricao) throws Exception {
		this(_horas, 0, _descricao);
	}

	public TarefaHorario(int _horas, int _minutos, String _descricao) throws Exception {
		this.setHoras(_horas);
		this.setMinutos(_minutos);
		this.setDescricao(_descricao);

	}

	// métodos get e set
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	public String getDescricao() {
		return this.descricao;
	}

	// método sobreposto toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append(" - ");
		dados.append(this.getDescricao());
		return dados.toString();
	}
}
