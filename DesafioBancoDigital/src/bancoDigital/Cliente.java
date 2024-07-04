package bancoDigital;

import java.util.List;

public class Cliente {
	private String nome;
	private String sobrenome;
	private int telefone;
	private int idade;
	private List<Cliente> clienteList;

	public Cliente(String nome, String sobrenome, int telefone, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibirDadosCliente() {
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade
				+ "]";
	}
	
}
