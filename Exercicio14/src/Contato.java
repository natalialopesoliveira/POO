
public class Contato {
	private String nome;
	private Email email;

	public Contato() throws Exception {
		this("Sem nome", "exemplo@email.com");
	}

	public Contato(String _nome, String _email) throws Exception {
		this.setNome(_nome);
		this.setEmail(_email);
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public void setEmail(String _email) throws Exception {
		if(_email.contains("@"))
			this.email = new Email(_email);
		else throw new Exception("Email incorreto.");
	}

	public String getNome() {
		return this.nome;
	}

	public Email getEmail() {
		return this.email;
	}

	public boolean equals(Contato _contato) {
		if (this.equals(_contato))
			return true;
		return false;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(this.getNome());
		dados.append("\n");
		dados.append(this.email.toString());
		return dados.toString();
	}
}
