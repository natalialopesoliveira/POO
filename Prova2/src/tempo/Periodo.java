package tempo;

public class Periodo {
	private Data dataInicio, dataFim;
	private Horario horarioInicio, horarioFim;

	public Periodo(Data _dataInicio, Horario _horarioInicio, Data _dataFim, Horario _horarioFim) throws Exception {
		this.setDataInicio(_dataInicio);
		this.setHorarioInicio(_horarioInicio);
		this.setDataFim(_dataFim);
		this.setHorarioFim(_horarioFim);
	}
	
	public Periodo(String _dataInicio, String _dataFim) throws Exception {
		this(new Data(_dataInicio), "00:00", new Data(_dataFim), "23:59");
	}
	
	public Periodo(Data _dataInicio, String _horarioInicio, Data _dataFim, String _horarioFim) throws Exception {
		this(_dataInicio, new Horario(_horarioInicio), _dataFim, new Horario(_horarioFim));
	}

	public Periodo(String _dataInicio, String _horarioInicio, String _dataFim, String _horarioFim) throws Exception {
		this(new Data(_dataInicio), new Horario(_horarioInicio), new Data(_dataFim), new Horario(_horarioFim));
	}

	public void setDataInicio(Data _dataInicio) {
		this.dataInicio = _dataInicio;
	}

	public void setDataFim(Data _dataFim) {
		this.dataFim = _dataFim;
	}

	public void setHorarioInicio(Horario _horarioInicio) {
		this.horarioInicio = _horarioInicio;
	}

	public void setHorarioFim(Horario _horarioFim) {
		this.horarioFim = _horarioFim;
	}

	public Data getDataInicio() {
		return this.dataInicio;
	}

	public Data getDataFim() {
		return this.dataFim;
	}

	public Horario getHorarioInicio() {
		return this.horarioInicio;
	}

	public Horario getHorarioFim() {
		return this.horarioFim;
	}

	public int isIntervalo(Periodo _periodo) {
		if ((this.getDataInicio().compareTo(_periodo.getDataInicio()) == 1 || this.getDataInicio().compareTo(_periodo.getDataInicio()) == 0)
				&& (this.getDataFim().compareTo(_periodo.getDataFim()) == -1 || this.getDataFim().compareTo(_periodo.getDataFim()) == 0))
			return 1;
		return 0;

	}

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
		periodo.append(".");

		return periodo.toString();
	}
}
