package ubp.doo.factoryPersona;

public class Distribuidor extends Persona {

    public Distribuidor(String tipoDocumento, String nroDocumento, String apellido, String nombre) {
        super(tipoDocumento, nroDocumento, apellido, nombre);
    }

    @Override
    public String getTipo() {
        return "Soy un distribuidor";
    }

}
