package ubp.doo.dto;

public class PedidoDto {
    
    private int nroPedido;
    private String nroDocumento; 
    private String producto; 
    private int cantidad; 
    private double precio;
    private String medioPago;
    private String fechaEntrega;
    private String horaEntrega;
    private String apellido;
    private String nombre;
    private String calle;
    private String barrio;
    private int montoTotal;
    
    public PedidoDto() {
    
    }
    
    public PedidoDto(int nroPedido, String nroDocumento, String producto, int cantidad, double precio, String medioPago, String fechaEntrega, String horaEntrega) {
        this.nroPedido = nroPedido;
        this.nroDocumento = nroDocumento;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.medioPago = medioPago;
        this.fechaEntrega = fechaEntrega;
        this.horaEntrega = horaEntrega;
    }

    public PedidoDto(int nroPedido, String apellido, String nombre, String calle, String barrio) {
        this.nroPedido = nroPedido;
        this.apellido = apellido;
        this.nombre = nombre;
        this.calle = calle;
        this.barrio = barrio;
    }
      
    public int getIdPedido() {
        return nroPedido;
    }

    public void setIdPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }
    
     public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return calle;
    }

    public void setDomicilio(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    @Override
    public String toString() {
        return  "[" + nroPedido + ", " + nroDocumento.toUpperCase() + ", " + 
                producto.toUpperCase() + ", " + cantidad + ", " +
                precio + ", " + medioPago.toUpperCase() + ", " +
                fechaEntrega.toUpperCase() + ", " + horaEntrega.toUpperCase() + "]";
    }
}
