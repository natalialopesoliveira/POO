import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TreeSet;

/**
 * Exemplo de:
 * 1. uso das cole��es: LinkedList, TreeSet e HashMap
 * 2. uso de tipifica��o em cole��es (Classes Gen�ricas)
 * 3. serializa��o de objetos
 * 4. classes wrapper
 * <p>
 * <b> Cole��es usadas: </b>
 * <p>
 * <b> LinkedList </b> - aceita elementos repetidos; permite acesso aleat�rio do
 * n-esimo elemento; apesar de percorrer sequencialmente a lista (da frente para tr�s
 * ou vice-versa, dependendo do que for mais pr�ximo);
 * mant�m a mesma ordem da inser��o; para usar uma pesquisa bin�ria (muito mais r�pida que a linear), 
 * com o m�todo est�tico Collections.binarySearch(lista), os elementos dever�o estar ordenados.

 * <p>
 * <b> TreeSet </b> - n�o aceita elementos repetidos; mant�m os elementos
 * ordenados a cada inser��o, possui busca r�pida; � ruim para acessar os
 * elementos sequencialmente
 * <p>
 * <b> HashMap </b> - bom para casos onde o importante � acessar um elemento a
 * partir de uma chave; n�o aceita repeti��o da chave de busca mas permite que o
 * elemento seja repetido; � ruim para acessar os elementos sequencialmente
 * <p>
 * Estas classes de cole��es foram encapsuladas em outras classes para facilitar o seu uso
 * <p>
 * Os objetos s�o depois gravados em disco atrav�s da serializa��o.
 * <p>
 * Tipos primitivos s� podem ser inseridos em cole��es por interm�dio de
 * classes wrapper (em vers�es mais recente do Java � poss�vel inserir tipos primitivos)
 * 
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 *
 */
public class Uso {
	public static void main(String[] args) {
		try {
			// ------------------------------------------------------------
			// teste 1: LinkedList
			ColecaoAmigosLinkedList amigos1 = new ColecaoAmigosLinkedList();
			amigos1.insere("Tia", "3232-2222", 23);
			amigos1.insere("Bia", "2232-2223",  13);
			amigos1.insere("Maria", "2121-2224",  53);
			amigos1.insere("Luzia", "3333-2225",  43);
			amigos1.insere("Maria", "3223-2226",  53);
			System.out.println("\nLista n�o ordenada:\n"+amigos1);
			amigos1.ordenaPorNome();
			System.out.println("Lista ordenada por nome:\n"+amigos1.toString());
			System.out.println("Resultado da busca por Maria: "+amigos1.busca("Maria"));

			Arquivo.grava("amigos1.my",amigos1);
			ColecaoAmigosLinkedList amigos1b;
			amigos1b = (ColecaoAmigosLinkedList)Arquivo.le("amigos1.my");
			System.out.println("Dados lidos do arquivo:\n"+amigos1b.toString());

			// ------------------------------------------------------------
			// teste 2: TreeSet
			// s� funciona se colocar Strings dentro do TreeSet
			ColecaoAmigosTreeSet amigos2 = new ColecaoAmigosTreeSet();
			amigos2.insere("Tia", "3232-2222", 23);
			amigos2.insere("Bia", "2232-2223",  13);
			amigos2.insere("Maria", "2121-2224",  53);
			amigos2.insere("Luzia", "3333-2225",  43);
			amigos2.insere("Maria", "3223-2226",  53);
			System.out.println("\nConte�do do conjunto (sem repeti��o):\n"+amigos2.toString());
			System.out.println("Resultado da busca por Maria: "+amigos2.existe("Maria"));

			Arquivo.grava("amigos2.my",amigos2);
			ColecaoAmigosTreeSet amigos2b;
			amigos2b = (ColecaoAmigosTreeSet)Arquivo.le("amigos2.my");
			System.out.println("Dados lidos do arquivo:\n"+amigos2b.toString());

			// ------------------------------------------------------------
			// teste 3: HashMap
			ColecaoAmigosHashMap amigos3 = new ColecaoAmigosHashMap();
			amigos3.insere("Tia", "3232-2222", 23);
			amigos3.insere("Bia", "2232-2223",  13);
			amigos3.insere("Maria", "2121-2224",  53);
			amigos3.insere("Luzia", "3333-2225",  43);
			amigos3.insere("Maria", "3223-2226",  53);
			System.out.println("\nConte�do do mapa (sem repeti��o):\n"+amigos3.toString());
			System.out.println("Resultado da busca por Maria: "+amigos3.busca("Maria"));

			Arquivo.grava("amigos3.my",amigos3);
			ColecaoAmigosHashMap amigos3b;
			amigos3b = (ColecaoAmigosHashMap)Arquivo.le("amigos3.my");
			System.out.println("Dados lidos do arquivo:\n"+amigos3b.toString());

			// ------------------------------------------------------------
			// teste 4: inteiros primitivos
			// sorteia 20 n�meros de 1 a 50, armazena num TreeSet (sem repeti��o:
			// � poss�vel que sejam armazenados menos do que 20 n�meros),
			// grava em disco,
			// l� do disco e exibe
			TreeSet<Integer> conjuntoInteiros = new TreeSet<Integer>();
			int sorteado;
			for(int i = 0; i < 20; i++) {
				sorteado = (int)(Math.random()*50) + 1;
				// empacota o int (primitivo) num objeto Integer para poder inserir na cole��o
				conjuntoInteiros.add(new Integer(sorteado));
			}
			System.out.println("\nConte�do do conjunto (sem repeti��o e ordenado):\n"+conjuntoInteiros.toString());
			System.out.println("Resultado da busca do n�mero 25: "+conjuntoInteiros.contains(new Integer(25)));

			Arquivo.grava("conjunto.my",conjuntoInteiros);
			TreeSet<Integer> conjuntoInteiros2;
			conjuntoInteiros2 = (TreeSet<Integer>)Arquivo.le("conjunto.my");
			System.out.println("Dados lidos do arquivo:\n"+conjuntoInteiros2.toString());

		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivpo n�o encontrado");
		}
		catch(IOException e) {
			System.out.println("Problemas na leitura ou grava��o do arquivo");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Classe inexistente usada na convers�o");
		}
	}
}
