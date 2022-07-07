package ubp.doo.controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import ubp.doo.dto.PedidoDto;
import ubp.doo.modelo.Modelo;
import ubp.doo.modelo.Pedido;
import ubp.doo.vista.InterfazVista;

public class PedidoControlador extends Controlador {
    
    public PedidoControlador(InterfazVista vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void cargarTodos(DefaultTableModel modeloTabla) {
        modeloTabla.setRowCount(0);
        modeloTabla.fireTableDataChanged();
        List<PedidoDto> listadoPedidos = ((Pedido) this.MODELO).listar();
        for (PedidoDto ped : listadoPedidos) {
            modeloTabla.addRow(new Object[]{ped.getIdPedido(), ped.getApellido(), ped.getNombre(), ped.getDomicilio(), ped.getBarrio()});
        }
    }
    
    public boolean guardar(int nroPedido, String nroDocumento, String producto, int cantidad, double precio, String medioPago, String fechaEntrega, String horaEntrega) {
        return ((Pedido) this.MODELO).guardar(nroPedido, nroDocumento.toUpperCase(), producto.toUpperCase(), cantidad, precio, medioPago.toUpperCase(), fechaEntrega.toUpperCase(), horaEntrega.toUpperCase());
    }
    
    public boolean borrar(int nroPedido) {
        return ((Pedido) this.MODELO).borrar(nroPedido);
    }
}
