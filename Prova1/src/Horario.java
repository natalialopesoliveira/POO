
public class Horario {
	// campos encapsulados de forma privada
	private int horas, minutos;

	// construtores sobrecarregados
	public Horario() throws Exception {
		this(0, 0);
	}

	public Horario(int _horas) throws Exception {
		this(_horas, 0);
	}

	public Horario(int _horas, int _minutos) throws Exception {
		this.setHoras(_horas);
		this.setMinutos(_minutos);
	}

	// métodos set e get
	public void setHoras(int _horas) throws Exception {
		if (_horas >= 0 && _horas <= 23)
			this.horas = _horas;
		else
			throw new Exception("Hora inválida");
	}

	public void setMinutos(int _minutos) throws Exception {
		if (_minutos >= 0 && _minutos <= 59)
			this.minutos = _minutos;
		else
			throw new Exception("Minutos inválidos");
	}

	public int getHoras() {
		return this.horas;
	}

	public int getMinutos() {
		return this.minutos;
	}

	// método sobreposto equals()
	public boolean equals(Object objeto) {
		Horario aux = (Horario) objeto;
		if (this.getHoras() == aux.getHoras() && this.getMinutos() == aux.getMinutos()) {
			return true;
		}
		return false;
	}

	// método sobreposto compareTo()
	// 1 se o horário é maior que o horário do argumento
	// 0 se os horários são iguais
	// -1 se o horário é menor que o horário do argumento
	public int compareTo(Object objeto) {
		Horario aux = (Horario) objeto;
		if (this.getHoras() > aux.getHoras()) {
			return 1;
		} else if (this.getHoras() < aux.getHoras()) {
			return -1;
		} else {
			if (this.getMinutos() > aux.getMinutos()) {
				return 1;
			} else if (this.getMinutos() < aux.getMinutos()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	// método sobreposto toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getHoras());
		dados.append("h ");
		dados.append(this.getMinutos());
		dados.append("min");
		return dados.toString();
	}
}
