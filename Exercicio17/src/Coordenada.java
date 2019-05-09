
public class Coordenada {
	private double valor;
	
	//construtores
	public Coordenada() {
		this(0);
	}
	
	public Coordenada(double _valor) {
		this.setCoordenada(_valor);
	}
	
	//métodos set
	public void setCoordenada(double _valor) {
		this.valor = _valor;
	}
	
	//métodos get
	public double getCoordenada() {
		return this.valor;
	}
	
	//toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getCoordenada());
		return dados.toString();
	}
}
