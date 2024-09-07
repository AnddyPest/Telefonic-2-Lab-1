package entidades.clases;

import clases.principal.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EntidadesMapa {

    public TreeMap<Long, Cliente> clientTel;

    public EntidadesMapa(TreeMap<Long, Cliente> clientTel) {
        this.clientTel = clientTel;
    }

    public EntidadesMapa() {
        this.clientTel = new TreeMap();
    }

    public TreeMap<Long, Cliente> getClientTel() {
        return clientTel;
    }

    public void setClientTel(TreeMap<Long, Cliente> clientTel) {
        this.clientTel = clientTel;
    }

    public void relacionarClienteTelefono(Long telefono, Cliente cliente) {
        if (!clientTel.containsKey(telefono)) {
            clientTel.put(telefono, cliente);
        }
    }

    public Cliente buscarClientePorTelefono(Long telefono) {
        return clientTel.get(telefono);
    }

    public void eliminarRelacion(Long telefono) {
        clientTel.remove(telefono);
    }
    
    public List<Long> flitroTelefonos(Cliente cliente) {
        List<Long> telefonosDeCliente = new ArrayList<>();
        for (Map.Entry<Long, Cliente> entry : clientTel.entrySet()) {
            if (entry.getValue().equals(cliente)) {
                telefonosDeCliente.add(entry.getKey());
        }
        }
        return telefonosDeCliente;
    }
}
    


