package ubp.doo.controlador;

import ubp.doo.vista.InterfazVistaEdit;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.ClienteDto;
import ubp.doo.modelo.Cliente;
import ubp.doo.modelo.Modelo;
import ubp.doo.vista.InterfazVistaTable;

public class ClienteControlador extends Controlador {
    
    String nroDocumento;
    
    public ClienteControlador(InterfazVistaTable vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public ClienteControlador(InterfazVistaEdit vista, Modelo modelo, String nroDocumento) {
        VISTA = vista;
        MODELO = modelo;
        this.nroDocumento = nroDocumento;
    }
    
    public ClienteControlador(InterfazVistaEdit vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public ClienteDto getCliente() {
        return new Cliente().buscar(nroDocumento);
    }

    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<ClienteDto> listadoClientes = ((Cliente) this.MODELO).listar();
        for (ClienteDto cli : listadoClientes) {
            modeloTabla.addRow(new Object[]{cli.getRazonSocial(), cli.getTipoDocumento(), cli.getNroDocumento(), cli.getApellido(), cli.getNombre(), cli.getTelefono(), cli.getBarrio(), cli.getCalle(), cli.getDepto(), cli.getPiso()});
        }
    }
    
    public boolean guardar(String razonSocial, String tipoDocumento, String nroDocumento, String apellido, String nombre, long telefono, String zona, String barrio, String calle, String depto, int piso) {
        return ((Cliente) this.MODELO).guardar(razonSocial.toUpperCase(), tipoDocumento.toUpperCase(), nroDocumento.toUpperCase(), apellido.toUpperCase(), nombre.toUpperCase(), telefono, zona.toUpperCase(), barrio.toUpperCase(), calle.toUpperCase(), depto.toUpperCase(), piso);
    }

    public boolean modificar(String razonSocial, String tipoDocumento, String nroDocumento, String apellido, String nombre, long telefono, String zona, String barrio, String calle, String depto, int piso) {
        return ((Cliente) this.MODELO).modificar(razonSocial.toUpperCase(), tipoDocumento.toUpperCase(), nroDocumento.toUpperCase(), apellido.toUpperCase(), nombre.toUpperCase(), telefono, zona.toUpperCase(), barrio.toUpperCase(), calle.toUpperCase(), depto.toUpperCase(), piso);
    }

    public boolean borrar(String nroDocumento) {
        return ((Cliente) this.MODELO).borrar(nroDocumento);
    }


}



