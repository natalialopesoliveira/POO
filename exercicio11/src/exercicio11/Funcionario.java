package exercicio11;

public class Funcionario extends Pessoa {
	private Data dataDeAdmissao;
	private double salario;

	// construtores sobrecarregados
	public Funcionario(String _nome, String _identidade, String _dataDeNascimento, String _dataDeAdmissao,
			double _salario) throws Exception {
		super(_nome, _identidade, _dataDeNascimento);
		this.setDataDeAdmissao(_dataDeAdmissao);
		this.setSalario(_salario);
	}

	public Funcionario(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
			String _dataDeAdmissao, double _salario) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento);
		this.setDataDeAdmissao(_dataDeAdmissao);
		this.setSalario(_salario);
	}

	public Funcionario(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
			int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento);
		this.setDataDeAdmissao(_diaAdmissao, _mesAdmissao, _anoAdmissao);
		this.setSalario(_salario);
	}

	public Funcionario(String _nome, String _identidade, String _dataDeNascimento, int _diaAdmissao, int _mesAdmissao,
			int _anoAdmissao, double _salario) throws Exception {
		super(_nome, _identidade, _dataDeNascimento);
		this.setDataDeAdmissao(_diaAdmissao, _mesAdmissao, _anoAdmissao);
		this.setSalario(_salario);
	}

	public Funcionario() throws Exception {
		this("", "", "1/1/1990", "1/1/1990", 0.0);
	}

	// métodos set sobrecarregados
	public void setDataDeAdmissao(int _diaAdmissao, int _mesAdmissao, int _anoAdmissao) throws Exception {
		this.dataDeAdmissao = new Data(_diaAdmissao, _mesAdmissao, _anoAdmissao);
	}

	public void setDataDeAdmissao(String _dataDeAdmissao) throws Exception {
		this.dataDeAdmissao = new Data(_dataDeAdmissao);
	}

	public void setSalario(double _salario) throws Exception {
		this.salario = _salario;
	}

	// métodos get
	public Data getDataDeAdmissao() {
		return this.dataDeAdmissao;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void reajustarSalario(double _taxa) {
		this.salario += _taxa;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nData de Admissão: ");
		dados.append(this.getDataDeAdmissao().getData());
		dados.append("\nSalário: ");
		dados.append(this.getSalario());
		return dados.toString();
	}
}
