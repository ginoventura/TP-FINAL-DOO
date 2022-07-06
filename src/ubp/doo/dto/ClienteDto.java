package ubp.doo.dto;

public class ClienteDto {

    private String razonSocial;
    private String tipoDocumento;
    private String nroDocumento;
    private String apellido;
    private String nombre;
    private long telefono;
    private String zona;
    private String barrio;
    private String calle;
    private String depto;
    private int piso; 
    
    public ClienteDto() {
    
    }
    
    public ClienteDto(String razonSocial, String tipoDocumento, String nroDocumento, String apellido, String nombre, long telefono, String barrio, String calle, String depto, int piso) {
        this.razonSocial = razonSocial;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.barrio = barrio;
        this.calle = calle;
        this.depto = depto;
        this.piso = piso;
    }

    public ClienteDto(String razonSocial, String nroDocumento, String tipoDocumento, String apellido, String nombre, long telefono, String barrio) {
        this.razonSocial = razonSocial;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.barrio = barrio;
    }

    public ClienteDto(String razonSocial, String tipoDocumento, String nroDocumento, String apellido, String nombre, long telefono, String zona, String barrio, String calle, String depto, int piso) {
        this.razonSocial = razonSocial;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
        this.zona = zona;
        this.barrio = barrio;
        this.calle = calle;
        this.depto = depto;
        this.piso = piso;
    }
    
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
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
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
        
    public long getTelefono() {
        return telefono;
    }

    public long setTelefono(long telefono) {
        this.telefono = telefono;
        return 0;
    }
    
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    
    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    
    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
    
    public int getPiso() {
        return piso;
    }

    public void setNombre(int piso) {
        this.piso = piso;
    }
    
    @Override
    public String toString() {
        return  "[" + razonSocial.toUpperCase() + ", " + tipoDocumento.toUpperCase() + ", " + 
                nroDocumento.toUpperCase() + ", " + apellido.toUpperCase() + ", " +
                nombre.toUpperCase() + ", " + telefono + ", " + barrio.toUpperCase() + ", " +
                calle.toUpperCase() + ", " + depto.toUpperCase() + ", " + piso + "]";
    }
}
