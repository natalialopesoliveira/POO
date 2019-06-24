import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Encapsula a classe TreeSet facilitando o seu uso e tipificando os objetos para
 * inclus�o como inst�ncias da classe Amigo
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
 */
public class ColecaoAmigosTreeSet implements Serializable {
	private Set<Amigo> grupo;

	ColecaoAmigosTreeSet() {
		grupo = new TreeSet<Amigo>();
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
	 * Verifica a exist�ncia de uma int�ncia atrav�s do campo nome
	 * @param _nome nome a ser pesquisado
	 * @return true se achou <p>
	 *     	false se n�o achou
	 */
	public boolean existe(String _nome) {
		return this.grupo.contains(new Amigo(_nome));
	}

	/**
	 * Sobreposi��o do m�todo toString para retornar todo o conte�do da cole��o
	 * separando os elementos por espa�os
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder("TreeSet = ");
		Iterator i = this.grupo.iterator();
		while (i.hasNext())
			s.append(i.next() + " ");
		return s.toString();
	}
}
