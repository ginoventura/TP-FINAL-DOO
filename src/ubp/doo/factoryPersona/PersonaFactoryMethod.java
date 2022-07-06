package ubp.doo.factoryPersona;

public interface PersonaFactoryMethod {
    public abstract Persona crearPersona(String tipoDocumento, String nroDocumento, String apellido, String nombre, int idCreacion);

}
