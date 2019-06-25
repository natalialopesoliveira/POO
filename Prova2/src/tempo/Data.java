package tempo;

import java.io.Serializable;

/**
 * Classe que lida com data contendo dia, mes e ano e possui 5 construtores
 * sobrecarregados
 * 
 * @author Natália Lopes Oliveira
 *
 */
public class Data implements Serializable {
	/**
	 * dia da data
	 */
	/**
	 * mes da data
	 */
	/**
	 * ano da data
	 */
	private int dia, mes, ano;

	/**
	 * Construtor para inicializar os campos da data recebendo apenas o mês e o ano
	 * 
	 * @param _mes
	 *            mês da data
	 * @param _ano
	 *            ano da data
	 * @throws Exception
	 *             caso receba um erro de que a data seja inválida
	 */
	public Data(int _mes, int _ano) throws Exception {
		this(1, _mes, _ano);
	}

	/**
	 * Construtor para inicializar os campos da data recebendo dia, mês e ano
	 * 
	 * @param _dia
	 *            dia da data
	 * @param _mes
	 *            mês da data
	 * @param _ano
	 *            ano da data
	 * @throws Exception
	 *             caso receba um erro de que a data seja inválida
	 */
	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}

	/**
	 * Construtor para inicializar os campos da data recebendo data no formato
	 * string
	 * 
	 * @param _data
	 *            string da data
	 * @throws Exception
	 *             caso receba um erro de que a data seja inválida
	 */
	public Data(String _data) throws Exception {
		this.setData(_data);
	}

	/**
	 * Construtor para inicializar os campos da data recebendo dia, mês e ano, porém
	 * com o mês no formato String
	 * 
	 * @param _dia
	 *            dia da data
	 * @param _mes
	 *            mês da data em string
	 * @param _ano
	 *            ano da data
	 * @throws Exception
	 *             caso receba um erro de que a data seja inválida
	 */
	public Data(int _dia, String _mes, int _ano) throws Exception {
		this(_dia, Data.retornaMes(_mes), _ano);
	}

	/**
	 * Construtor vazio para inicializar os campos da data*
	 * 
	 * @throws Exception
	 *             caso receba um erro de que a data seja inválida
	 */
	public Data() throws Exception {
		this.setData(1, 1, 1900);
	}

	/**
	 * método que recebe os valores do dia, mês e ano em inteiro, verifica sé é
	 * válida e, se válida, atribui esses valores aos campos do objeto
	 * 
	 * @param _dia
	 *            dia da data
	 * @param _mes
	 *            mês da data
	 * @param _ano
	 *            ano da data
	 * @throws Exception
	 *             caso receba um erro de que a data seja inválida
	 */
	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if (Data.isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		} else {
			throw new Exception("Data inválida");
		}
	}

	/**
	 * @param _data
	 *            recebe a data como string e chama o método setData com os inteiros
	 *            respectivos da data
	 * @throws Exception
	 *             caso tenha algum erro no processo de separar os inteiros da
	 *             string
	 */
	public void setData(String _data) throws Exception {
		int firstindex = _data.indexOf("/");
		int secindex = _data.indexOf("/", firstindex + 1);
		this.setData(Integer.parseInt(_data.substring(0, firstindex)),
				Integer.parseInt(_data.substring((firstindex + 1), secindex)),
				Integer.parseInt(_data.substring((secindex + 1), (secindex + 5))));
	}

	/**
	 * método que retorna o valor atual do campo do objeto instanciado
	 * 
	 * @return String a data no formato string
	 */
	public String getData() {
		return this.toString();
	}

	/**
	 * método que retorna o valor atual do campo dia do objeto instanciado
	 * 
	 * @return int o valor do dia
	 */
	public int getDia() {
		return this.dia;
	}

	/**
	 * método que retorna o valor atual do campo mês do objeto instanciado
	 * 
	 * @return int o valor do mês
	 */
	public int getMes() {
		return this.mes;
	}

	/**
	 * método que retorna o valor atual do campo ano do objeto instanciado
	 * 
	 * @return int o valor do ano
	 */
	public int getAno() {
		return this.ano;
	}

	/**
	 * Método estático que verifica se a data com os campos passados é válida ou não
	 * 
	 * @param _dia
	 *            dia da data
	 * @param _mes
	 *            mês da data
	 * @param _ano
	 *            ano da data
	 * @return boolean, true se a data for válida, false se não
	 */
	public static boolean isDataValida(int _dia, int _mes, int _ano) {
		if (_ano < 1582) {
			return false;
		}
		if (_mes > 12) {
			return false;
		}
		if (_mes == 1 || _mes == 3 || _mes == 5 || _mes == 7 || _mes == 8 || _mes == 10 || _mes == 12) {
			if (_dia > 31 || _dia < 1) {
				return false;
			}
		} else if (_mes == 2) {
			if (Data.isBissexto(_ano)) {
				if (_dia > 29 || _dia < 1) {
					return false;
				}
			} else {
				if (_dia > 28 || _dia < 1) {
					return false;
				}
			}
		} else {
			if (_dia > 30 || _dia < 1) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Esse método estático com o objetivo de verificar se a data é válida chama o
	 * método que retorna o número inteiro do mês correspondente a string passada e
	 * chama o método estático de verificar data com os parâmetros de inteiros
	 * 
	 * @param _dia
	 *            dia da data
	 * @param _mes
	 *            mês da data em string
	 * @param _ano
	 *            ano da data
	 * @return boolean, true se a data for válida, false se não
	 */
	public static boolean isDataValida(int _dia, String _mes, int _ano) {
		if (Data.isDataValida(_dia, Data.retornaMes(_mes), _ano))
			return true;
		return false;
	}

	/**
	 * Método estático que verifica se o ano passado é bissexto ou não
	 * 
	 * @param _ano
	 *            ano da data
	 * @return boolean true se bissexto, false se não
	 */
	private static boolean isBissexto(int _ano) {
		if ((_ano % 4 == 0 && _ano % 100 != 0) || _ano % 400 == 0)
			return true;
		return false;
	}

	/**
	 * Método estático que recebe o mês em string e retorna o número inteiro
	 * correspondente do mês
	 * 
	 * @param _mes
	 *            mês da data em string
	 * @return int retorna o número inteiro correspondente do mês
	 */
	public static int retornaMes(String _mes) {
		_mes = _mes.toLowerCase();
		switch (_mes) {
		case "janeiro":
			return 1;
		case "fevereiro":
			return 2;
		case "março":
			return 3;
		case "marco":
			return 3;
		case "abril":
			return 4;
		case "maio":
			return 5;
		case "junho":
			return 6;
		case "julho":
			return 7;
		case "agosto":
			return 8;
		case "setembro":
			return 9;
		case "outubro":
			return 10;
		case "novembro":
			return 11;
		case "dezembro":
			return 12;
		default:
			return 13;
		}
	}

	/**
	 * Método que retorna a chamada do método compareTo estático para comparar duas
	 * datas e retorna um inteiro que representa qual é maior, igual ou menor
	 * 
	 * @param _data
	 * @return int 1 caso a data que chamou seja maior que a data do parâmetro, 0 se
	 *         igual, -1 se menor
	 */
	public int compareTo(Data _data) {
		return Data.compareTo(this.getDia(), this.getMes(), this.getAno(), _data.getDia(), _data.getMes(),
				_data.getAno());
	}

	/**
	 * * Método estático que retorna um inteiro para comparar duas datas passadas
	 * por parâmetro e retorna um inteiro que representa qual é maior, igual ou
	 * menor
	 * 
	 * @param _dia1
	 *            dia da primeira data
	 * @param _mes1
	 *            mês da primeira data
	 * @param _ano1
	 *            ano da primeira data
	 * @param _dia2
	 *            dia da segunda data
	 * @param _mes2
	 *            mês da segunda data
	 * @param _ano2
	 *            ano da segunda data
	 * @return int 1 caso a primeira data do parâmetro seja maior que a segunda
	 *         data, 0 se igual, -1 se menor
	 */
	public static int compareTo(int _dia1, int _mes1, int _ano1, int _dia2, int _mes2, int _ano2) {
		// -1 this < _data => _data é mais antiga
		// 0 this == _data =>
		// 1 this > _data => this é mais antiga
		if (_ano1 > _ano2) {
			return 1;
		} else if (_ano1 < _ano2) {
			return -1;
		} else {
			if (_mes1 > _mes2) {
				return 1;
			} else if (_mes1 < _mes2) {
				return -1;
			} else {
				if (_dia1 > _dia2) {
					return 1;
				} else if (_dia1 < _dia2) {
					return -1;
				} else
					return 0;
			}
		}
	}

	/*
	 * Método sobrescrito que retorna uma string representando a data
	 * 
	 * @return uma String que representa a data
	 */
	public String toString() {
		StringBuilder data = new StringBuilder();
		data.append(this.getDia());
		data.append("/");
		data.append(this.getMes());
		data.append("/");
		data.append(this.getAno());
		return data.toString();
	}
}
