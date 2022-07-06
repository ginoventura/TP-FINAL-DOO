package ubp.doo.dao;

import java.util.List;
import ubp.doo.dto.ClienteDto;

public interface ClienteDao extends Dao {
        
     ClienteDto buscarCliente(ClienteDto cliente);
     
     ClienteDto buscarCliente(String nroDocumento);
     
     List<ClienteDto> listarClientes();
     
     boolean insertarCliente(ClienteDto cliente);
     
     boolean modificarCliente(ClienteDto cliente);
     
     boolean borrarCliente(String nroDocumento);
     
}
