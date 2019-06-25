package tempo;

import java.io.Serializable;

/**
 * Classe que representa o período, contendo data e horário de inicio e data e
 * horário de fim.
 *
 * @author Natália Lopes Oliveira
 * @version 1.0 (junho-2019)
 */
public class Periodo implements Serializable {
	/** data do início */
	private Data dataInicio;
	/** data do fim */
	private Data dataFim;
	/** horário do início */
	private Horario horarioInicio;
	/** horário do fim */
	private Horario horarioFim;

	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _dataInicio
	 *            data do início instanciado na classe Data
	 * @param _horarioInicio
	 *            horário do início instanciado na classe Horario
	 * @param _dataFim
	 *            data do fim instanciado na classe Data
	 * @param _horarioFim
	 *            horário do fim instanciado na classe Horario
	 * @exception Exception
	 *                caso a data de inicio seja menor que a data do fim
	 */
	public Periodo(Data _dataInicio, Horario _horarioInicio, Data _dataFim, Horario _horarioFim) throws Exception {
		if (_dataInicio.compareTo(_dataFim) == -1
				|| (_dataInicio.compareTo(_dataFim) == 0 && _horarioInicio.compareTo(_horarioFim) == 1)) {
			this.setDataInicio(_dataInicio);
			this.setHorarioInicio(_horarioInicio);
			this.setDataFim(_dataFim);
			this.setHorarioFim(_horarioFim);
		} else
			throw new Exception("Erro. A data de início não pode ser maior que a data do fim.");
	}

	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _dataInicio
	 *            data do início como String
	 * @param _dataFim
	 *            data do fim como String
	 * @throws Exception
	 *             caso a data de inicio seja menor que a data do fim
	 */
	public Periodo(String _dataInicio, String _dataFim) throws Exception {
		this(new Data(_dataInicio), "00:00", new Data(_dataFim), "23:59");
	}

	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _dataInicio
	 *            data do início instanciado na classe Data
	 * @param _horarioInicio
	 *            horário do início como String
	 * @param _dataFim
	 *            data do fim instanciado na classe Data
	 * @param _horarioFim
	 *            horário do fim como String
	 * @throws Exception
	 *             caso a data de inicio seja menor que a data do fim
	 */
	public Periodo(Data _dataInicio, String _horarioInicio, Data _dataFim, String _horarioFim) throws Exception {
		this(_dataInicio, new Horario(_horarioInicio), _dataFim, new Horario(_horarioFim));
	}

	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _dataInicio
	 *            data do início como String
	 * @param _horarioInicio
	 *            horário do início como String
	 * @param _dataFim
	 *            data do fim como String
	 * @param _horarioFim
	 *            horário do fim como String
	 * @throws Exception
	 *             caso a data de inicio seja menor que a data do fim
	 */
	public Periodo(String _dataInicio, String _horarioInicio, String _dataFim, String _horarioFim) throws Exception {
		this(new Data(_dataInicio), new Horario(_horarioInicio), new Data(_dataFim), new Horario(_horarioFim));
	}

	/**
	 * método que modifica o campo dataInicio para o valor passado
	 * 
	 * @param _dataInicio
	 *            uma data instanciada representando a data de inicio
	 */
	public void setDataInicio(Data _dataInicio) {
		this.dataInicio = _dataInicio;
	}

	/**
	 * método que modifica o campo dataFim para o valor passado
	 * 
	 * @param _dataFim
	 *            uma data instanciada representando a data de fim
	 */
	public void setDataFim(Data _dataFim) {
		this.dataFim = _dataFim;
	}

	/**
	 * método que modifica o campo horarioInicio para o valor passado
	 * 
	 * @param _horarioInicio
	 *            um horário instanciado representando o horário de inicio
	 */
	public void setHorarioInicio(Horario _horarioInicio) {
		this.horarioInicio = _horarioInicio;
	}

	/**
	 * método que modifica o campo horarioFim para o valor passado
	 * 
	 * @param _horarioFim
	 *            um horário instanciado representando o horário de fim
	 */
	public void setHorarioFim(Horario _horarioFim) {
		this.horarioFim = _horarioFim;
	}

	/**
	 * @return um objeto da classe Data representando a data de inicio
	 */
	public Data getDataInicio() {
		return this.dataInicio;
	}

	/**
	 * @return um objeto da classe Data representando a data de fim
	 */
	public Data getDataFim() {
		return this.dataFim;
	}

	/**
	 * @return um objeto da classe Horario representando o horario de inicio
	 */
	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}

	/**
	 * @return um objeto da classe Horario representando o horario de fim
	 */
	public Horario getHorarioFim() {
		return this.horarioFim;
	}

	/**
	 * método que vê se o objeto que chamou o método se encontra dentro do período
	 * passado como parâmetro
	 * 
	 * @param _periodo
	 *            período passado como parâmetro
	 * @return int 1 se está no intervalo, 0 se não
	 */
	public int isIntervalo(Periodo _periodo) {
		if ((this.getDataInicio().compareTo(_periodo.getDataInicio()) == 1
				|| this.getDataInicio().compareTo(_periodo.getDataInicio()) == 0)
				&& (this.getDataFim().compareTo(_periodo.getDataFim()) == -1
						|| this.getDataFim().compareTo(_periodo.getDataFim()) == 0))
			return 1;
		return 0;

	}

	/*
	 * Método sobrescrito que retorna uma string representando o período
	 * 
	 * @return uma String que representa o período
	 */
	public String toString() {
		StringBuilder periodo = new StringBuilder();
		periodo.append(" dia ");
		periodo.append(this.getDataInicio());
		periodo.append(" às ");
		periodo.append(this.getHorarioInicio());
		periodo.append(" até dia ");
		periodo.append(this.getDataFim());
		periodo.append(" às ");
		periodo.append(this.getHorarioFim());

		return periodo.toString();
	}
}
