package agenda;

import tempo.Periodo;

/**
 * Classe que representa os lembretes da agenda. Herda de ItemAgenda e possui um
 * campo específico periodoAlerta.
 * 
 * @author Natália Lopes Oliveira
 *
 */
public class Lembrete extends ItemAgenda {
	/**
	 * periodo que o usuario deseja ser alertado antes de o item da agenda começår
	 */
	private int periodoAlerta;

	/**
	 * @param _titulo
	 *            titulo do lembrete
	 * @param _descricao
	 *            descricao do lembrete
	 * @param _periodo
	 *            periodo do lembrete
	 * @param _periodoAlerta
	 *            periodo de alerta do lembrete
	 * @throws Exception
	 *             caso o periodo esteja errado
	 */
	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _periodoAlerta) throws Exception {
		super(_titulo, _descricao, _periodo);
		this.setPeriodoAlerta(_periodoAlerta);
	}

	/**
	 * @param _titulo
	 *            titulo do lembrete
	 * @param _descricao
	 *            descricao do lembrete
	 * @param _dataInicio
	 *            data inicio do lembrete
	 * @param _horarioInicio
	 *            horario inicio do lembrete
	 * @param _dataFim
	 *            data fim do lembrete
	 * @param _horarioFim
	 *            horario fim do lembrete
	 * @param _periodoAlerta
	 *            periodo alerta do lembrete
	 * @throws Exception
	 */
	public Lembrete(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, int _periodoAlerta) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setPeriodoAlerta(_periodoAlerta);
	}

	/**
	 * @param _periodoAlerta
	 *            periodo de alerta do lembrete
	 */
	public void setPeriodoAlerta(int _periodoAlerta) {
		this.periodoAlerta = _periodoAlerta;
	}

	/**
	 * @return periodo de alerta do lembrete
	 */
	public int getPeriodoAlerta() {
		return this.periodoAlerta;
	}

	/**
	 * @param _lembrete
	 *            lembrete para comparar por ordem crescente de periodo de alerta
	 * @return se o lembrete que chamou o método tiver um periodo de alerta maior
	 *         que o do parametro, 0 se igual, -1 se menor
	 */
	public int compareTo(Lembrete _lembrete) {
		if (this.getPeriodoAlerta() > _lembrete.getPeriodoAlerta())
			return 1;
		else if (this.getPeriodoAlerta() < _lembrete.getPeriodoAlerta())
			return -1;
		return 0;
	}

	/*
	 * @return string do objeto instanciado Lembrete
	 */
	public String toString() {
		StringBuilder lembrete = new StringBuilder();
		lembrete.append(super.toString());
		lembrete.append("\nPeríodo para alerta: ");
		lembrete.append(this.getPeriodoAlerta());
		lembrete.append(" min\n");

		return lembrete.toString();
	}
}
