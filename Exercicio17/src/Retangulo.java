
public class Retangulo extends Quadrado {
	private double largura;

	// construtores
	public Retangulo() {
		this(new Ponto(), 1, 1, 1, true);
	}

	public Retangulo(double _x, double _y, double _espessura, double _comprimento, double _largura, boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _largura, _solido);
	}

	public Retangulo(Coordenada _x, double _y, double _espessura, double _comprimento, double _largura,
			boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _largura, _solido);
	}

	public Retangulo(double _x, Coordenada _y, double _espessura, double _comprimento, double _largura,
			boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _largura, _solido);
	}

	public Retangulo(Coordenada _x, Coordenada _y, double _espessura, double _comprimento, double _largura,
			boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _comprimento, _largura, _solido);
	}

	public Retangulo(Ponto _ponto, double _espessura, double _comprimento, double _largura, boolean _solido) {
		super(_ponto, _espessura, _comprimento, _solido);
		this.setLargura(_largura);
	}

	// sets
	public void setLargura(double _largura) {
		this.largura = _largura;
	}

	// gets
	public double getLargura() {
		return this.largura;
	}

	// métodos abstract
	@Override
	public double area() {
		return super.getComprimento() * this.largura;
	}

	@Override
	public double perimetro() {
		return 2 * super.getComprimento() + 2 * this.largura;
	}

	// toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nLargura: ");
		dados.append(this.getLargura());
		return dados.toString();
	}
}
