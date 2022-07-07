package ubp.doo.modelo;

import java.util.List;
import ubp.doo.dao.ClienteDao;
import ubp.doo.dao.FabricaDao;
import ubp.doo.dto.ClienteDto;

public class Cliente extends Modelo {
    
    private final ClienteDao clienteDao;
    
    public Cliente() {
        clienteDao = (ClienteDao) FabricaDao.getDao("ClienteDaoImp");
    }
    
    public ClienteDto buscar(String nroDocumento) {
        ClienteDto cliente = (ClienteDto) clienteDao.buscarCliente(nroDocumento);
        return cliente;
    }
    
    public List<ClienteDto> listar() {
        List<ClienteDto> listadoClientes = (List<ClienteDto>) clienteDao.listarClientes();
        return listadoClientes;
    }
    
    public boolean guardar(String razonSocial, String tipoDocumento, String nroDocumento, String apellido, String nombre, long telefono, String barrio, String zona, String calle, String depto, int piso) {
        return clienteDao.insertarCliente (new ClienteDto(razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso));
    }

    public boolean modificar(String razonSocial, String tipoDocumento, String nroDocumento, String apellido, String nombre, long telefono, String barrio, String zona, String calle, String depto, int piso) {
        return clienteDao.modificarCliente(new ClienteDto(razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso));
    }

    public boolean borrar(String nroDocumento) {
        return clienteDao.borrarCliente(nroDocumento);
    }

    @Override
    protected void finalize() throws Throwable {
        clienteDao.cerrarConexion();
    }
}
