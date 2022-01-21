package desafio.banco.conta;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class ContaImpl implements Conta {
	private int agencia;
	private int numero;
	private double saldo;

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

}