/**
 * La clase Ingreso representa un ingreso hospitalario de un paciente.
 * Contiene información sobre la fecha, diagnóstico, habitación, y los identificadores del paciente y del médico.
 */
public class Ingreso {
    private int idIngreso;
    private String fechaIngreso;
    private String diagnostico;
    private String habitacion;
    private int idPaciente;
    private int idMedico;

    /**
     * Constructor para crear un objeto Ingreso con todos los detalles.
     *
     * @param idIngreso El ID del ingreso.
     * @param fechaIngreso La fecha del ingreso.
     * @param diagnostico El diagnóstico del ingreso.
     * @param habitacion La habitación asignada.
     * @param idPaciente El ID del paciente ingresado.
     * @param idMedico El ID del médico responsable.
     */
    public Ingreso(int idIngreso, String fechaIngreso, String diagnostico, String habitacion, int idPaciente, int idMedico) {
        this.idIngreso = idIngreso;
        this.fechaIngreso = fechaIngreso;
        this.diagnostico = diagnostico;
        this.habitacion = habitacion;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(int idIngreso) {
        this.idIngreso = idIngreso;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
}
