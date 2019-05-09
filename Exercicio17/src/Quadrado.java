
public class Quadrado extends FormaGeometrica {
	private double comprimento;

	public Quadrado() {
		this(new Ponto(), 1, 1, true);
	}

	public Quadrado(double _x, double _y, double _espessura, double _comprimento, boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _solido);
	}

	public Quadrado(Coordenada _x, double _y, double _espessura, double _comprimento, boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _solido);
	}

	public Quadrado(double _x, Coordenada _y, double _espessura, double _comprimento, boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _solido);
	}

	public Quadrado(Coordenada _x, Coordenada _y, double _espessura, double _comprimento, boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _solido);
	}

	public Quadrado(Ponto _ponto, double _espessura, double _comprimento, boolean _solido) {
		super(_ponto,_espessura, _solido);
		this.setComprimento(_comprimento);
	}

	// set
	public void setComprimento(double _comprimento) {
		this.comprimento = _comprimento;
	}

	// get
	public double getComprimento() {
		return this.comprimento;
	}

	// métodos abstract
	@Override
	public double area() {
		return this.comprimento * this.comprimento;
	}

	@Override
	public double perimetro() {
		return 4 * this.comprimento;
	}

	// toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nComprimento: ");
		dados.append(this.getComprimento());
		return dados.toString();
	}
}
