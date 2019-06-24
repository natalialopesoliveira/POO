package agenda;
import tempo.Periodo;

public class Lembrete extends ItemAgenda {
	private int periodoAlerta;
	
	public Lembrete(String _titulo, String _descricao, Periodo _periodo, int _periodoAlerta) throws Exception{
		super(_titulo, _descricao, _periodo);
		this.setPeriodoAlerta(_periodoAlerta);
	}
	
	public Lembrete(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, int _periodoAlerta) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setPeriodoAlerta(_periodoAlerta);
	}
	
	public void setPeriodoAlerta(int _periodoAlerta) {
		this.periodoAlerta = _periodoAlerta;
	}
	
	public int getPeriodoAlerta() {
		return this.periodoAlerta;
	}
	
	public int compareTo(Lembrete _lembrete) {
		if(this.getPeriodoAlerta() > _lembrete.getPeriodoAlerta())
			return 1;
		else if(this.getPeriodoAlerta() < _lembrete.getPeriodoAlerta())
			return -1;
		return 0;
	}
	
	public String toString() {
		StringBuilder lembrete = new StringBuilder();
		lembrete.append(super.toString());
		lembrete.append("\nPeríodo para alerta: ");
		lembrete.append(this.getPeriodoAlerta());
		lembrete.append(" min\n");
		
		return lembrete.toString();
	}
}
