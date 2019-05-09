
public interface ItemDeBiblioteca {
	boolean isEmprestado();
	void empresta();
	void devolve();
	String localiza();
	String apresentaDescricao();
}
