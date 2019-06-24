import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Encapsula a classe LinkedList facilitando o seu uso e tipificando os objetos
 * para inclus�o como inst�ncias da classe Amigo
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
public class ColecaoAmigosLinkedList implements Serializable {
	private List<Amigo> grupo;

	ColecaoAmigosLinkedList() {
		grupo = new LinkedList<Amigo>();
	}

	/**
	 * Insere uma inst�ncia da classe Amigo
	 *
	 * @param _amigo objeto a ser inclu�do da cole��o
	 */
	public void insere(Amigo _amigo) {
		this.grupo.add(_amigo);
	}

	/**
	 * Insere uma inst�ncia da classe Amigo por interm�dio dos seus campos
	 *
	 * @param _nome nome a ser inserido
	 * @param _tel telefone a ser inserido
	 * @param _idade idade a ser inserida
	 */
	public void insere(String _nome, String _tel, int _idade) {
		this.insere(new Amigo(_nome, _tel, _idade));
	}

	/**
	 * Realiza busca de uma inst�ncia da classe Amigo atrav�s do seu nome
	 * <p>
	 * <b>IMPORTANTE:</b> a cole��o deve estar ordenada por nome
	 *
	 * @param _nome	nome a ser pesquisado
	 * @return retorna a inst�ncia associada ao nome pesquisado (n�o existe
	 *     	precis�o da posi��o - se primeiro ou se �ltimo, ...)
	 *     	<p>
	 *     	Se n�o encontrar retorna null
	 */
	public Amigo busca(String _nome) {
		// o m�todo binarySearsh requer 3 argumentos: a cole��o usada na
		// pesquisa, o elemento a ser pesquisado, e a forma como o elemento ser� pesquisado
		int pos = Collections.binarySearch(this.grupo, new Amigo(_nome),
				new ComparaPorNome());
		if (pos >= 0)
			// este cast para Amigo � necess�rio pois o retorno do get � um Object
			return (Amigo) grupo.get(pos);
		else
			return null;
	}

	/**
	 * Ordena a cole��o pelo nome
	 */
	public void ordenaPorNome() {
		// o m�todo est�tico sort da classe Collections necessita
		// 2 argumentos: a cole��o que ser� ordenada,
		// e a forma como ela ser� ordenada.
		// Existe uma vers�o sobrecarregada para 1 argumento, neste caso,
		// � usado o m�todo compareTo da classe base
		Collections.sort(this.grupo, new ComparaPorNome());
	}

	/**
	 * Ordena a cole��o pela idade
	 */
	public void ordenaPorIdade() {
		Collections.sort(this.grupo, new ComparaPorIdade());
	}

	/**
	 * Sobreposi��o do m�todo toString para retornar todo o conte�do da cole��o
	 * separando os elementos por espa�os
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder("LinkedList = ");
		for (int i = 0; i < this.grupo.size(); i++)
			s.append(this.grupo.get(i) + " ");
		return s.toString();
	}
}

