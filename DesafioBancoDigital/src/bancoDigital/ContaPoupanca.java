package bancoDigital;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void exibirExtrato() {
		System.out.println("---Extrato da Poupança---");
		imprimirInfos();
		
	}

}
