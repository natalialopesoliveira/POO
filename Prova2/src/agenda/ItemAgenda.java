package agenda;

import java.io.Serializable;

import tempo.Data;
import tempo.Horario;
import tempo.Periodo;

/**
 * Classe abstrata representando os itens de agenda
 * @author Natália Lopes Oliveira
 *
 */
public abstract class ItemAgenda implements Serializable {
	/**
	 * titulo do item
	 */
	/**
	 * descricao do item
	 */
	private String titulo, descricao;
	/**
	 * periodo do item
	 */
	private Periodo periodo;

	/**
	 * @param _titulo titulo do item
	 * @param _descricao descricao do item
	 * @param _periodo periodo do item
	 * @throws Exception caso o periodo esteja incorreto
	 */
	public ItemAgenda(String _titulo, String _descricao, Periodo _periodo) throws Exception {
		this.setTitulo(_titulo);
		this.setDescricao(_descricao);
		this.setPeriodo(_periodo);
	}

	/**
	 * @param _titulo titulo do item
	 * @param _descricao descricao do item
	 * @param _dataInicio data de inicio do item
	 * @param _horarioInicio horario de inicio do item
	 * @param _dataFim data do fim do item
	 * @param _horarioFim horario do fim do item
	 * @throws Exception caso o periodo esteja incorreto
	 */
	public ItemAgenda(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim) throws Exception {
		this(_titulo, _descricao, new Periodo(new Data(_dataInicio), new Horario(_horarioInicio), new Data(_dataFim),
				new Horario(_horarioFim)));

	}

	/**
	 * @param _titulo titulo do item
	 */
	public void setTitulo(String _titulo) {
		this.titulo = _titulo;
	}

	/**
	 * @param _descricao descricao do item
	 */
	public void setDescricao(String _descricao) {
		this.descricao = _descricao;
	}

	/**
	 * @param _periodo periodo do item
	 */
	public void setPeriodo(Periodo _periodo) {
		this.periodo = _periodo;
	}

	/**
	 * @return titulo do item
	 */
	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * @return descricao do item
	 */
	public String getDescricao() {
		return this.descricao;
	}

	/**
	 * @return periodo do item
	 */
	public Periodo getPeriodo() {
		return this.periodo;
	}

	/* 
	 * @return string representando o item de agenda
	 */
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
