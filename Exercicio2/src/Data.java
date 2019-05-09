
public class Data {
	private int dia, mes, ano;

	public Data(int _mes, int _ano) {
		this(1, _mes, _ano);
	}

	public Data(int _dia, int _mes, int _ano) {
		this.setData(_dia, _mes, _ano);
	}

	public Data(String _data) {
		this.setData(_data);
	}

	public Data(int _dia, String _mes, int _ano) {
		this.setData(_dia, _mes, _ano);
	}

	public Data() {
		this(1, 1, 1900);
	}

	public void setData(int _dia, int _mes, int _ano) {
		if (isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		} else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 1900;
		}
	}

	public void setData(int _dia, String _mes, int _ano) {
		int _mesInt = Data.retornaMes(_mes);
		this.setData(_dia, _mesInt, _ano);
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

	public void setData(String _data) {
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

	private static boolean isBissexto(int _ano) {
		if ((_ano % 4 == 0 && _ano % 100 != 0) || _ano % 400 == 0) {
			return true;
		}
		return false;
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
