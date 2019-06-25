package agenda;

import tempo.Periodo;

/**
 * Classe que herda de ItemAgenda os campos titulo, descricao, periodo. Possui
 * um campo especifico local. Dois construtores sobrecarregados
 * 
 * @author Natália Lopes Oliveira
 *
 */
public class Evento extends ItemAgenda {
	/**
	 * local do evento
	 */
	private String local;

	/**
	 * construtor que recebe o periodo já instanciado
	 * 
	 * @param _titulo
	 *            titulo do evento
	 * @param _descricao
	 *            descricao do evento
	 * @param _periodo
	 *            periodo do evento
	 * @param _local
	 *            local do evento
	 * @throws Exception
	 *             caso o período esteja fora dos limites
	 */
	public Evento(String _titulo, String _descricao, Periodo _periodo, String _local) throws Exception {
		super(_titulo, _descricao, _periodo);
		this.setLocal(_local);
	}

	/**
	 * construtor que recebe todos os campos do periodo para ser instanciado
	 * 
	 * @param _titulo
	 *            titulo do evento
	 * @param _descricao
	 *            descricao do evento
	 * @param _dataInicio
	 *            data de inicio do evento
	 * @param _horarioInicio
	 *            horario de inicio do evento
	 * @param _dataFim
	 *            data de fim do evento
	 * @param _horarioFim
	 *            horario de fim do evento
	 * @param _local
	 *            local do evento
	 * @throws Exception
	 *             caso o período esteja fora dos limites
	 */
	public Evento(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, String _local) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setLocal(_local);
	}

	/**
	 * @param _local
	 *            local do evento
	 */
	public void setLocal(String _local) {
		this.local = _local;
	}

	/**
	 * @return string do local do evento
	 */
	public String getLocal() {
		return this.local;
	}

	/**
	 * @param _evento
	 *            recebe um evento instanciado para comparar os locais por ordem
	 *            alfabetica
	 * @return 1 se o evento que chamou o método tiver um local com ordem alfabetica
	 *         maior que o parametro, 0 se igual, -1 se menor
	 */
	public int compareTo(Evento _evento) {
		return (this.getLocal().compareToIgnoreCase(_evento.getLocal()));
	}

	/*
	 * @return string do objeto instanciado Evento
	 */
	public String toString() {
		StringBuilder evento = new StringBuilder();
		evento.append(super.toString());
		evento.append("\nLocal: ");
		evento.append(this.getLocal());
		evento.append("\n");

		return evento.toString();
	}
}
