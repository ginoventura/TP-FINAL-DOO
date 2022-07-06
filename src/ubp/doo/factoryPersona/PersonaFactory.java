package ubp.doo.factoryPersona;

public class PersonaFactory implements PersonaFactoryMethod {

    /**
     * 
     * 
     * @param tipoDocumento
     * @param nroDocumento
     * @param apellido
     * @param nombre
     * @param idCreacion
     * @return 
     */
    @Override
    public Persona crearPersona(String tipoDocumento, String nroDocumento, String apellido, String nombre, int idCreacion) {
        switch(idCreacion) {
            case 1:
                return new Cliente(tipoDocumento, nroDocumento, apellido, nombre);
            case 2:
                return new Distribuidor(tipoDocumento, nroDocumento, apellido, nombre);
            default:
                return null;
        }
    }   
}
