public class Medico {
    private int idMedico;
    private String nombre;
    private String apellidos;
    private String especialidad;
    private String correo;

    public Medico(int idMedico, String nombre, String apellidos, String especialidad, String correo) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.correo = correo;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getCorreo() {
        return correo;
    }
}
