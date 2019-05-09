
public class Diretor extends Chefe {
	private Data dataDePromocao;

	// construtores sobrecarregados
	public Diretor(String _nome, String _identidade, String _dataDeNascimento, String _dataDeAdmissao, double _salario,
			String _departamento, String _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, Data _dataDeNascimento, String _dataDeAdmissao, double _salario,
			String _departamento, String _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, String _dataDeNascimento, Data _dataDeAdmissao, double _salario,
			String _departamento, String _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, String _dataDeNascimento, String _dataDeAdmissao, double _salario,
			String _departamento, Data _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, Data _dataDeNascimento, Data _dataDeAdmissao, double _salario,
			String _departamento, String _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, Data _dataDeNascimento, String _dataDeAdmissao, double _salario,
			String _departamento, Data _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, String _dataDeNascimento, Data _dataDeAdmissao, double _salario,
			String _departamento, Data _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}
	
	public Diretor(String _nome, String _identidade, Data _dataDeNascimento, Data _dataDeAdmissao, double _salario,
			String _departamento, Data _dataDePromocao) throws Exception {
		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
		this.setDataDePromocao(_dataDePromocao);
	}

//	public Diretor(String _nome, String _identidade, String _dataDeNascimento, String _dataDeAdmissao, double _salario,
//			String _departamento, int _diaPromocao, int _mesPromocao, int _anoPromocao) throws Exception {
//		super(_nome, _identidade, _dataDeNascimento, _dataDeAdmissao, _salario, _departamento);
//		this.setDataDePromocao(_diaPromocao, _mesPromocao, _anoPromocao);
//	}

//	public Diretor(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
//			String _dataDeAdmissao, double _salario, String _departamento, String _dataDePromocao) throws Exception {
//		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _dataDeAdmissao, _salario,
//				_departamento);
//		this.setDataDePromocao(_dataDePromocao);
//	}

//	public Diretor(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
//			String _dataDeAdmissao, double _salario, String _departamento, int _diaPromocao, int _mesPromocao,
//			int _anoPromocao) throws Exception {
//		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _dataDeAdmissao, _salario,
//				_departamento);
//		this.setDataDePromocao(_diaPromocao, _mesPromocao, _anoPromocao);
//	}

//	public Diretor(String _nome, String _identidade, String _dataDeNascimento, int _diaAdmissao, int _mesAdmissao,
//			int _anoAdmissao, double _salario, String _departamento, String _dataDePromocao) throws Exception {
//		super(_nome, _identidade, _dataDeNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario, _departamento);
//		this.setDataDePromocao(_dataDePromocao);
//	}

//	public Diretor(String _nome, String _identidade, String _dataDeNascimento, int _diaAdmissao, int _mesAdmissao,
//			int _anoAdmissao, double _salario, String _departamento, int _diaPromocao, int _mesPromocao,
//			int _anoPromocao) throws Exception {
//		super(_nome, _identidade, _dataDeNascimento, _diaAdmissao, _mesAdmissao, _anoAdmissao, _salario, _departamento);
//		this.setDataDePromocao(_diaPromocao, _mesPromocao, _anoPromocao);
//	}

//	public Diretor(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
//			int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _departamento,
//			String _dataDePromocao) throws Exception {
//		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao,
//				_anoAdmissao, _salario, _departamento);
//		this.setDataDePromocao(_dataDePromocao);
//	}

//	public Diretor(String _nome, String _identidade, int _diaNascimento, int _mesNascimento, int _anoNascimento,
//			int _diaAdmissao, int _mesAdmissao, int _anoAdmissao, double _salario, String _departamento,
//			int _diaPromocao, int _mesPromocao, int _anoPromocao) throws Exception {
//		super(_nome, _identidade, _diaNascimento, _mesNascimento, _anoNascimento, _diaAdmissao, _mesAdmissao,
//				_anoAdmissao, _salario, _departamento);
//		this.setDataDePromocao(_diaPromocao, _mesPromocao, _anoPromocao);
//	}
	
	public Diretor() throws Exception {
		this("", "", "1/1/1990", "1/1/1990", 0.0, "","1/1/1990");
	}

	// método set
	public void setDataDePromocao(int _diaPromocao, int _mesPromocao, int _anoPromocao) throws Exception{
		this.dataDePromocao = new Data(_diaPromocao, _mesPromocao, _anoPromocao);
	}
	
	public void setDataDePromocao(String _dataDePromocao) throws Exception{
		this.dataDePromocao = new Data(_dataDePromocao);
	}
	
	public void setDataDePromocao(Data _dataDePromocao) throws Exception{
		this.dataDePromocao = _dataDePromocao;
	}
	
	// método get
	public String getDataDePromocao() {
		return this.dataDePromocao.toString();
	}
	
	public double valorMaximoEmprestimo() {
		return (1.5*super.valorMaximoEmprestimo());
	}
	
	// método toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nData de Promoção: ");
		dados.append(this.getDataDePromocao());
		return dados.toString();
	}
}
