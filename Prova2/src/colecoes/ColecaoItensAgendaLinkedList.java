package colecoes;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import agenda.*;
import tempo.Periodo;

/**
 * Essa classe compõe a agenda da prova, que é uma coleção de itens de agenda.
 * <p>
 * A coleção escolhida é a LinkedList, pois no problema não há necessidade de
 * implementar outro tipo. Essa coleção atende o registro de informações, bem
 * como a ordenação do mesmo para as necessidades do usuário.
 * 
 * <p>
 * Implementa a interface Serializable, para permitir que as suas instâncias
 * possam ser usadas numa serialização (por exemplo, gravação em disco)
 * 
 * @author Natália Lopes Oliveira
 * @version 1.0 (junho-2019)
 */
public class ColecaoItensAgendaLinkedList implements Serializable {
	/** lista chamada agenda que contém objetos do tipo itens de agenda */
	private List<ItemAgenda> agenda;

	public ColecaoItensAgendaLinkedList() {
		agenda = new LinkedList<ItemAgenda>();
	}

	/**
	 * método para inserir o objeto item de agenda já criado.na lista
	 *
	 * @param _item
	 *            um objeto instanciado de item de agenda
	 */
	public void insere(ItemAgenda _item) {
		this.agenda.add(_item);
	}

	/**
	 * método para inserir uma instância da classe Evento na lista agenda
	 *
	 * @param _titulo
	 *            titulo do evento
	 * @param _descricao
	 *            descrição do evento
	 * @param _dataInicio
	 *            data do início do evento
	 * @param _horarioInicio
	 *            horário do início do evento
	 * @param _dataFim
	 *            data do fim do evento
	 * @param _horarioFim
	 *            horário do fim do evento
	 * @param _local
	 *            local do evento
	 * @throws Exception
	 *             caso _dataInicio, _horarioInicio, _dataFim ou _horarioFim tenha
	 *             erro na hora de setar na instância
	 */
	public void insere(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, String _local) throws Exception {
		this.insere(new Evento(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _local));
	}

	/**
	 * método para inserir uma instância da classe Meta na lista agenda
	 *
	 * @param _titulo
	 *            titulo da meta
	 * @param _descricao
	 *            descrição da meta
	 * @param _dataInicio
	 *            data do início da meta
	 * @param _horarioInicio
	 *            horário do início da meta
	 * @param _dataFim
	 *            data do fim da meta
	 * @param _horarioFim
	 *            horário do fim da meta
	 * @param _prioridade
	 *            prioridade da meta
	 * @throws Exception
	 *             caso _dataInicio, _horarioInicio, _dataFim ou _horarioFim tenha
	 *             erro na hora de setar na instância
	 */
	public void insere(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, Prioridade _prioridade) throws Exception {
		this.insere(new Meta(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _prioridade));
	}

	/**
	 * método para inserir uma instância da classe Lembrete na lista agenda
	 *
	 * @param _titulo
	 *            titulo do lembrete
	 * @param _descricao
	 *            descrição do lembrete
	 * @param _dataInicio
	 *            data do início do lembrete
	 * @param _horarioInicio
	 *            horário do início do lembrete
	 * @param _dataFim
	 *            data do fim do lembrete
	 * @param _horarioFim
	 *            horário do fim do lembrete
	 * @param _periodoAlerta
	 *            quantidade de minutos para alertar o usuário antes do horário de
	 *            início do lembrete
	 * @throws Exception
	 *             caso _dataInicio, _horarioInicio, _dataFim ou _horarioFim tenha
	 *             erro na hora de setar na instância
	 */
	public void insere(String _titulo, String _descricao, String _dataInicio, String _horarioInicio, String _dataFim,
			String _horarioFim, int _periodoAlerta) throws Exception {
		this.insere(
				new Lembrete(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _periodoAlerta));
	}

	/**
	 * método para imprimir apenas objetos que se encontrem no intervalo de tempo
	 * estabelecido pelo usuário.
	 *
	 * @param _periodo
	 *            período estabelecido pelo usuário para comparação com os objetos
	 *            já criados
	 * @return String retorna um objeto da classe StringBuilder em forma de String
	 *         de todos os itens de agenda instanciados que se encontram no
	 *         intervalo estabelecido
	 */
	//NAO TA FUNCIONANDO
	public String imprimeIntervalo(Periodo _periodo) {
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i < this.agenda.size(); i++)
			if (this.agenda.get(i).getPeriodo().isIntervalo(_periodo) == 1)
				lista.append(this.agenda.get(i) + " ");
		return lista.toString();
	}

	/**
	 * método para imprimir apenas objetos da classe Meta por ordem decrescente de
	 * prioridade (URGENTE, ALTO, MEDIO, BAIXO, MINIMO). É criada uma LinkedList
	 * auxiliar apenas para salvar objetos da classe Meta, os quais são ordenados
	 * nessa lista. Após a impressão, a lista é deletada.
	 */
	public void imprimeMetaPrioridade() {
		List<Meta> meta = new LinkedList<Meta>();
		for (int i = 0; i < this.agenda.size(); i++)
			if (agenda.get(i) instanceof Meta) {
				meta.add((Meta) agenda.get(i));
			}
		Collections.sort(meta, new ComparaPorPrioridade());
		System.out.println(meta);
		meta.removeAll(meta);

	}

	/**
	 * método para imprimir apenas objetos da classe Lembrete por ordem crescente de
	 * minutos de antecedência. É criada uma LinkedList auxiliar apenas para salvar
	 * objetos da classe Lembrete, os quais são ordenados nessa lista. Após a
	 * impressão, a lista é deletada.
	 */
	public void imprimeLembreteMinutos() {
		List<Lembrete> lembrete = new LinkedList<Lembrete>();
		for (int i = 0; i < this.agenda.size(); i++)
			if (agenda.get(i) instanceof Lembrete) {
				lembrete.add((Lembrete) agenda.get(i));
			}
		Collections.sort(lembrete, new ComparaLembreteMinutos());
		System.out.println(lembrete);
		lembrete.removeAll(lembrete);

	}

	/**
	 * método para imprimir apenas objetos da classe Evento por ordem alfabética de
	 * local. É criada uma LinkedList auxiliar apenas para salvar objetos da classe
	 * Evento, os quais são ordenados nessa lista. Após a impressão, a lista é
	 * deletada.
	 */
	public void imprimeEventoLocal() {
		List<Evento> evento = new LinkedList<Evento>();
		for (int i = 0; i < this.agenda.size(); i++)
			if (agenda.get(i) instanceof Evento) {
				evento.add((Evento) agenda.get(i));
			}
		Collections.sort(evento, new ComparaEventoLocal());
		System.out.println(evento);
		evento.removeAll(evento);

	}

	/**
	 * Método sobreposto para devolver os campos formatados em uma String
	 *
	 * @return String retorna String com todos os valores dos campos
	 */
	public String toString() {
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i < this.agenda.size(); i++)
			lista.append(this.agenda.get(i) + " ");
		return lista.toString();
	}

}

/**
 * Fornece um método para ser usado na ordenação de várias instâncias da classe
 * Meta por prioridade.
 * <p>
 * Esta ordenação é realizada pelo método criado anteriormente com uma
 * LinkedList auxiliar
 *
 * @author Natália Lopes Oliveira
 * @version 1.0 (junho-2019)
 *
 */
class ComparaPorPrioridade implements Comparator<ItemAgenda> {
	public int compare(ItemAgenda _meta1, ItemAgenda _meta2) {
		Meta meta1 = (Meta) _meta1;
		Meta meta2 = (Meta) _meta2;
		return -meta1.compareTo(meta2);
	}
}

/**
 * Fornece um método para ser usado na ordenação de várias instâncias da classe
 * Lembrete por por ordem crescente de minutos de antecedência.
 * <p>
 * Esta ordenação é realizada pelo método criado anteriormente com uma
 * LinkedList auxiliar
 *
 * @author Natália Lopes Oliveira
 * @version 1.0 (junho-2019)
 *
 */
class ComparaLembreteMinutos implements Comparator<ItemAgenda> {
	public int compare(ItemAgenda _lembrete1, ItemAgenda _lembrete2) {
		Lembrete lembrete1 = (Lembrete) _lembrete1;
		Lembrete lembrete2 = (Lembrete) _lembrete2;
		return lembrete1.compareTo(lembrete2);
	}
}

/**
 * Fornece um método para ser usado na ordenação de várias instâncias da classe
 * Evento por por ordem alfabética dos locais dos eventos.
 * <p>
 * Esta ordenação é realizada pelo método criado anteriormente com uma
 * LinkedList auxiliar
 *
 * @author Natália Lopes Oliveira
 * @version 1.0 (junho-2019)
 *
 */
class ComparaEventoLocal implements Comparator<ItemAgenda> {
	public int compare(ItemAgenda _evento1, ItemAgenda _evento2) {
		Evento evento1 = (Evento) _evento1;
		Evento evento2 = (Evento) _evento2;
		return evento1.compareTo(evento2);
	}
}