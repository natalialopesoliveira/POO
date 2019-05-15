
public class Cliente {
	private Contato contato;
	private String celular;
	private String endereco;
	private double rendaFamiliar;
	static final public double DEFAULT_RENDA_FAMILIAR = 2000;
	static private double renda = Cliente.DEFAULT_RENDA_FAMILIAR;

	public Cliente() throws Exception {
		this("Sem nome", "exemplo@email.com", "", "", 0);
	}

	public Cliente(String _nome, String _email, String _celular, String _endereco, double _rendaFamiliar)
			throws Exception {
		this(new Contato(_nome, _email), _celular, _endereco, _rendaFamiliar);
	}

	public Cliente(Contato _contato, String _celular, String _endereco, double _rendaFamiliar) throws Exception {
		this.setContato(_contato);
		this.setCelular(_celular);
		this.setEndereco(_endereco);
		this.setRendaFamiliar(_rendaFamiliar);
	}

	public void setContato(Contato _contato) {
		this.contato = _contato;
	}

	public void setCelular(String _celular) {
		this.celular = _celular;
	}

	public void setEndereco(String _endereco) {
		this.endereco = _endereco;
	}

	public void setRendaFamiliar(double _rendaFamiliar) {
		this.rendaFamiliar = _rendaFamiliar;
	}
	
	public static void setRenda(double _renda) {
		Cliente.renda = _renda;
	}

	public String getNome() {
		return this.contato.getNome();
	}

	public Email getEmail() {
		return this.contato.getEmail();
	}

	public String getCelular() {
		return this.celular;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public double getRendaFamiliar() {
		return this.rendaFamiliar;
	}
	
	public double getRenda() {
		return Cliente.renda;
	}

	public boolean equals(Cliente _cliente) {
		if (this.contato.equals(_cliente.contato) && this.getCelular().equals(_cliente.getCelular())
				&& this.getEndereco().equals(_cliente.getEndereco())
				&& this.getRendaFamiliar() == _cliente.getRendaFamiliar())
			return true;
		return false;
	}
	
	public String categoria() {
		if(this.getRendaFamiliar() > 2000.00)
			return "Top";
		else
			return "Usual";
	}
	
	public static String categoria(double _rendaFamiliar) {
		if(_rendaFamiliar > 2000.00)
			return "Top";
		else
			return "Usual";
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append(this.contato.toString());
		dados.append("\nCelular: ");
		dados.append(this.getCelular());
		dados.append("\nEndereço: ");
		dados.append(this.getEndereco());
		dados.append("\nRenda Familiar:");
		dados.append(this.getRendaFamiliar());

		return dados.toString();
	}

}
