
public class Ponto {
	private double x, y;
	static final public double DEFAULT_LIMITE_INFERIOR = 0;
	static final public double DEFAULT_LIMITE_SUPERIOR = 500;
	static private double limiteInferior = Ponto.DEFAULT_LIMITE_INFERIOR;
	static private double limiteSuperior = Ponto.DEFAULT_LIMITE_SUPERIOR;
	
	public Ponto() throws Exception {
		this(0, 0);
	}

	public Ponto(double _x, double _y) throws Exception {
		this.setX(_x);
		this.setY(_y);
	}

	public Ponto(String _ponto) throws Exception {
		this.setPonto(_ponto);
	}

	public void setPonto(String _ponto) throws Exception {
		if (_ponto.indexOf("(") == 0 && _ponto.indexOf(")") == (_ponto.length() - 1) && _ponto.indexOf(",") != -1) {
			this.setX(Double.parseDouble(_ponto.substring(1, _ponto.indexOf(","))));
			this.setY(Double.parseDouble(_ponto.substring(_ponto.indexOf(",") + 1, _ponto.indexOf(")"))));
		} else {
			throw new Exception("Dado errado");
		}
	}

	public void setX(double _x) throws Exception {
		if (_x >= Ponto.limiteInferior && _x <= Ponto.limiteSuperior)
			this.x = _x;
		else
			throw new Exception("O valor da coordenada x está fora dos limites determinados.");
	}

	public void setY(double _y) throws Exception {
		if (_y >= Ponto.limiteInferior && _y <= Ponto.limiteSuperior)
			this.y = _y;
		else
			throw new Exception("O valor da coordenada y está fora dos limites determinados.");
	}

	public static void setLimiteInferior(double _limite) {
		Ponto.limiteInferior = _limite;
	}

	public static void setLimiteSuperior(double _limite) {
		Ponto.limiteSuperior = _limite;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public static double getLimiteInferior() {
		return Ponto.limiteInferior;
	}

	public static double getLimiteSuperior() {
		return Ponto.limiteSuperior;
	}

	public boolean equals(Ponto _ponto) {
		if (this.getX() == _ponto.getX() && this.getY() == _ponto.getY())
			return true;
		return false;
	}

	public Ponto clonar() throws Exception {
		Ponto _ponto = new Ponto(this.getX(), this.getY());
		return _ponto;
	}

	public Ponto criaSwap() throws Exception {
		Ponto _ponto = new Ponto(this.getY(), this.getX());
		return _ponto;
	}

	public boolean temEixoComum(Ponto _ponto) {
		if (this.getX() == _ponto.getX() || this.getY() == _ponto.getY())
			return true;
		return false;
	}

	public double distancia(Ponto _ponto) throws Exception {
		return distancia(this.getX(), this.getY(), _ponto.getX(), _ponto.getY());
	}

	public double distancia(double _x, double _y) throws Exception {
		return distancia(this.getX(), this.getY(), _x, _y);
	}

	public static double distancia(Ponto _ponto1, Ponto _ponto2) throws Exception {
		return distancia(_ponto1.getX(), _ponto1.getY(), _ponto2.getX(), _ponto2.getY());
	}

	public static double distancia(double _x1, double _y1, double _x2, double _y2) throws Exception {
		double dist;
		if (_x1 >= Ponto.limiteInferior && _x1 <= Ponto.limiteSuperior && _y1 >= Ponto.limiteInferior
				&& _y1 <= Ponto.limiteSuperior && _x2 >= Ponto.limiteInferior && _x2 <= Ponto.limiteSuperior
				&& _y2 >= Ponto.limiteInferior && _y2 <= Ponto.limiteSuperior) {
			dist = Math.sqrt((_x1 - _x2) * (_x1 - _x2) + (_y1 - _y2) * (_y1 - _y2));
			return dist;
		} else
			throw new Exception("O valor da coordenada do ponto passado está fora do limite determinado");
	}

	public double distanciaDaOrigem() throws Exception {
		return distancia(this.getX(), this.getY(), 0, 0);
	}

	public int compareTo(Ponto _ponto) throws Exception {
		if(this.distanciaDaOrigem() > _ponto.distanciaDaOrigem())
			return 1;
		else if(this.distanciaDaOrigem() == _ponto.distanciaDaOrigem())
			return 0;
		else
			return -1;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("(");
		dados.append(this.getX());
		dados.append(",");
		dados.append(this.getY());
		dados.append(")");
		return dados.toString();
	}
}
