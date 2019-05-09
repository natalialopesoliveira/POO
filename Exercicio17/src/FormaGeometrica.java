
abstract public class FormaGeometrica {
	private Ponto ponto;
	private double espessura;
	private boolean solido;
	

	// construtores
	public FormaGeometrica() {
		this(new Ponto(), 1, true);
	}

	public FormaGeometrica(double _x, double _y, double _espessura, boolean _solido) {
		this(new Coordenada(_x), new Coordenada(_y), _espessura, _solido);
	}

	public FormaGeometrica(Coordenada _x, double _y, double _espessura, boolean _solido) {
		this(_x, new Coordenada(_y), _espessura, _solido);
	}

	public FormaGeometrica(double _x, Coordenada _y, double _espessura, boolean _solido) {
		this(new Coordenada(_x), _y, _espessura, _solido);
	}

	public FormaGeometrica(Coordenada _x, Coordenada _y, double _espessura, boolean _solido) {
		this(new Ponto(_x, _y), _espessura, _solido);
	}

	public FormaGeometrica(Ponto _ponto, double _espessura, boolean _solido) {
		this.setPonto(_ponto);
		this.setEspessura(_espessura);
		this.setSolido(_solido);
	}

	// sets
	public void setPonto(Ponto _ponto) {
		this.ponto = _ponto;
	}

	public void setPonto(double _x, double _y) {
		this.ponto = new Ponto(_x, _y);
	}

	public void setPonto(Coordenada _x, double _y) {
		this.ponto = new Ponto(_x, _y);
	}

	public void setPonto(double _x, Coordenada _y) {
		this.ponto = new Ponto(_x, _y);
	}

	public void setPonto(Coordenada _x, Coordenada _y) {
		this.ponto = new Ponto(_x, _y);
	}

	public void setEspessura(double _espessura) {
		this.espessura = _espessura;
	}
	
	public void setSolido(boolean _solido) {
		this.solido = _solido;
	}

	// gets
	public Ponto getPonto() {
		return this.ponto;
	}

	public double getEspessura() {
		return this.espessura;
	}
	
	public boolean getSolido() {
		return this.solido;
	}
	
	abstract public double area();
	
	abstract public double perimetro();

	// toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("\nPonto: ");
		dados.append(this.ponto.toString());
		dados.append("\nEspessura: ");
		dados.append(this.getEspessura());
		dados.append("\nSólido: ");
		if(this.getSolido()) dados.append("Sim.");
		else dados.append("Não.");
		return dados.toString();
	}
}
