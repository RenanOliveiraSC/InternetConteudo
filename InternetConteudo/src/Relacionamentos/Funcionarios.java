package Relacionamentos;

public class Funcionarios {

	private String nome;
	private int idade;

	public Funcionarios() {

	}

	public Funcionarios(String pNome, int pIdade) {
		this.nome = pNome;
		this.idade = pIdade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " - " + this.idade;
	}

}
