package classes;

/**
 * Enumera��o utilizada para o mapeamento dos tipos de conta de acordo com a
 * senten�a (string) informada.
 */
public enum TipoConta {

	CONTA_CORRENTE("Conta Corrente"), CONTA_POUPANCA("Conta Poupan�a"), CONTA_SALARIO("Conta Sal�rio");

	private String descricao;

	TipoConta(String nome) {
		this.descricao = nome;
	}

	@Override
	public String toString() {
		return "TipoConta [ descricao = " + this.descricao + " ]";
	}

}
