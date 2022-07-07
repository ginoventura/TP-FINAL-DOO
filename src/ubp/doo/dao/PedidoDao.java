package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.PedidoDto;

public interface PedidoDao extends Dao {
    
    List<PedidoDto> listarPedidos ();
    
    boolean nuevoPedido(PedidoDto pedido);
    
    boolean cancelarPedido(int nroPedido);
}
