
public class Retangulo {

	private Ponto EsqSup, DirInf;

	public Retangulo(double _x1, double _y1, double _x2, double _y2) throws Exception {
		this(new Ponto(_x1, _y1), new Ponto(_x2, _y2));
	}

	public Retangulo(Ponto _ponto1, Ponto _ponto2) throws Exception {
		if (_ponto1.getX() < _ponto2.getX() && _ponto1.getY() > _ponto2.getY()) {
			this.setEsqSup(_ponto1);
			this.setDirInf(_ponto2);
		} else if (_ponto1.getX() > _ponto2.getX() && _ponto1.getY() < _ponto2.getY()) {
			this.setEsqSup(_ponto2);
			this.setDirInf(_ponto1);
		} else {
			throw new Exception("Pontos não representam o esquerdo superior nem o direito inferior.");
		}
	}

	public Retangulo() throws Exception {
		this(new Ponto(), new Ponto());
	}

	public void setEsqSup(Ponto _ponto) {
		this.EsqSup = _ponto;
	}

	public void setDirInf(Ponto _ponto) {
		this.DirInf = _ponto;
	}

	public Ponto getEsqSup() {
		return this.EsqSup;
	}

	public Ponto getDirInf() {
		return this.DirInf;
	}

	public double calculaArea() throws Exception {
		return this.calculaAltura() * this.calculaLargura();
	}

	public double calculaPerimetro() throws Exception {
		return (2 * this.calculaAltura() + 2 * this.calculaLargura());
	}

	public boolean equals(Retangulo _retangulo) {
		if (this.getDirInf().equals(_retangulo.getDirInf()) && this.getEsqSup().equals(_retangulo.getEsqSup()))
			return true;
		return false;
	}

	public boolean equalsArea(Retangulo _retangulo) throws Exception {
		if (this.calculaArea() == _retangulo.calculaArea())
			return true;
		return false;
	}
	
	public int compareTo(Retangulo _retangulo) throws Exception {
		if(this.calculaArea() > _retangulo.calculaArea())
			return 1;
		else if(this.calculaArea() == _retangulo.calculaArea())
			return 0;
		else return -1;
	}

	public double calculaAltura() throws Exception {
		double altura;
		altura = this.getEsqSup().distancia(this.getEsqSup().getX(), this.getDirInf().getY());
		return altura;
	}

	public double calculaLargura() throws Exception {
		double largura;
		largura = this.getDirInf().distancia(this.getEsqSup().getX(), this.getDirInf().getY());
		return largura;
	}
	
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.getEsqSup().toString());
		dados.append(" - ");
		dados.append(this.getDirInf().toString());
		
		return dados.toString();
	}
}
