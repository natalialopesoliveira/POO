package tempo;

import java.io.Serializable;

/**
 * Classe que lida com horário contendo horas e minutos e possui 3 construtores
 * sobrecarregados
 * 
 * @author Natália Lopes Oliveira
 *
 */
public class Horario implements Serializable {
	/**
	 * horas do horário
	 */
	/**
	 * minutos do horário
	 */
	private int horas, minutos;

	/**
	 * Construtor vazio que chama outro construtor afim de inicializar os campos do
	 * horário como padrão
	 * 
	 * @throws Exception
	 *             caso os limites do horário estejam errados
	 */
	public Horario() throws Exception {
		this(0, 0);
	}

	/**
	 * Construtor que inicializa os campos do horário com os valores passados como
	 * parâmetro
	 * 
	 * @param _horas
	 *            horas do horário
	 * @param _minutos
	 *            minutos do horário
	 * @throws Exception
	 *             caso os limites do horário estejam errados
	 */
	public Horario(int _horas, int _minutos) throws Exception {
		this.setHoras(_horas);
		this.setMinutos(_minutos);
	}

	/**
	 * Construtor que recebe uma string e chama um método com o objetivo de
	 * inicializar os campos com seus respectivos inteiros
	 * 
	 * @param _horario
	 *            horário em string
	 * @throws Exception
	 *             caso os limites do horário estejam errados ou o usuário tenha
	 *             passado um formato de horário inválido em string
	 */
	public Horario(String _horario) throws Exception {
		this.setHorario(_horario);
	}

	/**
	 * Método que inicializa os campos do horário a partir do parâmetro passado
	 * (string do horário)
	 * 
	 * @param _horario
	 *            recebe o horário como string
	 * @throws Exception
	 *             caso os limites do horário estejam errados ou o usuário tenha
	 *             passado um formato de horário inválido em string
	 */
	public void setHorario(String _horario) throws Exception {
		if (_horario.contains(":")) {
			int firstindex = _horario.indexOf(":");
			int tamanhoHorario = _horario.length();
			int tamanhoHoras = (_horario.substring(0, firstindex)).length();
			int tamanhoMinutos = tamanhoHorario - tamanhoHoras;
			this.setHoras(Integer.parseInt(_horario.substring(0, firstindex)));
			this.setMinutos(Integer.parseInt(_horario.substring(firstindex + 1, firstindex + tamanhoMinutos)));
		} else
			throw new Exception("Horário em formato inválido.");
	}

	/**
	 * Método que verifica se as horas estão dentro dos limites e
	 * inicializa/modifica o campo horas
	 * 
	 * @param _horas
	 *            horas do horário
	 * @throws Exception
	 *             caso os limites da hora estejam errados
	 */
	public void setHoras(int _horas) throws Exception {
		if (_horas < 24 && _horas >= 0) {
			this.horas = _horas;
		} else
			throw new Exception("O limite de horas está incorreto.");
	}

	/**
	 * Método que verifica se os minutos estão dentro dos limites e
	 * inicializa/modifica o campo minutos
	 * 
	 * @param _minutos
	 *            minutos do horário
	 * @throws Exception
	 *             caso os limites dos minutos estejam errados
	 */
	public void setMinutos(int _minutos) throws Exception {
		if (_minutos < 60 && _minutos >= 0) {
			this.minutos = _minutos;
		} else
			throw new Exception("O limite de minutos está incorreto.");
	}
	
	/**
	 * @return int o valor do campo horas
	 */
	public int getHoras() {
		return this.horas;
	}

	/**
	 * @return int o valor do campo minutos
	 */
	public int getMinutos() {
		return this.minutos;
	}

	/**
	 * Método que compara dois horários e retorna um inteiro que representa qual é
	 * maior, igual ou menor
	 * 
	 * @param _horario
	 * @return int 1 caso o horário que chamou seja maior que o horário do
	 *         parametro, 0 se igual, -1 se menor
	 */
	public int compareTo(Horario _horario) {
		if (this.getHoras() > _horario.getHoras())
			return 1;
		else if (this.getHoras() < _horario.getHoras())
			return -1;
		else {
			if (this.getMinutos() > _horario.getMinutos())
				return 1;
			else if (this.getMinutos() < _horario.getMinutos())
				return -1;
			else
				return 0;
		}
	}
	
	/*
	 * Método sobrescrito que retorna uma string representando o horário
	 * 
	 * @return uma String que representa o horário
	 */
	public String toString() {
		StringBuilder horario = new StringBuilder();
		horario.append(this.getHoras());
		horario.append(":");
		horario.append(this.getMinutos());

		return horario.toString();
	}
}
