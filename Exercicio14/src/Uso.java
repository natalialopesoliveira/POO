import java.util.Scanner;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quant = 50, i = 0;
		Cliente cliente[] = new Cliente[quant];
		scanner = new Scanner(System.in);
		while (i < quant) {
			try {
				System.out.print("\n==========================\n\nDigite: \n1- Fazer o cadastro do cliente;\n2- Sair;");
				int opcao = scanner.nextInt();
				scanner.nextLine();
				if (opcao == 1) {
					System.out.print("\n\nDigite o nome: ");
					String _nome = scanner.nextLine();
					System.out.print("\nDigite o e-mail: ");
					String _email = scanner.nextLine();
					System.out.print("\nDigite o número de celular: ");
					String _celular = scanner.nextLine();
					System.out.print("\nDigite o endereço: ");
					String _endereco = scanner.nextLine();
					System.out.print("\nDigite a renda familiar: ");
					double _rendaFamiliar = scanner.nextDouble();
					scanner.nextLine();
					cliente[i] = new Cliente(_nome, _email, _celular, _endereco, _rendaFamiliar);
					System.out.println("\n");
					System.out.println(cliente[i].toString());
					i++;
				} else if (opcao == 2) {
					System.out.println("\n\nCadastro encerrado.\n==========================");
					i = quant;
				} else {
					System.out.println("Opção inválida, tente novamente.\n\n");
				}
			}catch(Exception e) {
				System.out.println(e);
				System.out.println("Dados errados, tente novamente.\n\n");
			}
		}

	}

}
