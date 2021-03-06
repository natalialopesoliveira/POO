//Inclua na classe Data o método compareTo que tem como objetivo receber um objeto da classe Data como
//argumento e retornar 1, 0 ou -1, respectivamente se o objeto Data usado na chamada é maior, igual ou menor do
//que o objeto Data passado como argumento.

//Este método deve ser estático ou não? Porque?
//	Não, pois como ele vai receber um objeto e comparar com o outro recebido como argumento, não pode
//	ser estático. Porém, se for interesse do programa em algum momento comparar duas datas que ainda
//	não foram instanciadas, ele deve sim ser estático.
//	
//Caso a resposta seja negativa, qual modificação você proporia para torná-lo estático? 
//	No caso teria esse método não estático também, mas ele aproveitaria o código do método estático,
//	que receberia os valores de dia, mês e ano das duas datas e compararia. O método não estático ape-
//	nas chamaria esse método estático para fins de aproveitamento de código.

//Normalmente as classes em Java possuem um método compareTo. Isso acontece porque ele pode ser usado por
//classes que organizam coleções de objetos ordenados, tal como uma lista encadeada implementada pela classe
//LinkedList.

//Crie uma situação de uso para este método.
//	Numa lista encadeada que se encontram dados de contatos de pacientes de clínica,
//	e é necessário ordenar esses dados. Então o método compareTo serviria para comparar
//	dois nós da lista e assim o programa tomaria uma decisão com base no valor retornado.
	
		
public class Data {
	private int dia, mes, ano;

	public Data(int _mes, int _ano) throws Exception {
		this(1, _mes, _ano);
	}

	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}

	public Data(String _data) throws Exception {
		this.setData(_data);
	}

	public Data(int _dia, String _mes, int _ano) throws Exception {
		this(_dia, Data.retornaMes(_mes), _ano);
	}

	public Data() {
		try {
			this.setData(1, 1, 1900);
		} catch (Exception e) {

		}
	}

	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if (Data.isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		} else {
			throw new Exception("Data inválida");
		}
	}

	public void setData(String _data) throws Exception {
		int firstindex = _data.indexOf("/");
		int secindex = _data.indexOf("/", firstindex + 1);
		this.setData(Integer.parseInt(_data.substring(0, firstindex)),
				Integer.parseInt(_data.substring((firstindex + 1), secindex)),
				Integer.parseInt(_data.substring((secindex + 1), (secindex + 5))));
	}

	public String getData() {
		return this.toString();
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAno() {
		return this.ano;
	}

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

	public boolean isDataValida(int _dia, String _mes, int _ano) {
		if (Data.isDataValida(_dia, Data.retornaMes(_mes), _ano))
			return true;
		return false;
	}

	private static boolean isBissexto(int _ano) {
		if ((_ano % 4 == 0 && _ano % 100 != 0) || _ano % 400 == 0)
			return true;
		return false;
	}

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

	public Data incrementa() {
		try {
			this.setData(this.getDia() + 1, this.getMes(), this.getAno());
		} catch (Exception e) {
			try {
				this.setData(1, this.getMes() + 1, this.getAno());
			} catch (Exception ex) {
				try {
					this.setData(1, 1, this.getAno() + 1);
				} catch (Exception exc) {
				}
			}
		}
		return this;
	}

	public Data incrementa(int _quantidade) {
		for (int i = 1; i < _quantidade; i++) {
			this.incrementa();
		}
		return this;
	}

	public boolean equals(Object objeto) {
		Data aux = (Data) objeto;
		if (this.getDia() == aux.getDia() && this.getMes() == aux.getMes() && this.getAno() == aux.getAno()) {
			return true;
		}
		return false;
	}

	public static Data verificaECriaData(int _dia, int _mes, int _ano) throws Exception {
		if (Data.isDataValida(_dia, _mes, _ano)) {
			Data dt = new Data(_dia, _mes, _ano);
			return dt;
		} else
			return null;
	}

	public int compareTo(Data _data) {
		//-1 this < _data => _data é mais antiga
		//0 this == _data => 
		// 1 this > _data => this é mais antiga
//		if (this.getAno() > _data.getAno()) {
//			return -1;
//		} else if (this.getAno() < _data.getAno()) {
//			return 1;
//		} else {
//			if (this.getMes() > _data.getMes()) {
//				return -1;
//			} else if (this.getMes() < _data.getMes()) {
//				return 1;
//			} else {
//				if (this.getDia() > _data.getDia()) {
//					return -1;
//				} else if (this.getDia() < _data.getDia()) {
//					return 1;
//				} else
//					return 0;
//			}
//		}
		return Data.compareTo(this.getDia(), this.getMes(), this.getAno(), _data.getDia(), _data.getMes(), _data.getAno());
	}
	
	public static int compareTo(int _dia1, int _mes1, int _ano1, int _dia2, int _mes2, int _ano2) {
		//-1 this < _data => _data é mais antiga
		//0 this == _data => 
		// 1 this > _data => this é mais antiga
		if (_ano1 > _ano2) {
			return -1;
		} else if (_ano1 < _ano2) {
			return 1;
		} else {
			if (_mes1 > _mes2) {
				return -1;
			} else if (_mes1 < _mes2) {
				return 1;
			} else {
				if (_dia1> _dia2) {
					return -1;
				} else if (_dia1 < _dia2) {
					return 1;
				} else
					return 0;
			}
		}
	}

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
