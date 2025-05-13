/**
 * La clase Tratamiento representa el tratamiento asignado a un paciente durante su ingreso.
 * Contiene detalles del tratamiento, como nombre, dosis y frecuencia.
 */
public class Tratamiento {
    private int idTratamiento;
    private int idIngreso;
    private String nombreTratamiento;
    private String dosis;
    private String frecuencia;
    private String observaciones;

    /**
     * Constructor para crear un objeto Tratamiento con los detalles completos.
     * @param idTratamiento El ID único del tratamiento
     * @param idIngreso El ID del ingreso asociado al tratamiento
     * @param nombreTratamiento El nombre del tratamiento
     * @param dosis La dosis prescrita para el tratamiento
     * @param frecuencia La frecuencia de administración del tratamiento
     * @param observaciones Observaciones adicionales sobre el tratamiento
     */
    public Tratamiento(int idTratamiento, int idIngreso, String nombreTratamiento, String dosis, String frecuencia, String observaciones) {
        this.idTratamiento = idTratamiento;
        this.idIngreso = idIngreso;
        this.nombreTratamiento = nombreTratamiento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.observaciones = observaciones;
    }

    // Métodos getters y setters restantes...
}
