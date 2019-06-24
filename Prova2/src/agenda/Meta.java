package agenda;

import tempo.Periodo;

public class Meta extends ItemAgenda {
	private Prioridade prioridade;

	public Meta(String _titulo, String _descricao, Periodo _periodo, Prioridade _prioridade) throws Exception {
		super(_titulo, _descricao, _periodo);
		this.setPrioridade(_prioridade);
	}

	public Meta(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, Prioridade _prioridade) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setPrioridade(_prioridade);
	}

	public void setPrioridade(Prioridade _prioridade) {
		this.prioridade = _prioridade;
	}

	public Prioridade getPrioridade() {
		return this.prioridade;
	}

	public int compareTo(Meta _meta) {
		if (this.getPrioridade() == Prioridade.URGENTE) {
			if (_meta.getPrioridade() == Prioridade.URGENTE)
				return 0;
			return 1;
		} else if (this.getPrioridade() == Prioridade.ALTA) {
			if (_meta.getPrioridade() == Prioridade.ALTA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.URGENTE)
				return -1;
			return 1;
		} else if (this.getPrioridade() == Prioridade.NORMAL) {
			if (_meta.getPrioridade() == Prioridade.NORMAL)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.ALTA || _meta.getPrioridade() == Prioridade.URGENTE)
				return -1;
			return 1;
		} else if (this.getPrioridade() == Prioridade.BAIXA) {
			if (_meta.getPrioridade() == Prioridade.BAIXA)
				return 0;
			else if (_meta.getPrioridade() == Prioridade.MINIMA)
				return 1;
			return -1;
		} else if (this.getPrioridade() == Prioridade.MINIMA) {
			if (_meta.getPrioridade() == Prioridade.MINIMA)
				return 0;
			return -1;
		}
		return -1;
	}

	public String toString() {
		StringBuilder meta = new StringBuilder();
		meta.append(super.toString());
		meta.append("\nPrioridade: ");
		meta.append(this.getPrioridade());
		meta.append("\n");

		return meta.toString();
	}

}
