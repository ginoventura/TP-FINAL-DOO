package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dao.PedidoDao;
import ubp.doo.dto.PedidoDto;

public class Pedido extends Modelo {
    
    private final PedidoDao pedidoDao;
    
    public Pedido() {
        pedidoDao = (PedidoDao) FabricaDao.getDao("PedidoDaoImp");
    }
    
    public List<PedidoDto> listar() {
        List<PedidoDto> listadoPedidos = (List<PedidoDto>) pedidoDao.listarPedidos();
        return listadoPedidos;
    }
    
    public boolean guardar(int nroPedido, String nroDocumento, String producto, int cantidad, double precio, String medioPago, String fechaEntrega, String horaEntrega) {
        return pedidoDao.nuevoPedido(new PedidoDto(nroPedido, nroDocumento, producto, cantidad, precio, medioPago, fechaEntrega, horaEntrega));
    }
    
    public boolean borrar(int nroPedido) {
        return pedidoDao.cancelarPedido(nroPedido);
    }
    
    @Override
    protected void finalize() throws Throwable {
        pedidoDao.cerrarConexion();
    }
}
