import java.util.Scanner;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		int i = 0, j = 0, quant = 2;
		ContaBancaria conta[] = new ContaBancaria[quant];
		scanner = new Scanner(System.in);
		while (i < quant) {
			try {
				System.out.print("\n\nDigite o nome do correntista: ");
				String _nome = scanner.nextLine();
				System.out.print("Digite o saldo da conta: ");
				double _saldo = scanner.nextDouble();
				scanner.nextLine();
				conta[i] = new ContaBancaria(_nome, _saldo);
				System.out.print(conta[i].toString());
				if (j == 0 && i != (quant - 1)) {
					System.out.print("\n\nDeseja fazer a correção do saldo deste correntista?\n1-Sim;\n2-Não.");
					int _opcao = scanner.nextInt();
					scanner.nextLine();
					if (_opcao == 1) {
						System.out.print("\nDigite a taxa de juros (0 - 100%): ");
						double _taxa = scanner.nextDouble();
						ContaBancaria.setTaxaDeJuros(_taxa);
						scanner.nextLine();
						conta[i].corrigirSaldo();
						System.out.print("Após saldo corrigido:\n");
						System.out.print(conta[i].toString());
						j++;
					}
				} else if (j == 0 && i == (quant - 1)) {
					System.out.print("\nÉ necessário fazer a correção do saldo deste correntista.");
					System.out.print("\nDigite a taxa de juros (0 - 100%): ");
					double _taxa = scanner.nextDouble();
					scanner.nextLine();
					ContaBancaria.setTaxaDeJuros(_taxa);
					conta[i].corrigirSaldo();
					j++;
				}
				
				i++;
			} catch (Exception e) {
				System.out.println("Não foi possível criar as informações da conta bancária.");
			}
		}

	}
}
