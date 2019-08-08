package controle;

import java.util.List;

import modelo.Cliente;

public class ControleCliente {

	private List<Cliente> clientes;
	
	public void verificar(Cliente cliente) {
		if(cliente.isJaComprou()) {
			clientes.add(cliente);
		}
	}


	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
