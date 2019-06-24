import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Encapsula a classe HashMap facilitando o seu uso e tipificando os objetos para
 * inclus�o como inst�ncias da classe Amigo
 *
 * @author Henrique M. C.
 * @version 1.0 (maio-2019)
*/
public class ColecaoAmigosHashMap implements Serializable {
	private Map<String,Amigo> grupo;

	ColecaoAmigosHashMap() {
		grupo = new HashMap<String,Amigo>();
	}

	/**
	 * Insere uma inst�ncia da classe Amigo
	 *
	 * @param _amigo objeto a ser inclu�do da cole��o
	 */
	public void insere(Amigo _amigo) {
		this.grupo.put(_amigo.getNome(), _amigo);
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
	 * Verifica a exist�ncia de uma int�ncia atrav�s da chave nome
	 * @param _nome nome a ser pesquisado
	 * @return true se achou <p>
	 *     	false se n�o achou
	 */
	public boolean existe(String _nome) {
		return this.grupo.containsKey(_nome);
	}

	/**
	 * Realiza busca de uma inst�ncia da classe Amigo atrav�s da sua chave (nome)
	 * @param _nome nome a ser pesquisado
	 * @return retorna a inst�ncia associada ao nome pesquisado
	 *     	<p>
	 *     	Se n�o encontrar retorna null
	 */
	public Amigo busca(String _nome) {
		// este cast para Amigo � necess�rio pois o retorno do get � um Object
		return (Amigo) this.grupo.get(_nome);

	}

	/**
	 * Sobreposi��o do m�todo toString para retornar todo o conte�do da cole��o
	 * separando os elementos por espa�os
	 * @return retorna ums String com todos os dados
	 */
	public String toString() {
		StringBuilder s = new StringBuilder("HashMap = ");
		Iterator i = this.grupo.keySet().iterator();
		while (i.hasNext())
			s.append((Amigo) this.grupo.get((String) i.next()) + " ");
		return s.toString();
	}
}
