//Crie um método para verificar se uma determinada nota ultrapassou o limite permitido. Reflita se este
//método deve ser estático ou não e explique o porquê da sua decisão
//	Deve sim ser estático, pois noo momento em que se cadastra um aluno,
//	é necessário ver se a nota se encontra dentro do limite pré-estabelecido.
//	Depois que o aluno já está cadastrado, toda nota se encontra dentro dos limites,
//	então é inútil a verificação.

public class AlunoComTratamentoDeErro {
	private String nome;
	private double nota1, nota2, media, pontos;
	static final public double DEFAULT_LIMITE = 10.0;
	static private double limite = Aluno.DEFAULT_LIMITE;

	public AlunoComTratamentoDeErro(String _nome, double _nota1, double _nota2, double _pontos) throws Exception{
		this.setNome(_nome);
		this.setNotas(_nota1, _nota2, _pontos);
	}

	public AlunoComTratamentoDeErro(double _nota1, double _nota2, double _pontos) throws Exception{
		this("", _nota1, _nota2, _pontos);
	}

	public AlunoComTratamentoDeErro(double _nota1, double _nota2) throws Exception{
		this(_nota1, _nota2, 0.0);
	}

	public AlunoComTratamentoDeErro() throws Exception{
		this(0.0, 0.0);
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public void setNotas(double _nota1, double _nota2, double _pontos) throws Exception{
		this.setPontos(_pontos);
		if (_nota1 <= AlunoComTratamentoDeErro.limite && _nota2 <= AlunoComTratamentoDeErro.limite) {
		this.nota1 = _nota1;
		this.nota2 = _nota2;
		} else throw new Exception("Nota(s) maior(es) que o limite permitido.");
		this.calculaMedia();
	}

	public void setPontos(double _pontos) throws Exception{
		if(_pontos <= AlunoComTratamentoDeErro.limite) this.pontos = _pontos;
		else throw new Exception("Pontos maiores que o limite permitido.");
	}

	public void setNotas(double _nota1, double _nota2) throws Exception{
		this.setNotas(_nota1, _nota2, 0.0);
	}

	public static void setLimite(double _limite) {
		AlunoComTratamentoDeErro.limite = _limite;
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
		return AlunoComTratamentoDeErro.limite;
	}

	private double calculaMedia() {
		this.media = (this.getNota1() + this.getNota2() + this.getPontos()) / 2;
		if (this.media > AlunoComTratamentoDeErro.limite)
			this.media = AlunoComTratamentoDeErro.limite;
		return this.media;
	}
	
	public static boolean verificaNota(double _nota) {
		if(_nota > AlunoComTratamentoDeErro.limite) return false;
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
