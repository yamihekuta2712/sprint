public class Tratamiento {
    private int idTratamiento;
    private int idIngreso;
    private String nombreTratamiento;
    private String dosis;
    private String frecuencia;
    private String observaciones;

    public Tratamiento(int idTratamiento, int idIngreso, String nombreTratamiento, String dosis, String frecuencia, String observaciones) {
        this.idTratamiento = idTratamiento;
        this.idIngreso = idIngreso;
        this.nombreTratamiento = nombreTratamiento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.observaciones = observaciones;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public int getIdIngreso() {
        return idIngreso;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public String getDosis() {
        return dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "idTratamiento=" + idTratamiento +
                ", idIngreso=" + idIngreso +
                ", nombreTratamiento='" + nombreTratamiento + '\'' +
                ", dosis='" + dosis + '\'' +
                ", frecuencia='" + frecuencia + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
