package exercicio11;

public class Data {
	private int dia, mes, ano;

	// construtores sobrecarregados
	public Data() throws Exception {
		this(1, 1, 1990);
	}

	public Data(int _dia, int _mes, int _ano) throws Exception {
		this.setData(_dia, _mes, _ano);
	}

	public Data(String _data) throws Exception {
		this.setData(_data);
	}

	// métodos set sobrecarregados
	public void setData(int _dia, int _mes, int _ano) throws Exception {
		if (Data.isDataValida(_dia, _mes, _ano)) {
			this.dia = _dia;
			this.mes = _mes;
			this.ano = _ano;
		} else
			throw new Exception("Data inválida!");
	}

	public void setData(String _data) throws Exception {
		int firstindex = _data.indexOf("/");
		int secindex = _data.indexOf("/", firstindex + 1);
		this.setData(Integer.parseInt(_data.substring(0, firstindex)),Integer.parseInt(_data.substring((firstindex + 1), secindex)),Integer.parseInt(_data.substring((secindex + 1), (secindex + 5))));
//		if (Data.isDataValida(Integer.parseInt(_data.substring(0, firstindex)),
//				Integer.parseInt(_data.substring((firstindex + 1), secindex)),
//				Integer.parseInt(_data.substring((secindex + 1), (secindex + 5))))) {
//			this.dia = Integer.parseInt(_data.substring(0, firstindex));
//			this.mes = Integer.parseInt(_data.substring((firstindex + 1), secindex));
//			this.ano = Integer.parseInt(_data.substring((secindex + 1), (secindex + 5)));
//		}
	}

	// métodos get sobrecarregados
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

	// método isDataValida
	public static boolean isDataValida(int _dia, int _mes, int _ano) {
		if (_ano < 1582) {
			return false;
		}
		if (_mes > 12) {
			return false;
		}
		if (_mes == 1 || _mes == 3 || _mes == 5 || _mes == 7 || _mes == 8 || _mes == 10 || _mes == 12) {
			if (_dia > 31 || _dia < 0) {
				return false;
			}
		} else if (_mes == 2) {
			if (Data.isBissexto(_ano)) {
				if (_dia > 29 || _dia < 0) {
					return false;
				}
			} else {
				if (_dia > 28 || _dia < 0) {
					return false;
				}
			}
		} else {
			if (_dia > 30 || _dia < 0) {
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
		StringBuilder dados = new StringBuilder();
		dados.append(this.getDia());
		dados.append("/");
		dados.append(this.getMes());
		dados.append("/");
		dados.append(this.getAno());
		return dados.toString();
	}
}
