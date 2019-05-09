
public class PacienteDeClinica extends Pessoa {
	private String planoDeSaude;

	// construtores sobrecarregados
//	public PacienteDeClinica(String _nome, String _identidade, int _diaNascimento, int _mesNascimento,
//			int _anoNascimento, String _planoDeSaude) throws Exception {
//		this.setNome(_nome);
//		this.setIdentidade(_identidade);
//		this.setDataDeNascimento(_diaNascimento, _mesNascimento, _anoNascimento);
//		this.setPlanoDeSaude(_planoDeSaude);
//	}

	public PacienteDeClinica(String _nome, String _identidade, String _data, String _planoDeSaude) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataDeNascimento(_data);
		this.setPlanoDeSaude(_planoDeSaude);
	}
	
	public PacienteDeClinica(String _nome, String _identidade, Data _data, String _planoDeSaude) throws Exception {
		this.setNome(_nome);
		this.setIdentidade(_identidade);
		this.setDataDeNascimento(_data);
		this.setPlanoDeSaude(_planoDeSaude);
	}

	public PacienteDeClinica() throws Exception {
		this("", "", "1/1/1990", "");
	}

	// métodos set sobrecarregados
	public void setPlanoDeSaude(String _planoDeSaude) throws Exception {
		this.planoDeSaude = _planoDeSaude;
	}

	// métodos get
	public String getPlanoDeSaude() {
		return this.planoDeSaude;
	}

	// método toString
	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(super.toString());
		dados.append("\nPlano de Saúde: ");
		dados.append(this.getPlanoDeSaude());
		return dados.toString();
	}
}
