

package entidades.clases;

import java.util.Objects;
import java.util.TreeSet;


public class EntidadesTelefono {

    TreeSet<Long> telefonos;

    public EntidadesTelefono(TreeSet<Long> telefonos) {
        this.telefonos = telefonos;
    }
    
    public EntidadesTelefono() {
        this.telefonos = new TreeSet();
    }

    public TreeSet<Long> getTelefono() {
        return telefonos;
    }

    public void setTelefono(TreeSet<Long> telefono) {
        this.telefonos = telefono;
    }
    
    
    public void agregarTelefono(Long telefono) {
        telefonos.add(telefono);
    }
    
    public void borrarTelefono(Long telefono) {
        telefonos.remove(telefono);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.telefonos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntidadesTelefono other = (EntidadesTelefono) obj;
        return Objects.equals(this.telefonos, other.telefonos);
    }

    @Override
    public String toString() {
        return telefonos.toString();
    }
    
    
}
