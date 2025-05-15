public class Ingreso {
    private int idIngreso;
    private String fechaIngreso;
    private String diagnostico;
    private String habitacion;
    private int idPaciente;
    private int idMedico;

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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    @Override
    public String toString() {
        return "Ingreso{" +
                "idIngreso=" + idIngreso +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", diagnostico='" + diagnostico + '\'' +
                ", habitacion='" + habitacion + '\'' +
                ", idPaciente=" + idPaciente +
                ", idMedico=" + idMedico +
                '}';
    }
}
