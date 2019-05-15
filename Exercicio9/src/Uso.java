
import java.util.Scanner; 
public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		int quant=101,i=0;
		Ponto ponto[] = new Ponto[quant];
		scanner = new Scanner(System.in);
		try {
			System.out.print("Digite o ponto que deseja criar: ");
			String _ponto = scanner.nextLine();
			ponto[i] = new Ponto(_ponto);
			i++;
			while(i<quant) {
				ponto[i] = new Ponto((double)(Math.random()*Ponto.getLimiteSuperior() +Ponto.getLimiteInferior()),(double)(Math.random()*Ponto.getLimiteSuperior() +Ponto.getLimiteInferior()));
				System.out.print("\n\nPonto: ");
				System.out.println(ponto[i].toString());
				System.out.print("Distância: ");
				System.out.println(ponto[i].distancia(ponto[0]));
				i++;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
