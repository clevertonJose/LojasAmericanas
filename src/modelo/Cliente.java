package modelo;

public class Cliente {
	private String nome;
	private Endereco endereco;
	private String telefone;
	private boolean jaComprou;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isJaComprou() {
		return jaComprou;
	}

	public void setJaComprou(boolean jaComprou) {
		this.jaComprou = jaComprou;
	}
	
	
	
}
