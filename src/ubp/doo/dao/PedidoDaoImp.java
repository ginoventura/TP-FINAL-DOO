package ubp.doo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.PedidoDto;

public class PedidoDaoImp implements PedidoDao {
    
    public PedidoDaoImp() {
        
    }

    @Override
    public List<PedidoDto> listarPedidos() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<PedidoDto> listaPedidos = new ArrayList<>();
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT idPedido, apellido, nombre, calle, barrio FROM pedidos JOIN clientes ON pedidos.idCliente = clientes.nroDocumento";
            sentencia = con.createStatement();
            
            rs = sentencia.executeQuery(sql);
            
            int idPedido;
            String apellido;
            String nombre;
            String calle;
            String barrio;
            PedidoDto pedido;        
            
            while (rs.next()) {
                idPedido = rs.getInt("idPedido");
                apellido = rs.getString("apellido");
                nombre = rs.getString("nombre");
                calle = rs.getString("calle");
                barrio = rs.getString("barrio");
                pedido = new PedidoDto(idPedido, apellido, nombre, calle, barrio);
                listaPedidos.add(pedido);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                rs.close();
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return listaPedidos;
    }

    @Override
    public boolean nuevoPedido(PedidoDto pedido) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO pedidos (idPedido, nroDocumento, apellido, "
                       + "nombre, calle, barrio,) "
                       + "VALUES(?,?,?,?,?,?)";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt   (1, pedido.getIdPedido());
            sentencia.setString(2, pedido.getNroDocumento());
            sentencia.setString(3, pedido.getApellido());
            sentencia.setString(4, pedido.getNombre());
            sentencia.setString(5, pedido.getDomicilio());
            sentencia.setString(6, pedido.getBarrio());

            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
            
            } catch (SQLException e) {
                System.err.println(e);
                return false;
            } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        }

    @Override
    public boolean cancelarPedido(int nroPedido) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM pedidos WHERE idPedido = ? ";
            sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, nroPedido);
            
            int resultado = sentencia.executeUpdate();

            return (resultado > 0);
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                sentencia.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }
}