package modelo;

import java.util.List;

public class Fornecedor {

		private int codigo;
		private String nome;
		private Endereco endereco;
		private String telefone;
		private String ramo;
		private String cnpj;
		private List<Produto> produto;
		private String nomeRepresentante;
		
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
		
		public String getRamo() {
			return ramo;
		}
		
		public void setRamo(String ramo) {
			this.ramo = ramo;
		}
		
		public String getCnpj() {
			return cnpj;
		}
		
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		
		public List<Produto> getProduto() {
			return produto;
		}
		
		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		
		public String getNomeRepresentante() {
			return nomeRepresentante;
		}
		
		public void setNomeRepresentante(String nomeRepresentante) {
			this.nomeRepresentante = nomeRepresentante;
		}
		
		
		
		
}
