package agenda;
import tempo.Periodo;

public class Evento extends ItemAgenda{
	private String local;
	
	public Evento(String _titulo, String _descricao, Periodo _periodo, String _local) throws Exception{
		super(_titulo, _descricao, _periodo);
		this.setLocal(_local);
	}
	
	public Evento(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, String _local) throws Exception {
		super(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim);
		this.setLocal(_local);
	}
	
	public void setLocal(String _local) {
		this.local = _local;
	}
	
	public String getLocal() {
		return this.local;
	}
	
	public int compareTo(Evento _evento) {
		return (this.getLocal().compareToIgnoreCase(_evento.getLocal()));
	}
	
	public String toString() {
		StringBuilder evento = new StringBuilder();
		evento.append(super.toString());
		evento.append("\nLocal: ");
		evento.append(this.getLocal());
		evento.append("\n");
		
		return evento.toString();
	}
}
