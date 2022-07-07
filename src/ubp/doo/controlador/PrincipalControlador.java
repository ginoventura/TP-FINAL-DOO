package ubp.doo.controlador;

import java.awt.event.ActionEvent;
import ubp.doo.modelo.Cliente;
import ubp.doo.modelo.Modelo;
import ubp.doo.modelo.Pedido;
import ubp.doo.vista.EditarCliente;
import ubp.doo.vista.ConsultarCliente;
import ubp.doo.vista.GestionarPedidos;
import ubp.doo.vista.InterfazVista;
import ubp.doo.vista.InterfazVistaEdit;
import ubp.doo.vista.InterfazVistaTable;
import ubp.doo.vista.NuevoPedido;

public class PrincipalControlador extends Controlador {
        
    public PrincipalControlador(InterfazVista vista, Modelo modelo){
        VISTA = vista;
        MODELO = modelo;
    }
    
    public void consultarCliente(Controlador segundoControlador) {
        InterfazVistaTable vista;
        Controlador control = null; 
        this.MODELO = new Cliente();
        vista = new ConsultarCliente(null, true);
        control = new ClienteControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void editarCliente(Controlador segundoControlador, String nroDocumento) {
        InterfazVistaEdit vista;
        Controlador control = null; 
        this.MODELO = new Cliente();
        vista = new EditarCliente(true);
        control = new ClienteControlador(vista, this.MODELO, nroDocumento);
        vista.setControlador(control);
        vista.iniciaVista();
    }
 
    public void nuevoCliente(Controlador segundoControlador) {
        InterfazVistaEdit vista;
        Controlador control = null; 
        this.MODELO = new Cliente();
        vista = new EditarCliente(false);
        control = new ClienteControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void borrarCliente(Controlador segundoControlador) {
        InterfazVistaEdit vista;
        Controlador control = null; 
        this.MODELO = new Cliente();
        vista = new EditarCliente(false);
        control = new ClienteControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void gestionarPedidos(Controlador segundoControlador) {
        InterfazVistaTable vista;
        Controlador control = null; 
        this.MODELO = new Pedido();
        vista = new GestionarPedidos(null, true);
        control = new PedidoControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
    public void nuevoPedido(Controlador segundoControlador) {
        InterfazVistaEdit vista;
        Controlador control = null; 
        this.MODELO = new Pedido();
        vista = new NuevoPedido(false);
        control = new PedidoControlador(vista, this.MODELO);
        vista.setControlador(control);
        vista.iniciaVista();
    }
    
//  public void cancelarPedido(Controlador segundoControlador) {
//       
//  }
      
    public void salir(ActionEvent e) {
        System.exit(0);
    }
    
    
}
