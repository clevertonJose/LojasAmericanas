package modelo;

public class Produto {
	private int codigo;
	private String nome;
	private String tipo;
	private Fornecedor fornecedor;
	private int quantidade;
	private String especificacoesTecnicas;
	private double preco;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String getEspecificacoesTecnicas() {
		return especificacoesTecnicas;
	}
	
	public void setEspecificacoesTecnicas(String especificacoesTecnicas) {
		this.especificacoesTecnicas = especificacoesTecnicas;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
			
}
