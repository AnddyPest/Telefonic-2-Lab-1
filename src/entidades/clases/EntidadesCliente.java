package entidades.clases;

import clases.principal.Cliente;
import java.util.TreeSet;

public class EntidadesCliente {

    TreeSet<Cliente> listaClientes;
    
    public EntidadesCliente() {
        this.listaClientes = new TreeSet();
    }

    public TreeSet<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(TreeSet<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void borrarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

   
}


