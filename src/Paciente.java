/**
 * La clase Paciente representa un paciente en el sistema.
 * Contiene información personal y de contacto.
 */
public class Paciente {
    private int idPaciente;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String codigoPostal;
    private String telefono;
    private String fechaNacimiento;

    /**
     * Constructor para crear un objeto Paciente con los detalles completos.
     * @param idPaciente El ID del paciente
     * @param nombre El nombre del paciente
     * @param apellidos Los apellidos del paciente
     * @param direccion La dirección del paciente
     * @param poblacion La población del paciente
     * @param provincia La provincia del paciente
     * @param codigoPostal El código postal del paciente
     * @param telefono El teléfono de contacto del paciente
     * @param fechaNacimiento La fecha de nacimiento del paciente
     */
    public Paciente(int idPaciente, String nombre, String apellidos, String direccion, String poblacion, String provincia, String codigoPostal, String telefono, String fechaNacimiento) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método getter para obtener el ID del paciente.
     * @return El ID del paciente.
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * Método getter para obtener el nombre del paciente.
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método getter para obtener los apellidos del paciente.
     * @return Los apellidos del paciente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Método getter para obtener la dirección del paciente.
     * @return La dirección del paciente.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método getter para obtener la población del paciente.
     * @return La población del paciente.
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Método getter para obtener la provincia del paciente.
     * @return La provincia del paciente.
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Método getter para obtener el código postal del paciente.
     * @return El código postal del paciente.
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Método getter para obtener el teléfono del paciente.
     * @return El teléfono del paciente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método getter para obtener la fecha de nacimiento del paciente.
     * @return La fecha de nacimiento del paciente.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}
