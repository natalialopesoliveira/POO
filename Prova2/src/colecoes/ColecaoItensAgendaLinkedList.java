package colecoes;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import agenda.*;
import tempo.Periodo;

public class ColecaoItensAgendaLinkedList implements Serializable {
	private List<ItemAgenda> agenda;

	public ColecaoItensAgendaLinkedList() {
		agenda = new LinkedList<ItemAgenda>();
	}

	public void insere(ItemAgenda _item) {
		this.agenda.add(_item);
	}

	public void insere(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, String _local) throws Exception {
		this.insere(new Evento(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _local));
	}

	public void insere(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, Prioridade _prioridade) throws Exception {
		this.insere(new Meta(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _prioridade));
	}

	public void insere(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, int _periodoAlerta) throws Exception {
		this.insere(
				new Lembrete(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _periodoAlerta));
	}

	public String imprimeIntervalo(Periodo _periodo) {
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i < this.agenda.size(); i++)
			if (this.agenda.get(i).getPeriodo().isIntervalo(_periodo) == 1)
				lista.append(this.agenda.get(i) + " ");
		return lista.toString();
	}
	
	public void imprimeMetaPrioridade() {
		List<Meta> meta = new LinkedList<Meta>();
		for (int i = 0; i < this.agenda.size(); i++)
			if(agenda.get(i) instanceof Meta) {
				meta.add((Meta) agenda.get(i));
			}
		Collections.sort(meta, new ComparaPorPrioridade());
		System.out.println(meta);
		meta.removeAll(meta);
		
	}
	
	public void imprimeLembreteMinutos() {
		List<Lembrete> lembrete = new LinkedList<Lembrete>();
		for (int i = 0; i < this.agenda.size(); i++)
			if(agenda.get(i) instanceof Lembrete) {
				lembrete.add((Lembrete) agenda.get(i));
			}
		Collections.sort(lembrete, new ComparaLembreteMinutos());
		System.out.println(lembrete);
		lembrete.removeAll(lembrete);
		
	}
	
	public void imprimeEventoLocal() {
		List<Evento> evento = new LinkedList<Evento>();
		for (int i = 0; i < this.agenda.size(); i++)
			if(agenda.get(i) instanceof Evento) {
				evento.add((Evento) agenda.get(i));
			}
		Collections.sort(evento, new ComparaEventoLocal());
		System.out.println(evento);
		evento.removeAll(evento);
		
	}

	public String toString() {
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i < this.agenda.size(); i++)
			lista.append(this.agenda.get(i) + " ");
		return lista.toString();
	}

}

class ComparaPorPrioridade implements Comparator<ItemAgenda> {
  	public int compare(ItemAgenda _meta1, ItemAgenda _meta2) {
  		Meta meta1 = (Meta)_meta1;
  		Meta meta2 = (Meta)_meta2;
        	return -meta1.compareTo(meta2);
  	}
}

class ComparaLembreteMinutos implements Comparator<ItemAgenda> {
  	public int compare(ItemAgenda _lembrete1, ItemAgenda _lembrete2) {
  		Lembrete lembrete1 = (Lembrete)_lembrete1;
  		Lembrete lembrete2 = (Lembrete)_lembrete2;
        	return lembrete1.compareTo(lembrete2);
  	}
}

class ComparaEventoLocal implements Comparator<ItemAgenda> {
  	public int compare(ItemAgenda _evento1, ItemAgenda _evento2) {
  		Evento evento1 = (Evento)_evento1;
  		Evento evento2 = (Evento)_evento2;
        	return evento1.compareTo(evento2);
  	}
}