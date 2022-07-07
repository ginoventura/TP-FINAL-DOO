package ubp.doo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ubp.doo.dto.ClienteDto;

public class ClienteDaoImp implements ClienteDao {

    public ClienteDaoImp() {
    }

    @Override
    public ClienteDto buscarCliente(ClienteDto cliente) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        ClienteDto clienteResult = null;

        try {                        
            String sql = "SELECT razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso FROM clientes WHERE nombre = ? or apellido = ?";
            sentencia = con.prepareStatement(sql); 
            sentencia.setString(1, cliente.getNombre());
            sentencia.setString(2, cliente.getApellido());

            rs = sentencia.executeQuery();

            String razonSocial;
            String tipoDocumento;
            String nroDocumento;
            String apellido;
            String nombre;
            long telefono;
            String barrio;
            String zona;
            String calle;
            String depto;
            int piso; 

            while (rs.next()) {
                razonSocial = rs.getString("razonSocial");
                tipoDocumento = rs.getString("tipoDocumento");
                nroDocumento = rs.getString("nroDocumento");
                apellido = rs.getString("apellido");
                nombre = rs.getString("nombre");
                telefono = rs.getLong("telefono");
                barrio = rs.getString("barrio");
                zona = rs.getString("zona");
                calle = rs.getString("calle");
                depto = rs.getString("depto");
                piso = rs.getInt("piso");

                cliente = new ClienteDto(razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso);
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
        return cliente;
    }

    @Override
    public List<ClienteDto> listarClientes() {
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
        List<ClienteDto> listaClientes = new ArrayList<>();

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, calle FROM clientes ORDER BY apellido";
            sentencia = con.createStatement();

            rs = sentencia.executeQuery(sql);

            String razonSocial;
            String tipoDocumento;
            String nroDocumento;
            String apellido;
            String nombre;
            long telefono;
            String barrio;
            String calle;
            ClienteDto cliente;

            while (rs.next()) {
                razonSocial     = rs.getString("razonSocial");
                tipoDocumento   = rs.getString("tipoDocumento");
                nroDocumento    = rs.getString("nroDocumento");
                apellido        = rs.getString("apellido");
                nombre          = rs.getString("nombre");
                telefono        = rs.getLong("telefono");
                barrio          = rs.getString("barrio");
                calle           = rs.getString("calle");
                cliente         = new ClienteDto(razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, calle);
                listaClientes.add(cliente);
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
        return listaClientes;
    }

    @Override
    public boolean insertarCliente(ClienteDto cliente) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "INSERT INTO clientes (razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, zona, calle, depto, piso) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, cliente.getRazonSocial());
            sentencia.setString(2, cliente.getTipoDocumento());
            sentencia.setString(3, cliente.getNroDocumento());
            sentencia.setString(4, cliente.getApellido());
            sentencia.setString(5, cliente.getNombre());
            sentencia.setLong  (6, cliente.getTelefono());
            sentencia.setString(7, cliente.getBarrio());
            sentencia.setString(8, cliente.getZona());
            sentencia.setString(9, cliente.getCalle());
            sentencia.setString(10, cliente.getDepto());
            sentencia.setInt   (11, cliente.getPiso());

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
    public boolean modificarCliente(ClienteDto cliente) {
        Connection con = null;
        PreparedStatement sentencia = null;
        
        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "UPDATE clientes SET razonSocial=?, tipoDocumento=?, apellido=?, nombre=?, telefono=?, barrio=?, zona=?, calle=?, depto=?, piso=? WHERE nroDocumento=?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, cliente.getRazonSocial());
            sentencia.setString(2, cliente.getTipoDocumento());
            sentencia.setString(3, cliente.getNroDocumento());
            sentencia.setString(4, cliente.getApellido());
            sentencia.setString(5, cliente.getNombre());
            sentencia.setLong  (6, cliente.getTelefono());
            sentencia.setString(7, cliente.getBarrio());
            sentencia.setString(8,cliente.getZona());
            sentencia.setString(9, cliente.getCalle());
            sentencia.setString(10, cliente.getDepto());
            sentencia.setInt   (11, cliente.getPiso());


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
    public boolean borrarCliente(String nroDocumento) {
        Connection con = null;
        PreparedStatement sentencia = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "DELETE FROM clientes WHERE nroDocumento = ? ";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, nroDocumento);
            
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
    public ClienteDto buscarCliente(String nroDocumento) {
        Connection con = null;
        PreparedStatement sentencia = null;
        ResultSet rs = null;
        ClienteDto cliente = null;

        try {
            con = ConexionSql.getInstancia().getConnection();
            String sql = "SELECT razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, calle, depto, piso FROM clientes WHERE nroDocumento = ?";
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, nroDocumento);

            rs = sentencia.executeQuery();

            String razonSocial;
            String tipoDocumento;
            String apellido;
            String nombre;
            long telefono;
            String barrio;
            String zona;
            String calle;
            String depto;
            int piso;

            while (rs.next()) {
                razonSocial = rs.getString("razonSocial");
                tipoDocumento = rs.getString("tipoDocumento");
                nroDocumento = rs.getString("nroDocumento");
                apellido = rs.getString("apellido");
                nombre = rs.getString("nombre");
                telefono = rs.getLong("telefono");
                barrio = rs.getString("barrio");
                calle = rs.getString("calle");
                depto = rs.getString("depto");
                piso = rs.getInt("piso");
                cliente = new ClienteDto(razonSocial, tipoDocumento, nroDocumento, apellido, nombre, telefono, barrio, calle, depto, piso);
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
        return cliente;
    }
}