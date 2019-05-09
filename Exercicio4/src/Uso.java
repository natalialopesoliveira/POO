
import java.util.Scanner;
public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) throws Exception {
		//Usando construtores apropriados, crie os seguintes objetos:
		int i = 0;
		while(i<3) {
			try {
				System.out.println("Entre com a data:");
				scanner = new Scanner(System.in);
				Data data = new Data(scanner.nextLine());
				System.out.println("Data válida " + data.toString());
				Data incremento = data.incrementa();
				System.out.println("Data válida incrementada: " + incremento.toString());
				Data incrementoComQuantidade = data.incrementa(10);
				System.out.println("Data válida incrementada com quantidade: " + incrementoComQuantidade.toString());
				break;

			}
			catch(Exception e)
			{
				System.out.println("\nData inválida");
				i++;
			}
		}
		if(i==3) {
			Data data = new Data(1,1,1990);
			System.out.println("Data padrão criada: " + data);
		}
	}
}

