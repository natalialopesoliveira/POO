import java.util.Scanner;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		int quant = 50;
		Horario horario[] = new Horario[quant];
		int i = 0;
		while (i < quant) {
			scanner = new Scanner(System.in);
			try {
				System.out.println("\n ============================= \n\nEscolha o tipo de cadastro que deseja criar:\n"
						+ "1- Criar tarefa;\n" + "2- Criar tarefa especificando duração;\n3- Sair.");
				int _opcao = scanner.nextInt();
				scanner.nextLine();
				if (_opcao == 1 || _opcao == 2) {
					System.out.print("\nDigite apenas a hora (sem minutos): ");
					int _horas = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Digite apenas os minutos: ");
					int _minutos = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Digite a descrição da tarefa: ");
					String _descricao = scanner.nextLine();

					if (_opcao == 1) {
						horario[i] = new TarefaHorario(_horas, _minutos, _descricao);
						System.out.println(horario[i].toString());
					} else {
						System.out.print("Digite apenas os minutos do tempo de duracao: ");
						int _duracao = scanner.nextInt();
						scanner.nextLine();
						horario[i] = new TarefaHorarioDuracao(_horas, _minutos, _descricao, _duracao);
						System.out.println(horario[i].toString());
					}
					i++;
				} else if (_opcao == 3) {
					i = quant;
				} else {
					System.out.println("\nNúmero inválido, tente novamente!");
				}
				if (i == quant)
					System.out.println("\n ============================= \n\nFim do cadastro.");
			} catch (Exception e) {
				System.out.println("\nNão foi possível cadastrar, tente novamente!");
				System.out.println(e);
			}
		}
	}

}
