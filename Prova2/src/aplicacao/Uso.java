package aplicacao;

import agenda.*;
import colecoes.*;
import tempo.*;

import java.util.Scanner;

public final class Uso {

	private static Scanner scanner;
	private static Prioridade _prioridade;
	public static void main(String[] args) {
		int opcao, cadastro, relatorio, programa = 0;
		ColecaoItensAgendaLinkedList lista = new ColecaoItensAgendaLinkedList();
		scanner = new Scanner(System.in);
		while (programa == 0) {
			try {
				System.out.println("===========================================");
				System.out.println(
						"\nDigite a opção para:\n1- Realizar cadastro na agenda;\n2- Ver relatórios;\n3- Sair.");
				opcao = scanner.nextInt();
				scanner.nextLine();
				if (opcao == 1) {
					System.out.println("\nDeseja realizar o cadastro de:\n1- Evento;\n2- Lembrete;\n3- Meta.");
					cadastro = scanner.nextInt();
					scanner.nextLine();
					if (cadastro == 1) {
						System.out.println("\nCADASTRO DE EVENTO");
						System.out.print("\nDigite o título do evento: ");
						String _titulo = scanner.nextLine();
						System.out.print("\nDigite a descrição do evento: ");
						String _descricao = scanner.nextLine();
						System.out.print("\nDigite a data de início do evento: ");
						String _dataInicio = scanner.nextLine();
						System.out.print("\nDigite o horário de início do evento: ");
						String _horarioInicio = scanner.nextLine();
						System.out.print("\nDigite a data do fim do evento: ");
						String _dataFim = scanner.nextLine();
						System.out.print("\nDigite o horário do fim do evento: ");
						String _horarioFim = scanner.nextLine();
						System.out.print("\nDigite o local do evento: ");
						String _local = scanner.nextLine();
						lista.insere(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim, _local);
					} else if (cadastro == 2) {
						System.out.println("\nCADASTRO DE LEMBRETE\n");
						System.out.print("\nDigite o título do lembrete: ");
						String _titulo = scanner.nextLine();
						System.out.print("\nDigite a descrição do lembrete: ");
						String _descricao = scanner.nextLine();
						System.out.print("\nDigite a data de início do lembrete: ");
						String _dataInicio = scanner.nextLine();
						System.out.print("\nDigite o horário de início do lembrete: ");
						String _horarioInicio = scanner.nextLine();
						System.out.print("\nDigite a data do fim do lembrete: ");
						String _dataFim = scanner.nextLine();
						System.out.print("\nDigite o horário do fim do lembrete: ");
						String _horarioFim = scanner.nextLine();
						System.out
								.print("\nDigite a quantidade de minutos para alerta de antecedência do lembrete: ");
						int _periodoAlerta = scanner.nextInt();
						scanner.nextLine();
						lista.insere(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim,
								_periodoAlerta);

					} else if (cadastro == 3) {
						System.out.println("\nCADASTRO DE META");
						System.out.print("\nDigite o título da meta: ");
						String _titulo = scanner.nextLine();
						System.out.print("\nDigite a descrição da meta: ");
						String _descricao = scanner.nextLine();
						System.out.print("\nDigite a data de início da meta: ");
						String _dataInicio = scanner.nextLine();
						System.out.print("\nDigite o horário de início da meta: ");
						String _horarioInicio = scanner.nextLine();
						System.out.print("\nDigite a data do fim da meta: ");
						String _dataFim = scanner.nextLine();
						System.out.print("\nDigite o horário do fim da meta: ");
						String _horarioFim = scanner.nextLine();
						System.out.print(
								"\nEscolha a prioridade da meta:\n1- Urgente;\n2- Alta;\n3- Normal;\n4- Baixa;\n5-Mínima.");
						int _intPrioridade = scanner.nextInt();
						if (_intPrioridade == 1)
							_prioridade = Prioridade.URGENTE;
						else if (_intPrioridade == 2)
							_prioridade = Prioridade.ALTA;
						else if (_intPrioridade == 3)
							_prioridade = Prioridade.NORMAL;
						else if (_intPrioridade == 4)
							_prioridade = Prioridade.BAIXA;
						else if (_intPrioridade == 5)
							_prioridade = Prioridade.MINIMA;
						else
							System.out.println("\nNão foi possível realizar o cadastro. Opção inválida.");
						scanner.nextLine();
						lista.insere(_titulo, _descricao, _dataInicio, _horarioInicio, _dataFim, _horarioFim,
								_prioridade);
					} else {
						System.out.println("\nOpção inválida. Tente novamente.\n");
					}
				} else if (opcao == 2) {
					System.out.println(
							"\nDeseja ver o relatório de:\n1- Todos os itens agendados;\n2- Todos os itens agendados em um intervalo de datas; \n3- Todas as metas em ordem de prioridade;\n4- Todos os lembretes em ordem de minutos de antecedência;\n5- Todos os eventos em ordem alfabética de local.");
					relatorio = scanner.nextInt();
					scanner.nextLine();
					if (relatorio == 1) {
						System.out.println("\nTodos os itens agendados:\n");
						System.out.println(lista);
					} else if (relatorio == 2) {
						System.out.print("\nDigite a data de início do intervalo: ");
						String _dataInicioIntervalo = scanner.nextLine();
						System.out.print("\nDigite a data de fim do intervalo: ");
						String _dataFimIntervalo = scanner.nextLine();
						System.out.println("\nTodos os itens agendados no intervalo entre as datas "+_dataInicioIntervalo+" e "+_dataFimIntervalo+": ");
						System.out
								.println(lista.imprimeIntervalo(new Periodo(_dataInicioIntervalo, _dataFimIntervalo)));
					} else if (relatorio == 3) {
						System.out.println("Todas as metas em ordem de prioridade:");
						lista.imprimeMetaPrioridade();
					} else if (relatorio == 4) {
						System.out.println("Todos os lembretes em ordem de minutos de antecedência:");
						lista.imprimeLembreteMinutos();
					}else if(relatorio == 5) {
						System.out.println("Todos os eventos em ordem alfabética de local:");
						lista.imprimeEventoLocal();
					}else {
						System.out.println("\nOpção inválida. Tente novamente.\n");
					}
					
				} else if (opcao == 3) {
					programa = 1;
					System.out.println("\n\n Programa encerrado.");
					System.out.println("\n\n\n =========================================== \n ");
				} else {
					System.out.println("\nOpção inválida. Tente novamente.\n");
				}
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Dados errados, tente novamente.\n\n");
			}
		}
	}
}
