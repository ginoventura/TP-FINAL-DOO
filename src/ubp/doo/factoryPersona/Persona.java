package ubp.doo.factoryPersona;

public abstract class Persona {
    protected String tipoDocumento;
    protected String nroDocumento;
    protected String apellido;
    protected String nombre;

    public Persona(String tipoDocumento, String nroDocumento, String apellido, String nombre) {
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNombreCompleto() {
        return this.nombre + " " + this.apellido;
    }
    
    public String getNumeroDocumento() {
        return nroDocumento;
    }

    public void setNumeroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }
    
    public String getTipoDocumento () {
        return tipoDocumento;
    }
    
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    public abstract String getTipo();

}
