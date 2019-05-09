
public class Ponto {
	private Coordenada x, y;

	// construtores sobrecarregados
	public Ponto() {
		this(0, 0);
	}

	public Ponto(double _x, double _y) {
		this(new Coordenada(_x), new Coordenada(_y));
	}

	public Ponto(Coordenada _x, double _y) {
		this(_x, new Coordenada(_y));
	}

	public Ponto(double _x, Coordenada _y) {
		this(new Coordenada(_x), _y);
	}

	public Ponto(Coordenada _x, Coordenada _y) {
		this.setX(_x);
		this.setY(_y);
	}
	
	//metodos set
	public void setX(double _x) {
		this.x = new Coordenada(_x);
	}
	
	public void setY(double _y) {
		this.y = new Coordenada(_y);
	}
	
	public void setX(Coordenada _x) {
		this.x = _x;
	}
	
	public void setY(Coordenada _y) {
		this.y = _y;
	}
	
	//métodos get
	
	public Coordenada getX() {
		return this.x;
	}
	
	public Coordenada getY() {
		return this.y;
	}
	
	//toString()
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.getX().toString());
		dados.append(",");
		dados.append(this.getY().toString());
		dados.append(")");
		return dados.toString();
	}
}
