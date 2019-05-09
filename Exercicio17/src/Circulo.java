
public class Circulo extends FormaGeometrica {
	private double raio;

	// construtores
	public Circulo() {
		this(new Ponto(), 1, 1, true);
	}

	public Circulo(double _x, double _y, double _raio, double _espessura, boolean _solido) {
		this(new Ponto(_x, _y), _raio, _espessura, _solido);
	}

	public Circulo(Coordenada _x, double _y, double _raio, double _espessura, boolean _solido) {
		this(new Ponto(_x, _y), _raio, _espessura, _solido);
	}

	public Circulo(double _x, Coordenada _y, double _raio, double _espessura, boolean _solido) {
		this(new Ponto(_x, _y), _raio, _espessura, _solido);
	}

	public Circulo(Coordenada _x, Coordenada _y, double _raio, double _espessura, boolean _solido) {
		this(new Ponto(_x, _y), _raio, _espessura, _solido);
	}

	public Circulo(Ponto _ponto, double _raio, double _espessura, boolean _solido) {
		super(_ponto, _espessura, _solido);
		this.setRaio(_raio);
	}

	// sets
	public void setRaio(double _raio) {
		this.raio = _raio;
	}

	// gets
	public double getRaio() {
		return this.raio;
	}

	// métodos do abstract
	@Override
	public double area() {
		return Math.PI * this.raio * this.raio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.raio;
	}

	// toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nRaio: ");
		dados.append(this.getRaio());
		return dados.toString();
	}
}
