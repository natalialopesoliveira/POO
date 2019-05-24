import java.util.*;

public class Uso {

	private static Scanner scanner;

	public static void main(String[] args) {
		String texto;
		int i, cont = 0;
		scanner = new Scanner(System.in);

		System.out.println("Digite o texto:");
		texto = scanner.nextLine();

		String[] textoVetor = texto.split(" ");

		// a) Colocar todas as palavras de um texto ordenadas alfabeticamente.
		// Não pode haver repetição de palavras.

		Set<String> ordenado = new TreeSet<String>();

		for (i = 0; i < textoVetor.length; i++) {
			ordenado.add(new String(textoVetor[i]));
		}
		
		//b) Contar a frequência das palavras de um texto.

		Map<String, Integer> frequencia = new HashMap<String, Integer>();

		for (i = 0; i < textoVetor.length; i++) {
			textoVetor[i] = textoVetor[i].toLowerCase();
			if (frequencia.containsKey(textoVetor[i])) {
				cont = frequencia.get(textoVetor[i]);
				frequencia.put(textoVetor[i], cont + 1);
			} else {
				frequencia.put(textoVetor[i], 1);
			}
		}
		
		//c) A partir da leitura de um texto, gerar o 
		// mesmo com as palavras embaralhadas. 
		
		List<String> textoEmbaralhado = new LinkedList<String>();
		
		for (i = 0; i < textoVetor.length; i++) {
			textoEmbaralhado.add(textoVetor[i]);
	    }
		Collections.shuffle(textoEmbaralhado);
		
		// d) Gerar 20 números sorteados de 1 a 50 sem repetição e depois exibi-los em ordem crescente.
		
		
		// e) Receber uma lista de nomes de pessoas numa ordem qualquer. Manter a coleção de nomes
		// ordenada alfabeticamente, mesmo enquanto a entrada estiver sendo feita, e também manter
		// um campo com a quantidade de ocorrências.

		System.out.println("A: " + ordenado);
		System.out.println("B: " + frequencia);
		System.out.println("C: " + textoEmbaralhado);
	}

}
