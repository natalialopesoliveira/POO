import java.io.Serializable;
import java.util.Comparator;

/**
 * Usada como objeto de teste para compor as classes que encapsulam as cole��es
 * LinkedList, TreeSet e HashMap
 * <p>
 * Implementa a interface Comparable, pois implementa o m�todo
 * compareTo que � usado na cole��o TreeSet. Tamb�m poderia ser usado
 * pelo m�todo sort (com um argumento) da classe Collections
 * <p>
 * Implementa a interface Serializable, para permitir que as suas inst�ncias possam
 * ser usadas numa serializa��o (por exemplo, grava��o em disco)
 * 
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
public class Sorteio implements Comparable<Sorteio>, Serializable {
	/** nome do amigo */
	private Data data;

	/**
	 * construtor para inicializar valores nos campos
	 *
	 * @param _nome nome do amigo
	 * @param _telefone telefone do amigo
	 * @param _idade idade do amigo
	 */
	public Amigo(String _nome, String _telefone, int _idade) {
		this.nome = _nome;
		this.telefone = _telefone;
		this.idade = _idade;
	}

	/**
	 * construtor para inicializar somente o nome
	 *
	 * @param _nome nome do amigo
	 */
	public Amigo(String _nome) {
		this(_nome, "", 0);
	}

	/**
	 * pega o nome
	 * 
	 * @return nome
	 */
	public String getNome() {
		return this.nome;
	}
	/**
	 * pega o telefone
	 * 
	 * @return telefone
	 */
	public String getTelefone() {
		return this.telefone;
	}
	/**
	 * pega a idade
	 * 
	 * @return idade
	 */
	public int getIdade() {
		return this.idade;
	}
	/**
	 * M�todo sobreposto para devolver os campos formatados em uma String
	 * 
	 * @return retorna String com todos os valores dos campos
	 */
	public String toString() {
		StringBuilder retorno = new StringBuilder(this.getNome());
		retorno.append(";");
		retorno.append(this.getTelefone());
		retorno.append(";");
		retorno.append(this.getIdade());
		return retorno.toString();
	}

	/**
	 * M�todo necess�rio para a classe TreeSet, pois ela tem que verificar se h�
	 * elementnos repetidos no conjunto atrav�s do crit�rio determinado por
	 * compareTo, al�m disso, fornece um algoritmo compararar elementos na busca
	 * feita com o m�todo contains
	 * 
	 * @return inteiro, 1 se maior, -1 se menor ou 0 se igual
	 */
	public int compareTo(Amigo obj) {
		return this.nome.compareTo(obj.nome);
	}

	/**
	 * Este � m�todo � necess�rio ser colocao numa classe sempre que acontecer
	 * buscas realizadas em HashMap quando a chave � um objeto desta classe
	 * <p>
	 * Neste caso ser� usado o c�digo hash da concatena��o dos campos
	 * Para que este m�todo seja �til ser� necess�rio procurar por um
	 * objeto amigo completo numa HashMap que foi constru�da desta forma
	 * <p>
	 * Normalmente as classes fornecidas pelo Java j� possuem hashCode.
	 * 
	 * @return inteiro para ser usado como c�digo hash
	 */
	public int hashCode() {
		return (this.nome+this.telefone+this.idade).hashCode();
	}


}


/**
 * Fornece um m�todo para ser usado na ordena��o de v�rias inst�ncias da classe
 * Amigo pelo nome.
 * <p>
 * Esta ordena��o � realizada pelo m�todo est�tico sort da classe Collections
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 *
 */
class ComparaPorNome implements Comparator<Amigo> {
  	public int compare(Amigo amigo1, Amigo amigo2) {
        	return amigo1.getNome().compareToIgnoreCase(amigo2.getNome());
  	}
}
 
/**
 * Fornece um m�todo para ser usado na ordena��o de v�rias inst�ncias da classe
 * Amigo pela idade.
 * <p>
 * Esta ordena��o � realizada pelo m�todo est�tico sort da classe Collections
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
class ComparaPorIdade implements Comparator<Amigo> {
  	public int compare(Amigo amigo1, Amigo amigo2) {
        	int idade1 = amigo1.getIdade();
        	int idade2 = amigo2.getIdade();
        	if (idade1 > idade2)
              	return 1;
        	else if (idade1 < idade2)
              	return -1;
        	else
              	return 0;
  	}
}
