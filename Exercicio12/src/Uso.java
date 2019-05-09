import java.util.Scanner;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		Funcionario funcionario[] = new Funcionario[50];

		int i = 0;
		while (i < 50) {
			scanner = new Scanner(System.in);
			try {
				System.out.println("\nEscolha o tipo de cadastro que deseja criar:\n" + "1- Funcionário;\n"
						+ "2- Chefe;\n" + "3- Diretor;\n4- Sair.");
				int _opcao = scanner.nextInt();
				scanner.nextLine();

				if (_opcao > 0 && _opcao < 4) {
					System.out.print("\nDigite o nome: ");
					String _nome = scanner.nextLine();
					System.out.print("\nDigite a identidade: ");
					String _identidade = scanner.nextLine();
					System.out.print("\nDigite a data de nascimento (ex: 01/01/1900): ");
					String _dataDeNascimento = scanner.nextLine();
					System.out.print("\nDigite a data de admissão (ex: 01/01/1900): ");
					String _dataDeAdmissao = scanner.nextLine();
					System.out.print("\nDigite o salário: ");
					double _salario = scanner.nextDouble();
					scanner.nextLine();
					if (_opcao == 1) {
						funcionario[i] = new Funcionario(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao,
								_salario);
					} else {
						System.out.print("\nDigite o departamento: ");
						String _departamento = scanner.nextLine();
						if (_opcao == 2) {
							funcionario[i] = new Chefe(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario,
									_departamento);
						} else if (_opcao == 3) {
							System.out.print("\nDigite a data de promoção (ex: 01/01/1900): ");
							String _dataDePromocao = scanner.nextLine();
							funcionario[i] = new Diretor(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao,
									_salario, _departamento, _dataDePromocao);
						}

					}
					System.out.println(funcionario[i].toString());
				} else if (_opcao == 4) {
					i = 50;
					break;
				} else {
					System.out.println("Opção inválida");
				}
				i++;
			} catch (Exception e) {
				System.out.println("ERRO!");
			}

		}
		// receber o valor correspondente a taxa de reajuste dos salários
		System.out.print("\nDigite o valor do reajuste de salário de todos os funcionários: ");
		double _taxa = scanner.nextDouble();

		// imprimir o nome de cada indivíduo, o seu salário reajustado e o valor máximo
		// permitido para empréstimo.
		for (i = 0; i < 50; i++) {
			StringBuilder dados = new StringBuilder();
			dados.append("\nNome: " + funcionario[i].getNome());
			try {
				funcionario[i].reajustarSalario(_taxa);
			} catch (Exception e) {
				System.out.println("Erro ao reajustar salário!");
			}
			dados.append("\nSalário Reajustado: " + funcionario[i].getSalario());
			dados.append("\nValor máximo permitido para empréstimo: " + funcionario[i].valorMaximoEmprestimo());
			System.out.println(dados);
		}
	}
}
