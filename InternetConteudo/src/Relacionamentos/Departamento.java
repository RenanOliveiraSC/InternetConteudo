package Relacionamentos;

public class Departamento {

	private String descricao;

	public Departamento(String pDescricao) {
		this.descricao = pDescricao;
	}

	public Departamento() {

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Descrição do Departamento: " + this.descricao;
	}
}