package ubp.doo.factoryPersona;

public class Cliente extends Persona {

    public Cliente(String tipoDocumento, String nroDocumento, String apellido, String nombre) {
        super(tipoDocumento, nroDocumento, apellido, nombre);
    }

    @Override
    public String getTipo() {
        return "Soy un cliente";
    }
}
