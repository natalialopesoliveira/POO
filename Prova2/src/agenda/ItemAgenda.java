package agenda;
import tempo.Data;
import tempo.Horario;
import tempo.Periodo;

public abstract class ItemAgenda {
	private String titulo, descricao;
	private Periodo periodo;

	public ItemAgenda(String _titulo, String _descricao, Periodo _periodo) throws Exception {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
	}

	public ItemAgenda(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim) throws Exception {
		this(_titulo, _descricao, new Periodo(new Data(_dataInicio), new Horario(_horarioInicio), new Data(_dataFim),
				new Horario(_horarioFim)));

	}

	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}

	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public Periodo getPeriodo() {
		return this.periodo;
	}

	public String toString() {
		StringBuilder itemAgenda = new StringBuilder();

		itemAgenda.append("\nTítulo: ");
		itemAgenda.append(this.getTitulo());
		itemAgenda.append("\nDescrição: ");
		itemAgenda.append(this.getDescricao());
		itemAgenda.append("\nPeríodo: ");
		itemAgenda.append(this.getPeriodo().toString());

		return itemAgenda.toString();
	}
}
