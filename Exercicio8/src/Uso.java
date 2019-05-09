import java.util.Scanner;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		int i = 0, j = 0;
		while (i < 2) {
			try {
				scanner = new Scanner(System.in);
				System.out.print("Digite o nome do correntista: ");
				String _nome = scanner.nextLine();
				System.out.print("\nDigite o saldo da conta: ");
				double _saldo = scanner.nextDouble();
				scanner.nextLine();
				ContaBancaria _conta = new ContaBancaria(_nome, _saldo);
				i++;
				
				if (j==0 && i==0) {
					System.out.print("Deseja fazer a correção do saldo deste correntista?\n1- Sim;\n2-Não.");
				}
			} catch (Exception e) {
				System.out.println("Não foi possível criar as informações da conta bancária.");
			}

		}

	}

}
