
public class ContaBancaria {
	private String nome;
	private double saldo;
	static final public double DEFAULT_TAXA = 0;
	static private double taxaDeJuros = ContaBancaria.DEFAULT_TAXA;

	public ContaBancaria() throws Exception {
		this("", 0);
	}

	public ContaBancaria(String _nome, double _saldo) throws Exception {
		this.setNome(_nome);
		this.setSaldo(_saldo);
	}

	public void setNome(String _nome) {
		this.nome = _nome;
	}

	public void setTaxaDeJuros(double _taxa) {
		ContaBancaria.taxaDeJuros = _taxa;
	}

	public void setSaldo(double _saldo) throws Exception {
		if (_saldo >= 0)
			this.saldo = _saldo;
		else
			throw new Exception("Saldo negativo.");
	}

	public String getNome() {
		return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double getTaxaDeJuros() {
		return ContaBancaria.taxaDeJuros;
	}

	public boolean equals(ContaBancaria _conta) {
		if (this.nome.equals(_conta.nome) && this.saldo == _conta.saldo)
			return true;
		return false;
	}

	public void corrigirSaldo() throws Exception{
		this.setSaldo(this.saldo * (1 - ContaBancaria.taxaDeJuros));
	}

	public int compareTo(ContaBancaria _conta) {
		// this > _conta -1
		// this = _conta 0
		// this < _conta 1
		if (this.saldo > _conta.saldo)
			return -1;
		else if (this.saldo == _conta.saldo)
			return 0;
		else
			return 1;
	}

	public String toString() {
		StringBuilder dados = new StringBuilder();
		dados.append("Nome: ");
		dados.append(this.getNome());
		dados.append("Saldo: ");
		dados.append(this.getSaldo());
		return null;
	}
}
