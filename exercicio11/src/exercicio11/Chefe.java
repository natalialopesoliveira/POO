package exercicio11;

public class Chefe extends Funcionario {
	private String departamento;

	// construtores sobrecarregados
	public Chefe(String _nome, String _identidade, String _dataDeNascimento, String _dataDeAdmissao, double _salario,
			String _departamento) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario);
		this.setDepartamento(_departamento);
	}

	public Chefe(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
			String _dataDeAdmissao, double _salario, String _departamento) throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _dataDeAdmissao, _salario);
		this.setDepartamento(_departamento);
	}

	public Chefe(String _nome, String _identidade, String _dataDeNascimento, int _diaAdmissao, int _mesAdmissao,
			int _anoAdmissao, double _salario, String _departamento) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario);
		this.setDepartamento(_departamento);
	}

	public Chefe(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
			int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _departamento)
			throws Exception {
		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao,
				_anoAdmissao, _salario);
		this.setDepartamento(_departamento);
	}

	public Chefe() throws Exception {
		this("", "", "1/1/1990", "1/1/1990", 0.0, "");
	}

	// métodos set sobrecarregados
	public void setDepartamento(String _departamento) throws Exception {
		this.departamento = _departamento;
	}

	// métodos get sem throws Exception
	public String getDepartamento() {
		return this.departamento;
	}

	// método toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nDepartamento: ");
		dados.append(this.getDepartamento());
		return dados.toString();
	}
}
