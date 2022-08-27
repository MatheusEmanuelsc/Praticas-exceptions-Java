package entidade;

import exptions.Saldo_invalido_exptions;

public class Banco {
	private Integer numeroDaConta;
	private String nome;
	private Double saldo;
	private Double limiteDeSaque;

	public Banco(Integer numeroDaConta, String nome, Double saldo, Double limiteDeSaque) {

		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(Integer numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) throws Saldo_invalido_exptions {
		if (saldo > 0) {

			throw new Saldo_invalido_exptions("Digito invalido você nao pode depositar numero negativo.");

		}
		this.saldo += saldo;

	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void setLimiteDeSaque(Double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}

	public void saqueDaConta(Double saque) throws Saldo_invalido_exptions {
		if (getSaldo() < saque || getLimiteDeSaque() < saque) {
			throw new Saldo_invalido_exptions(
					"Digito invalido vocẽ não pode exceder o saque limite da conta ou seu saldo.");
		}

		this.saldo -= saque;

	}

	@Override
	public String toString() {
		return "Banco [numeroDaConta=" + numeroDaConta + ", nome=" + nome + ", saldo=" + saldo + ", limiteDeSaque="
				+ limiteDeSaque + "]";
	}

}
