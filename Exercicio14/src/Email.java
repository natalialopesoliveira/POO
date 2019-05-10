
public class Email {
	private String email;

	public Email() throws Exception {
		this("example@email.com");
	}

	public Email(String _email) throws Exception {
		this.setEmail(_email);
	}

	public void setEmail(String _email) throws Exception {
		if (_email.contains("@"))
			this.email = _email;
		else
			throw new Exception("Email errado!");
	}

	public String getEmail() {
		return this.email;
	}

	public boolean equals(Email _email1) {
		if (this.equals(_email1))
			return true;
		return false;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Email: ");
		dados.append(this.getEmail());

		return dados.toString();
	}
}
