package entities;

public class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;

	public Pessoa() {

	}

	public Pessoa(String nome, String endereco, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Endereco: " + endereco + ", cpf: " + cpf;
	}

}
