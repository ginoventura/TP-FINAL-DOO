
package ubp.doo.controlador;

import ubp.doo.modelo.Modelo;
import ubp.doo.modelo.Pedido;
import ubp.doo.vista.InterfazVistaEdit;
import ubp.doo.vista.InterfazVistaTable;

public class PedidoControlador extends Controlador {
    
    int nroPedido;
    
    public PedidoControlador(InterfazVistaTable vista, Modelo modelo) {
        VISTA = vista;
        MODELO = modelo;
    }
    
    
    public PedidoControlador(InterfazVistaEdit vista, Modelo modelo, int nroPedido) {
        VISTA = vista;
        MODELO = modelo;
        this.nroPedido = nroPedido;    
    } 
}
