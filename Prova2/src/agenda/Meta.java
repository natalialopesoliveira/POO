package agenda;

import tempo.Periodo;

/**
 * Classe que é um ItemAgenda com um campo a mais. Possui dois construtores
 * sobrecarregados e o método compareTo.
 * 
 * @author Natália Lopes Oliveira
 *
 */
public class Meta extends ItemAgenda {
	/**
	 * representa a prioridade da meta (URGENTE ALTA NORMAL BAIXA MINIMA)
	 */
	private Prioridade prioridade;

	/**
	 * Construtor que recebe os parâmetros, com o diferencial de o período já
	 * instanciado
	 * 
	 * @param _titulo
	 *            titulo da meta
	 * @param _descricao
	 *            descricao da meta
	 * @param _periodo
	 *            periodo da meta
	 * @param _prioridade
	 *            prioridade da meta
	 * @throws Exception
	 *             caso o periodo esteja errado
	 */
	public Meta(String _titulo, String _descricao, Periodo _periodo, Prioridade _prioridade) throws Exception {
		super(_titulo, _descricao, _periodo);
		this.setPrioridade(_prioridade);
	}

	/**
	 * @param _titulo
	 *            titulo titulo da meta
	 * @param _descricao
	 *            descricao da meta
	 * @param _dataInicio
	 *            data inicio da meta string
	 * @param _horarioInicio
	 *            horario inicio da meta string
	 * @param _dataFim
	 *            data fim da meta string
	 * @param _horarioFim
	 *            horario fim da meta string
	 * @param _prioridade
	 *            prioridade da meta
	 * @throws Exception
	 *             caso o periodo esteja errado
	 */
	public Meta(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, Prioridade _prioridade) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setPrioridade(_prioridade);
	}

	/**
	 * @param _prioridade
	 *            prioridade da meta
	 */
	public void setPrioridade(Prioridade _prioridade) {
		this.prioridade = _prioridade;
	}

	/**
	 * @return prioridade da meta
	 */
	public Prioridade getPrioridade() {
		return this.prioridade;
	}

	/**
	 * @param _meta
	 * @return int 1 se a Meta que chamou for maior que a do parâmetro, 0 se igual,
	 *         -1 se menor
	 */
	public int compareTo(Meta _meta) {
		if (this.getPrioridade() == Prioridade.URGENTE) {
			if (_meta.getPrioridade() == Prioridade.URGENTE)
				return 0;
			return 1;
		} else if (this.getPrioridade() == Prioridade.ALTA) {
			if (_meta.getPrioridade() == Prioridade.ALTA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.URGENTE)
				return -1;
			return 1;
		} else if (this.getPrioridade() == Prioridade.NORMAL) {
			if (_meta.getPrioridade() == Prioridade.NORMAL)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.ALTA || _meta.getPrioridade() == Prioridade.URGENTE)
				return -1;
			return 1;
		} else if (this.getPrioridade() == Prioridade.BAIXA) {
			if (_meta.getPrioridade() == Prioridade.BAIXA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.MINIMA)
				return 1;
			return -1;
		} else if (this.getPrioridade() == Prioridade.MINIMA) {
			if (_meta.getPrioridade() == Prioridade.MINIMA)
				return 0;
			return -1;
		}
		return -1;
	}

	/*
	 * método toString sobrecarregado
	 * 
	 * @return string representando a meta
	 */
	public String toString() {
		StringBuilder meta = new StringBuilder();
		meta.append(super.toString());
		meta.append("\nPrioridade: ");
		meta.append(this.getPrioridade());
		meta.append("\n");

		return meta.toString();
	}

}
