
public class Pessoa {
	private String nome;
	private String identidade;
	private Data dataDeNascimento;

	// construtores sobrecarregados

//	public Pessoa(String _nome, String _identidade, int _dia, int _mes, int _ano) throws Exception {
//		this.setNome(_nome);
//		this.setIdentidade(_identidade);
//		this.setDataDeNascimento(_dia, _mes, _ano);
//	}

	public Pessoa(String _nome, String _identidade, String _data) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataDeNascimento(_data);
	}
	
	public Pessoa(String _nome, String _identidade, Data _data) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataDeNascimento(_data);
	}
	
	public Pessoa() throws Exception {
		this("", "", "1/1/1990");
	}

	// métodos set sobrecarregados
	public void setNome(String _nome) throws Exception {
		this.nome = _nome;
	}

	public void setIdentidade(String _identidade) throws Exception{
		this.identidade = _identidade;
	}

//	public void setDataDeNascimento(int _dia, int _mes, int _ano) throws Exception {
//		this.dataDeNascimento = new Data(_dia, _mes, _ano);
//	}

	public void setDataDeNascimento(String _data) throws Exception {
		this.dataDeNascimento = new Data(_data);
	}
	
	public void setDataDeNascimento(Data _data) throws Exception {
		this.dataDeNascimento = _data;
	}

	// métodos get
	public String getNome() {
		return this.nome;
	}

	public String getIdentidade() {
		return this.identidade;
	}

	public Data getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public double valorMaximoEmprestimo() {
		return 1000;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(this.getNome());
		dados.append("\nIdentidade: ");
		dados.append(this.getIdentidade());
		dados.append("\nData de Nascimento: ");
		dados.append(this.getDataDeNascimento().getData());

		return dados.toString();
	}
}
