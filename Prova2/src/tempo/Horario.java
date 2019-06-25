package tempo;

import java.io.Serializable;

public class Horario  implements Serializable {
	private int horas, minutos;

	public Horario() throws Exception {
		this(0, 0);
	}

	public Horario(int _horas, int _minutos) throws Exception {
		this.setHoras(_horas);
		this.setMinutos(_minutos);
	}

	public Horario(String _horario) throws Exception {
		this.setHorario(_horario);
	}

	public void setHorario(String _horario) throws Exception {
		if (_horario.contains(":")) {
			int firstindex = _horario.indexOf(":");
			int tamanhoHorario = _horario.length();
			int tamanhoHoras = (_horario.substring(0, firstindex)).length();
			int tamanhoMinutos = tamanhoHorario-tamanhoHoras;
			this.setHoras(Integer.parseInt(_horario.substring(0, firstindex)));
			this.setMinutos(Integer.parseInt(_horario.substring(firstindex+1, firstindex+tamanhoMinutos)));
		} else
			throw new Exception("Horário em formato inválido.");
	}

	public void setHoras(int _horas) throws Exception {
		if (_horas < 24 && _horas >= 0) {
			this.horas = _horas;
		} else
			throw new Exception("O limite de horas está incorreto.");
	}

	public void setMinutos(int _minutos) throws Exception {
		if (_minutos < 60 && _minutos >= 0) {
			this.minutos = _minutos;
		} else
			throw new Exception("O limite de minutos está incorreto.");
	}

	public int getHoras() {
		return this.horas;
	}

	public int getMinutos() {
		return this.minutos;
	}

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

	public String toString() {
		StringBuilder horario = new StringBuilder();
		horario.append(this.getHoras());
		horario.append(":");
		horario.append(this.getMinutos());

		return horario.toString();
	}
}
