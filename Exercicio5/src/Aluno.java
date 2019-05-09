
public class Aluno {
	private String nome;
	private double nota1, nota2, media, pontos;
	static final public double DEFAULT_LIMITE = 10.0;
	static private double limite = Aluno.DEFAULT_LIMITE;

	public Aluno(String _nome, double _nota1, double _nota2, double _pontos) {
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}

	public Aluno(double _nota1, double _nota2, double _pontos) {
		this("", _nota1, _nota2, _pontos);
	}

	public Aluno(double _nota1, double _nota2) {
		this(_nota1, _nota2, 0.0);
	}

	public Aluno() {
		this(0.0, 0.0);
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public void setNotas(double _nota1, double _nota2, double _pontos) {
		this.setPontos(_pontos);
		this.nota1 = _nota1;
		this.nota2 = _nota2;
		this.calculaMedia();
	}

	public void setPontos(double _pontos) {
		this.pontos = _pontos;
	}

	public void setNotas(double _nota1, double _nota2) {
		this.setNotas(_nota1, _nota2, 0.0);
	}

	public static void setLimite(double _limite) {
		Aluno.limite = _limite;
	}

	public String getNome() {
		return this.nome;
	}

	public double getNota1() {
		return this.nota1;
	}

	public double getNota2() {
		return this.nota2;
	}

	public double getMedia() {
		return this.media;
	}

	public double getPontos() {
		return this.pontos;
	}
	
	public static double getLimite() {
		return Aluno.limite;
	}

	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos()) / 2;
		if (this.media > Aluno.limite)
			this.media = Aluno.limite;
		return this.media;
	}
	
	public static boolean verificaNota(double _nota) {
		if(_nota > Aluno.limite) return false;
		else return true;
	}
	//Deve ser estático, pois na hora de criar a nota, é bom verificar se ela se encontra dentro dos antes de criar o objeto de fato.

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(this.getNome());
		dados.append("\nNota 1: ");
		dados.append(this.getNota1());
		dados.append("\nNota 2: ");
		dados.append(this.getNota2());
		dados.append("\nPontos: ");
		dados.append(this.getPontos());
		dados.append("\nMédia: ");
		dados.append(this.getMedia());

		return dados.toString();
	}
}
