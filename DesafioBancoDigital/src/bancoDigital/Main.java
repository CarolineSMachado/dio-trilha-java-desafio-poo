package bancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Caroline", "Machado", 40028922, 24);
		
		System.out.println(cliente1.toString());
		
		Conta contaPoupanca = new ContaPoupanca(cliente1);
		Conta contaCorrente = new ContaCorrente(cliente1);
		
		contaPoupanca.depositar(1000);
		contaPoupanca.sacar(5);
		contaPoupanca.transferir(5, contaCorrente);
		contaPoupanca.exibirExtrato();
		contaCorrente.exibirExtrato();
	}

}
